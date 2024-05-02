package cn.itedus.lottery.domain.strategy.model.res;

import cn.itedus.lottery.domain.strategy.model.vo.DrawAwardInfo;
import cn.itedus.mylottery.common.Constants;
import lombok.Data;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/5/2
 * @Time: 21:06
 * @Description:
 */

@Data
public class DrawResult {
    /**
     * 用户ID
     */
    private String uId;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 中奖状态：0未中奖、1已中奖、2兜底奖 Constants.DrawState
     */
    private Integer drawState = Constants.DrawState.FAIL.getCode();

    /**
     * 中奖奖品信息
     */
    private DrawAwardInfo drawAwardInfo;

    public DrawResult() {
    }

    public DrawResult(String uId, Long strategyId, Integer drawState) {
        this.uId = uId;
        this.strategyId = strategyId;
        this.drawState = drawState;
    }

    public DrawResult(String uId, Long strategyId, Integer drawState, DrawAwardInfo drawAwardInfo) {
        this.uId = uId;
        this.strategyId = strategyId;
        this.drawState = drawState;
        this.drawAwardInfo = drawAwardInfo;
    }
}
