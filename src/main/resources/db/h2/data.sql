-- 系统初始化版本
insert into `sys_update_log`(create_time, update_time, version, note)
select now(), now(), '1.0.250308.1', '系统初始化'
where not exists(select id from `sys_update_log` where id = 1);

-- 管理员
insert into `org_user`(create_time, update_time, name, pwd)
select now(), now(), 'kami', '88888888'
where not exists(select id from `org_user` where id = 1);