package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version 1.0
 * @auther wpl
 * @Data: 2024/4/30
 * @Time: 22:34
 * @Description:
 */

@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);
}
