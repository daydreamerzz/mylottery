-- auto-generated definition
CREATE TABLE activity
(
    id            BIGINT AUTO_INCREMENT COMMENT '自增ID',
    activityId    BIGINT       NULL COMMENT '活动ID',
    activityName  VARCHAR(64)  NOT NULL COMMENT '活动名称',
    activityDesc  VARCHAR(128) NULL COMMENT '活动描述',
    beginDateTime DATETIME     NOT NULL COMMENT '开始时间',
    endDateTime   DATETIME     NOT NULL COMMENT '结束时间',
    stockCount    INT          NOT NULL COMMENT '库存',
    takeCount     INT          NULL COMMENT '每人可参与次数',
    state         INT          NULL COMMENT '活动状态：编辑、提审、撤审、通过、运行、拒绝、关闭、开启',
    creator       VARCHAR(64)  NOT NULL COMMENT '创建人',
    createTime    DATETIME     NOT NULL COMMENT '创建时间',
    updateTime    DATETIME     NOT NULL COMMENT '修改时间',
    CONSTRAINT activity_id_uindex
        UNIQUE (id)
)
    COMMENT '活动配置';

ALTER TABLE activity
    ADD PRIMARY KEY (id);

-- auto-generated definition
CREATE TABLE award
(
    id           BIGINT(11) AUTO_INCREMENT COMMENT '自增ID'
        PRIMARY KEY,
    awardId      BIGINT                             NULL COMMENT '奖品ID',
    awardType    INT(4)                             NULL COMMENT '奖品类型（文字描述、兑换码、优惠券、实物奖品暂无）',
    awardCount   INT                                NULL COMMENT '奖品数量',
    awardName    VARCHAR(64)                        NULL COMMENT '奖品名称',
    awardContent VARCHAR(128)                       NULL COMMENT '奖品内容「文字描述、Key、码」',
    createTime   DATETIME DEFAULT CURRENT_TIMESTAMP NULL COMMENT '创建时间',
    updateTime   DATETIME DEFAULT CURRENT_TIMESTAMP NULL COMMENT 'updateTime'
)
    COMMENT '奖品配置';

-- auto-generated definition
CREATE TABLE strategy
(
    id           BIGINT(11) AUTO_INCREMENT COMMENT '自增ID'
        PRIMARY KEY,
    strategyId   BIGINT(11)   NOT NULL COMMENT '策略ID',
    strategyDesc VARCHAR(128) NULL COMMENT '策略描述',
    strategyMode INT(4)       NULL COMMENT '策略方式「1:单项概率、2:总体概率」',
    grantType    INT(4)       NULL COMMENT '发放奖品方式「1:即时、2:定时[含活动结束]、3:人工」',
    grantDate    DATETIME     NULL COMMENT '发放奖品时间',
    extInfo      VARCHAR(128) NULL COMMENT '扩展信息',
    createTime   DATETIME     NULL COMMENT '创建时间',
    updateTime   DATETIME     NULL COMMENT '修改时间',
    CONSTRAINT strategy_strategyId_uindex
        UNIQUE (strategyId)
)
    COMMENT '策略配置';

-- auto-generated definition
CREATE TABLE strategy_detail
(
    id         BIGINT(11) AUTO_INCREMENT COMMENT '自增ID'
        PRIMARY KEY,
    strategyId BIGINT(11)    NOT NULL COMMENT '策略ID',
    awardId    BIGINT(11)    NULL COMMENT '奖品ID',
    awardCount INT           NULL COMMENT '奖品数量',
    awardRate  DECIMAL(5, 2) NULL COMMENT '中奖概率',
    createTime DATETIME      NULL COMMENT '创建时间',
    updateTime DATETIME      NULL COMMENT '修改时间'
)
    COMMENT '策略明细';
