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

id  name  salary city pincode add2_city add2_pincode