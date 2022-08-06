create table if not exists `team`
(
    `id`         int primary key auto_increment not null,
    `team_name`   varchar(50),
    `describe`   varchar(200),
    `theme_info` varchar(300),
    `theme`      int
) engine = InnoDB
  charset = utf8mb4