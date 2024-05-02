package cn.itedus.lottery.domain.strategy.model.vo;

import lombok.Data;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/5/2
 * @Time: 21:07
 * @Description:
 */
@Data
public class DrawAwardInfo {
    /**
     * 奖品ID
     */
    private String rewardId;

    /**
     * 奖品名称
     */
    private String awardName;

    public DrawAwardInfo() {
    }

    public DrawAwardInfo(String rewardId, String awardName) {
        this.rewardId = rewardId;
        this.awardName = awardName;
    }
}
