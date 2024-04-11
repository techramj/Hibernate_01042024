# Table created
	Hibernate: create sequence seq_passport_05_id start with 1 increment by  50
	Hibernate: create table emp_05 (id number(10,0) not null, name varchar2(255 char), salary double precision, passport_passport_id number(10,0), primary key (id))
	Hibernate: create table passport_05 (passport_id number(10,0) not null, expiry_date timestamp, passport_number varchar2(13 char) not null, primary key (passport_id))
	Hibernate: alter table emp_05 add constraint FK9u8bvq2md8r7ayigjp1lmjmyl foreign key (passport_passport_id) references passport_05
	
	Insert query:
	Hibernate: select seq_passport_05_id.nextval from dual
	Hibernate: insert into passport_05 (expiry_date, passport_number, passport_id) values (?, ?, ?)
	Hibernate: select seq_emp_05_id.nextval from dual
	Hibernate: insert into emp_05 (name, passport_passport_id, salary, id) values (?, ?, ?, ?)
