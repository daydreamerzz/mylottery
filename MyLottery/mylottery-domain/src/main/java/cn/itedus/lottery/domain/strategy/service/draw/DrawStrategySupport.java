package cn.itedus.lottery.domain.strategy.service.draw;

import cn.itedus.lottery.domain.strategy.repository.IStrategyRepository;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/30
 * @Time: 21:49
 * @Description:
 */
public class DrawStrategySupport extends DrawConfig{

    @Resource
    protected IStrategyRepository strategyRepository;


}
