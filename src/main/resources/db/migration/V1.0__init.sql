
DROP TABLE IF EXISTS `hotel_user`;
CREATE TABLE `hotel_user`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `phone`           varchar(20)  NOT NULL UNIQUE COMMENT '电话号码.',
    `user_name`       varchar(20)  NOT NULL COMMENT '用户名.',
    `password`        varchar(32)  NOT NULL COMMENT '密码',
    `id_number`       varchar(18)  COMMENT '身份证号',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户表';


DROP TABLE IF EXISTS `hotel_room_type`;
CREATE TABLE `hotel_room_type`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `name`            varchar(50)  NOT NULL COMMENT '房型名称',
    `price`           int          NOT NULL COMMENT '价格',
    `beds`            int          NOT NULL COMMENT '床位数',
    `introduction`    varchar(200) NOT NULL COMMENT '房间介绍',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='房型表';

DROP TABLE IF EXISTS `hotel_room`;
CREATE TABLE `hotel_room`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `room_type_id`    int(11)      NOT NULL COMMENT '房型',
    `room_number`     varchar(50)  NOT NULL COMMENT '房间号.',
    `remark`          varchar(300) COMMENT '详细信息.',
    `home_state`      varchar(40)  COMMENT '房间状态',
    PRIMARY KEY (`id`),
    FOREIGN KEY (`room_type_id`) REFERENCES hotel_room_type(`id`) ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='房间表';


DROP TABLE IF EXISTS `hotel_order`;
CREATE TABLE `hotel_order`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `user_id`         int(11)      NOT NULL COMMENT '用户id' ,
    `order_note`      varchar(100) COMMENT '订单备注' ,
    `created_time`    timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `room_type_id`    int(11)      NOT NULL COMMENT '所订房型',
    `room_id`         int(11)      COMMENT '预定房间号.',
    `check_in_time`   date         COMMENT '入住时间',
    `order_state`     int(11)       COMMENT '订单状态' ,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='订单表';

DROP TABLE IF EXISTS `hotel_comment`;
CREATE TABLE `hotel_comment`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `uer_id`          int(11)      NOT NULL COMMENT '留言用户' ,
    `comment_content` mediumtext NOT NULL COMMENT '留言内容' ,
    `comment_time`    timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '留言时间',
     PRIMARY KEY (`id`),
      FOREIGN KEY (`uer_id`) REFERENCES hotel_user(`id`) ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='留言表';

DROP TABLE IF EXISTS `hotel_administrator`;
CREATE TABLE `hotel_administrator`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `name`            varchar(50)  NOT NULL COMMENT '用户名',
    `password`        varchar(50)  NOT NULL COMMENT '密码',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='管理员表';


DROP TABLE IF EXISTS `hotel_permission`;
CREATE TABLE `hotel_permission`
(
    `id`              int(11)      NOT NULL AUTO_INCREMENT,
    `name`            varchar(50)  NOT NULL COMMENT '权限名称',
    `introduction`    varchar(200) NOT NULL COMMENT '权限描述',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='权限表';

DROP TABLE IF EXISTS `check_in_person`;
CREATE TABLE `check_in_person`
(
    `id`                    int(11)      NOT NULL AUTO_INCREMENT,
    `name`                  varchar(50)  NOT NULL COMMENT '入住人姓名',
    `id_number`             varchar(18)  NOT NULL COMMENT '身份证号',
    `room_id`               int(11)      COMMENT '房间id',
    `order_id`              int(11)      COMMENT '订单id',
    `check_in_person_phone` varchar(20)  COMMENT '入住人电话号码.',
    PRIMARY KEY (`id`),
    FOREIGN KEY (`room_id`) REFERENCES hotel_room(`id`) ON DELETE CASCADE,
    FOREIGN KEY (`order_id`) REFERENCES hotel_order(`id`) ON DELETE CASCADE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='入住人信息表';

# 启动外键约束.
SET FOREIGN_KEY_CHECKS = 1;

