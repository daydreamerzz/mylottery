CREATE DATABASE lottery_01;

-- auto-generated definition
CREATE TABLE user_take_activity
(
    id           BIGINT    NULL,
    uId          TINYTEXT  NULL,
    takeId       BIGINT    NULL,
    activityId   BIGINT    NULL,
    activityName TINYTEXT  NULL,
    takeDate     TIMESTAMP NULL,
    takeCount    INT       NULL,
    UUID         TINYTEXT  NULL,
    createTime   TIMESTAMP NULL,
    updateTime   TIMESTAMP NULL
)
    COMMENT '用户参与活动记录表';

-- auto-generated definition
CREATE TABLE user_take_activity_count
(
    id         BIGINT    NULL,
    uId        TINYTEXT  NULL,
    activityId BIGINT    NULL,
    totalCount INT       NULL,
    leftCount  INT       NULL,
    createTime TIMESTAMP NULL,
    updateTime TIMESTAMP NULL
)
    COMMENT '用户活动参与次数表';

-- auto-generated definition
CREATE TABLE user_strategy_export_001(id           BIGINT     NULL,uId          MEDIUMTEXT NULL,activityId   BIGINT     NULL,orderId      BIGINT     NULL,strategyId   BIGINT     NULL,strategyType INT        NULL,grantType    INT        NULL,grantDate    TIMESTAMP  NULL,grantState   INT        NULL,awardId      BIGINT     NULL,awardType    INT        NULL,awardName    MEDIUMTEXT NULL,awardContent MEDIUMTEXT NULL,UUID         MEDIUMTEXT NULL,createTime   TIMESTAMP  NULL,updateTime   TIMESTAMP  NULL) COMMENT '用户策略计算结果表';
CREATE TABLE user_strategy_export_002(id           BIGINT     NULL,uId          MEDIUMTEXT NULL,activityId   BIGINT     NULL,orderId      BIGINT     NULL,strategyId   BIGINT     NULL,strategyType INT        NULL,grantType    INT        NULL,grantDate    TIMESTAMP  NULL,grantState   INT        NULL,awardId      BIGINT     NULL,awardType    INT        NULL,awardName    MEDIUMTEXT NULL,awardContent MEDIUMTEXT NULL,UUID         MEDIUMTEXT NULL,createTime   TIMESTAMP  NULL,updateTime   TIMESTAMP  NULL) COMMENT '用户策略计算结果表';
CREATE TABLE user_strategy_export_003(id           BIGINT     NULL,uId          MEDIUMTEXT NULL,activityId   BIGINT     NULL,orderId      BIGINT     NULL,strategyId   BIGINT     NULL,strategyType INT        NULL,grantType    INT        NULL,grantDate    TIMESTAMP  NULL,grantState   INT        NULL,awardId      BIGINT     NULL,awardType    INT        NULL,awardName    MEDIUMTEXT NULL,awardContent MEDIUMTEXT NULL,UUID         MEDIUMTEXT NULL,createTime   TIMESTAMP  NULL,updateTime   TIMESTAMP  NULL) COMMENT '用户策略计算结果表';
CREATE TABLE user_strategy_export_004(id           BIGINT     NULL,uId          MEDIUMTEXT NULL,activityId   BIGINT     NULL,orderId      BIGINT     NULL,strategyId   BIGINT     NULL,strategyType INT        NULL,grantType    INT        NULL,grantDate    TIMESTAMP  NULL,grantState   INT        NULL,awardId      BIGINT     NULL,awardType    INT        NULL,awardName    MEDIUMTEXT NULL,awardContent MEDIUMTEXT NULL,UUID         MEDIUMTEXT NULL,createTime   TIMESTAMP  NULL,updateTime   TIMESTAMP  NULL) COMMENT '用户策略计算结果表';
