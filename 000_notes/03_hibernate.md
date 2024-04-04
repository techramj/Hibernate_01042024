# Hibernate
  Java

  Emp emp = new Emp();                        EMp Table             
   id                                   id          name        salary
   name
   salary


DB1
insert into emp(id=1, name='jack', salary=1000)


Db2
insert into emp(id,name,salary) values (1,'jack',1000);


DB: we cannot store the object directly
   

Hibernate 
    ORM 
    open source
    


JDBC

# Hibernate  Architecture
1. Configuration

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

2. SessionFactory
   It is thread safe object.
   It is a heavy weight object.

        SessionFactory sf = cfg.buildSessionFactory();

3. Session
    Session is light weight.
    To perform any crud operation, we need session object
    it is not thread safe.

       Session session = sf.openSession();

    note: close the session object after using