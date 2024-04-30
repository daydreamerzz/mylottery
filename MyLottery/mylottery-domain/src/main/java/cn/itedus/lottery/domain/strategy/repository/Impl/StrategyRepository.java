package cn.itedus.lottery.domain.strategy.repository.Impl;

import cn.itedus.lottery.domain.strategy.model.aggregates.StrategyRich;
import cn.itedus.lottery.domain.strategy.repository.IStrategyRepository;
import cn.itedus.lottery.infrastructure.dao.IAwardDao;
import cn.itedus.lottery.infrastructure.dao.IStrategyDao;
import cn.itedus.lottery.infrastructure.dao.IStrategyDetailDao;
import cn.itedus.lottery.infrastructure.po.Award;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/30
 * @Time: 22:08
 * @Description:
 */
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;


    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        return null;
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return null;
    }

    @Override
    public List<String> queryNoStockStrategyAwardList(Long strategyId) {
        return null;
    }

    @Override
    public boolean deductStock(Long strategyId, String awardId) {
        return false;
    }
}
