# Mapping
	@Entity
	@Table(name = "emp_05")
	public class Employee {
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_id_gen")
		@SequenceGenerator(name = "emp_id_gen", sequenceName = "seq_emp_05_id")
		private Integer id;
		private String name;
		private Double salary;
		@OneToOne
		private Passport passport;
	}
	
	
	@Entity
	@Table(name = "passport_08")
	public class Passport {
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passport_id_gen")
		@SequenceGenerator(name = "passport_id_gen", sequenceName = "seq_passport_08_id", allocationSize = 1, initialValue = 111)
		@Column(name = "passport_id")
		private int passportId;
		@Column(name = "passport_number", length = 13, nullable = false)
		private String passportNumber;
		@Column(name = "expiry_date")
		private Date expiryDate;
		@OneToOne
		private Employee employee;
	}


# Table created
	Hibernate: 
    
    create table emp_08 (
       id number(10,0) not null,
        name varchar2(255 char),
        salary double precision,
        passport_passport_id number(10,0),
        primary key (id)
    )
Hibernate: 
    
    create table passport_08 (
       passport_id number(10,0) not null,
        expiry_date timestamp,
        passport_number varchar2(13 char) not null,
        employee_id number(10,0),
        primary key (passport_id)
    )
	Hibernate: create sequence seq_emp_08_id start with 1 increment by  50
	Hibernate: create sequence seq_passport_08_id start with 111 increment by  1
	Hibernate: 
    
    alter table emp_08 
       add constraint FK3gso2cabshapcyibj6twv5jn1 
       foreign key (passport_passport_id) 
       references passport_08
       
       
	Hibernate: 
    alter table passport_08 
       add constraint FKkn8qhhb9t64sjqttsyc6cxe3d 
       foreign key (employee_id) 
       references emp_08
       
       
# Mapping 2
	@Entity
	@Table(name = "emp_05")
	public class Employee {
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_id_gen")
		@SequenceGenerator(name = "emp_id_gen", sequenceName = "seq_emp_05_id")
		private Integer id;
		private String name;
		private Double salary;
		@OneToOne
		private Passport passport;
	}
	
	
	@Entity
	@Table(name = "passport_08")
	public class Passport {
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passport_id_gen")
		@SequenceGenerator(name = "passport_id_gen", sequenceName = "seq_passport_08_id", allocationSize = 1, initialValue = 111)
		@Column(name = "passport_id")
		private int passportId;
		@Column(name = "passport_number", length = 13, nullable = false)
		private String passportNumber;
		@Column(name = "expiry_date")
		private Date expiryDate;
		@OneToOne(mappedBy = "passport")
		private Employee employee;
	}


# Table created
	Hibernate: 
    
    create table emp_08 (
       id number(10,0) not null,
        name varchar2(255 char),
        salary double precision,
        passport_passport_id number(10,0),
        primary key (id)
    )
Hibernate: 
    
    create table passport_08 (
       passport_id number(10,0) not null,
        expiry_date timestamp,
        passport_number varchar2(13 char) not null,
        employee_id number(10,0),
        primary key (passport_id)
    )
	Hibernate: create sequence seq_emp_08_id start with 1 increment by  50
	Hibernate: create sequence seq_passport_08_id start with 111 increment by  1
	Hibernate: 
    
    alter table emp_08 
       add constraint FK3gso2cabshapcyibj6twv5jn1 
       foreign key (passport_passport_id) 
       references passport_08
       
       
	Hibernate: 
    alter table passport_08 
       add constraint FKkn8qhhb9t64sjqttsyc6cxe3d 
       foreign key (employee_id) 
       references emp_08
       
       
       