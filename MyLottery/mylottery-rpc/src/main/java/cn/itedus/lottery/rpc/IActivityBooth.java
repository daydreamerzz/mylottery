package cn.itedus.lottery.rpc;

import cn.itedus.lottery.rpc.req.ActivityReq;
import cn.itedus.lottery.rpc.res.ActivityRes;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/25
 * @Time: 19:59
 * @Description:
 * 1.创建活动
 * 2.更新活动
 * 3.查询活动
 */
public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);
}
