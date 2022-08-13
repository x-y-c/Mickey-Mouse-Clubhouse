create table if not exists `user`
(
    `id`       int primary key auto_increment,
    `username` varchar(40),
    `password` varchar(100),
    `type`     int,
    `mobile`   varchar(15),
    `wxid`     varchar(100),
    `email`    varchar(100),
    `enable` int default 1,
    `createtime` timestamp  default current_timestamp,
    `updatetime` timestamp
    ) engine = InnoDB
  default charset = utf8mb4