-- 系统-更新记录信息表
CREATE TABLE IF NOT EXISTS `sys_update_log`
(
    `id`          bigint       NOT NULL AUTO_INCREMENT COMMENT '唯一ID',
    `create_time` datetime     NOT NULL COMMENT '创建时间',
    `update_time` datetime     NOT NULL COMMENT '最后更新时间',
    `version`     varchar(63)  NOT NULL DEFAULT '' COMMENT '数据库版本',
    `note`        varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
    UNIQUE (`id`)
);

-- 组织架构-用户表
CREATE TABLE IF NOT EXISTS `org_user`
(
    `id`          bigint       NOT NULL AUTO_INCREMENT COMMENT '唯一ID',
    `create_time` datetime     NOT NULL COMMENT '创建时间',
    `update_time` datetime     NOT NULL COMMENT '最后更新时间',
    `name`        varchar(63)  NOT NULL DEFAULT '' COMMENT '名称',
    `pwd`         varchar(255) NOT NULL DEFAULT '' COMMENT '密码',
    UNIQUE (`id`)
);