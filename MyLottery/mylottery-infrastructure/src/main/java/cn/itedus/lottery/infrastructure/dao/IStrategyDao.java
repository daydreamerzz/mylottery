package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/30
 * @Time: 22:33
 * @Description:
 */
@Mapper
public interface IStrategyDao {

    Strategy queryStrategy(Long strategyId);
}
