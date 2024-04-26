package cn.itedus.lottery.rpc;

import cn.itedus.lottery.rpc.req.ActivityReq;
import cn.itedus.lottery.rpc.res.ActivityRes;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/25
 * @Time: 19:59
 * @Description:
 */
public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}
