-- drop table if exist
drop table emp1 cascade constraint;
drop table address1 cascade constraint;
drop table dept1 cascade constraint;


--create table dept1
create table dept1(did number primary key, dept_name varchar2(20));



--create table address1
create table address1(
add_id number primary key, 
line1 varchar2(20),
line2 varchar2(20),
city varchar2(20),
pincode number);



--create table emp1
create table emp1(
	id number,
	name varchar2(20),
	salary number,
	add_id number references address1(add_id),
	did	number references dept1(did)
);
