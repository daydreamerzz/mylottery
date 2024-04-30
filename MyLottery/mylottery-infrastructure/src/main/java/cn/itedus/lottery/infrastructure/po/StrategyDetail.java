package cn.itedus.lottery.infrastructure.po;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/30
 * @Time: 21:55
 * @Description:
 */

@Data
public class StrategyDetail {
    /**
     * 自增ID
     */
    private String id;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 奖品ID
     */
    private String awardId;

    /**
     * 奖品库存
     */
    private Integer awardCount;

    /**
     * 奖品剩余库存
     */
    private Integer awardSurplusCount;

    /**
     * 中奖概率
     */
    private BigDecimal awardRate;

    /**
     * 创建时间
     */
    private String createTime;
}
