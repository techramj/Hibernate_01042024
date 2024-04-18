1. @Entity
2. @Id
3. @Table
4. @Column
5. @GeneratedValue

        when we use generateValue, hibernate will create hibernate_sequence sequnce.

6. @SequenceGenerator

7. @Embedded
8. @AttributeOverrides(value = {
			@AttributeOverride(name="city" , column = @Column(name="perm_add_city")),
			@AttributeOverride(name="pincode" , column = @Column(name="perm_add_pincode")),
	})

9. @Embeddble
10. @Transient
11. @UpdateTimestamp  : org.hibernate.annotations.UpdateTimestamp
12. @CreationTimestamp: org.hibernate.annotations.CreationTimestamp


Mapping
one to One
  Employee  -> Passport

One to Many/ Many to One
Many to Many



Emp
  id
  name
  salary
  address:Address
    city
    pincode

id  name  salary  city    pincode


Emp
  id
  name
  salary

@Embedded
  address1:Address
    city
    pincode

@Embedded
 @AttributeOverrides(value = {
			@AttributeOverride(name="city" , column = @Column(name="add2_city")),
			@AttributeOverride(name="pincode" , column = @Column(name="add2_pincode")),
	})
 address2:Address
    city
    pincode

id  name  salary city pincode add2_city add2_pincode.


@Table(name="emp")
Employee
  id
  name
  salary


select e from Employee  => HQL

select * from emp; =>nativeSQl

select * from (select * from emp order by 1 desc) where rownum<=5;

HQL   =>   sql