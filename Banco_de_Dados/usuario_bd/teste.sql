create table teste (
	data date,
	data_lim date
);

insert into teste
(data)
values
('2020-01-01');

update teste set data_lim=data+ INTERVAL'2 days';

select * from teste;
