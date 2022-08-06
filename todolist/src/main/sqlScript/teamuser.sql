create table if not exists `team_user`
(
    `id`        int primary key auto_increment not null,
    `user_id`   int,
    `user_type` int,
    `remind`    int
) engine = InnoDB
  charset = utf8mb4