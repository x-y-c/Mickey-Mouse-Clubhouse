create table if not exists `user`
(
    `id`       int primary key auto_increment,
    `username` varchar(40),
    `password` varchar(100),
    `type`     int,
    `mobile`   varchar(15),
    `wxid`     varchar(100),
    `email`    varchar(100)
) engine = InnoDB
  default charset = utf8mb4