package cn.itedus.lottery.domain.strategy.service.draw;

import cn.itedus.lottery.domain.strategy.model.req.DrawReq;
import cn.itedus.lottery.domain.strategy.model.res.DrawResult;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/5/2
 * @Time: 21:04
 * @Description:
 */
public interface IDrawExec {
    /**
     * 抽奖方法
     * @param req 抽奖参数；用户ID、策略ID
     * @return    中奖结果
     */
    DrawResult doDrawExec(DrawReq req);
}
