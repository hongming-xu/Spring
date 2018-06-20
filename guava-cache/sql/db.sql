create  database guava_cache default character set=utf8;

CREATE TABLE `data_dic` (
  `id` bigint(20) NOT NULL COMMENT '服务器停用类型id',
  `description` varchar(255) DEFAULT NULL COMMENT '服务器停用类型对应的描述'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `guava_cache`.`data_dic` (`id`, `description`) VALUES ('1', '硬盘坏了');
INSERT INTO `guava_cache`.`data_dic` (`id`, `description`) VALUES ('2', '电池坏了');
INSERT INTO `guava_cache`.`data_dic` (`id`, `description`) VALUES ('3', '内存条坏了');

