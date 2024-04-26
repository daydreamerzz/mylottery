package cn.itedus.lottery.rpc.res;

import cn.itedus.lottery.rpc.dto.ActivityDto;
import cn.itedus.mylottery.common.Result;

import java.io.Serializable;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/25
 * @Time: 20:02
 * @Description:
 */
public class ActivityRes implements Serializable {
    private Result result;
    private ActivityDto activity;

    public ActivityRes(){
    }
    public ActivityRes(Result result){
        this.result = result;
    }
    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activity = activity;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivity() {
        return activity;
    }

    public void setActivity(ActivityDto activity) {
        this.activity = activity;
    }
}
