package cn.itedus.lottery.domain.strategy.model.req;

import lombok.Data;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/5/2
 * @Time: 21:05
 * @Description:
 */

@Data
public class DrawReq {
    // 用户ID
    private String uId;

    // 策略ID
    private Long strategyId;

    public DrawReq() {
    }

    public DrawReq(String uId, Long strategyId) {
        this.uId = uId;
        this.strategyId = strategyId;
    }
}
