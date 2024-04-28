package cn.itedus.lottery.rpc.req;

import java.io.Serializable;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/25
 * @Time: 20:01
 * @Description:
 */
public class ActivityReq implements Serializable {
    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
