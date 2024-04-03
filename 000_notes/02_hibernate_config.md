# create hibernate.cfg.xml file
 1. create xml file in resources folder.

        <?xml version = "1.0" encoding = "utf-8"?>
        <!DOCTYPE hibernate-configuration SYSTEM 
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
        <hibernate-configuration>
            <session-factory>
                <property name="connection.driver_class">oracle.jdbc.driver.OracleDriver</property>
                <property name="connection.url">jdbc:oracle:thin:@localhost:1522:xe</property>
                <property name="connection.username">hr</property>
                <property name="connection.password">hr</property>
                <property name="dialect">org.hibernate.dialect.OracleDialect</property>
            </session-factory>

        </hibernate-configuration>