create table if not exists `todolist`
(
    `id`        int primary key auto_increment not null,
    `main_id`    int,
    `user_id`   int                            not null,
    `content`   varchar(300),
    `begin_time` timestamp,
    `end_time`   timestamp,
    `level`     int,
    `remind`    int,
    `teamid`    int
) engine = InnoDB
  charset = utf8mb4