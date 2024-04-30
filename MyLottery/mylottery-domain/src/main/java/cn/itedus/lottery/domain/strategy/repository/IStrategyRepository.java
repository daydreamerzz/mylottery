package cn.itedus.lottery.domain.strategy.repository;

import cn.itedus.lottery.domain.strategy.model.aggregates.StrategyRich;
import cn.itedus.lottery.infrastructure.po.Award;

import java.util.List;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/30
 * @Time: 21:51
 * @Description:
 * 为抽奖策略提供数据支持，便于查询策略配置，奖品信息，将数据库查询放在这里，与抽奖模版分开
 * 防止语法过于膨胀
 */
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);

}
