package cn.itedus.lottery.domain.strategy.model.aggregates;

import cn.itedus.lottery.infrastructure.po.Strategy;
import cn.itedus.lottery.infrastructure.po.StrategyDetail;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/30
 * @Time: 22:04
 * @Description:
 */

@Data
public class StrategyRich {

    // 策略ID
    private Long strategyId;
    // 策略配置
    private Strategy strategy;
    // 策略明细
    private List<StrategyDetail> strategyDetailList;

    public StrategyRich() {
    }

    public StrategyRich(Long strategyId, Strategy strategy, List<StrategyDetail> strategyDetailList) {
        this.strategyId = strategyId;
        this.strategy = strategy;
        this.strategyDetailList = strategyDetailList;
    }
}
