package cn.itedus.lottery.domain.strategy.service.algorithm;

import cn.itedus.lottery.domain.strategy.model.vo.AwardRateInfo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/28
 * @Time: 21:55
 * @Description:
 * 两种抽奖策略共用的算法逻辑
 */
public class BaseAlgorithm implements IDrawAlgorithm{
    // 斐波那契散列增量，逻辑：黄金分割点：(√5 - 1) / 2 = 0.6180339887，Math.pow(2, 32) * 0.6180339887 = 0x61c88647
    private final int HASH_INCREMENT = 0x61c88647;

    // 数组初始化长度
    private final int RATE_TUPLE_LENGTH = 128;

    // 存放概率与奖品对应的散列结果，strategyId -> rateTuple
    protected Map<Long, String[]> rateTupleMap = new ConcurrentHashMap<>();

    // 奖品区间概率值，strategyId -> [awardId->begin、awardId->end]
    protected Map<Long, List<AwardRateInfo>> awardRateInfoMap = new ConcurrentHashMap<>();

    @Override
    public void initRateTuple(Long strategyId, List<AwardRateInfo> awardRateInfoList) {
        //先将那个策略的那个奖品信息进行保存
        awardRateInfoMap.put(strategyId,awardRateInfoList);

        String[] rateTuple = rateTupleMap.computeIfAbsent(strategyId, k -> new String[RATE_TUPLE_LENGTH]);
        int cursorVal = 0;
        for (AwardRateInfo awardRateInfo : awardRateInfoList) {
            int rateVal = awardRateInfo.getAwardRate().multiply(new BigDecimal(100)).intValue();

            // 循环填充概率范围值
            for (int i = cursorVal + 1; i <= (rateVal + cursorVal); i++) {
                rateTuple[hashIdx(i)] = awardRateInfo.getAwardId();
            }

            cursorVal += rateVal;

    }


        /**
         * 斐波那契（Fibonacci）散列法，计算哈希索引下标值
         *
         * @param val 值
         * @return 索引
         */
        protected int hashIdx(int val) {
            int hashCode = val * HASH_INCREMENT + HASH_INCREMENT;
            return hashCode & (RATE_TUPLE_LENGTH - 1);
        }
    @Override
    public boolean isExistRateTuple(Long strategyId) {
        }
        return false;
    }

    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {
        return null;
    }
}
