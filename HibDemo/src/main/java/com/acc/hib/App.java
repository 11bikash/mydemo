package com.acc.hib;


import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Configuration configuration =new Configuration().configure();
    	StandardServiceRegistryBuilder registry=new StandardServiceRegistryBuilder();
    	registry.applySettings(configuration.getProperties());
    	SessionFactory sessionFactory=configuration.buildSessionFactory(registry.build());
    	System.out.println("Successfuly executed /connected to MySQL Database");
    	Employee employee=new Employee();
    	//employee.setEid(13);
    	employee.setName("Rohan");
    	employee.setSalary(35000.00);
    	Session session=sessionFactory.openSession();
    	org.hibernate.Transaction tx=session.beginTransaction();
    	//Create 
    	
    	session.persist(employee);//save the employee record
    	//Updating the record
    	//Employee e=(Employee)session.get(Employee.class, 13);
    	/*e.setName("Sumit");
    	e.setSalary(40000.00);
    	session.save(e);
    	
    	*/
    	//session.delete(e);
    	tx.commit();
    	session.close();
    	
		//Deleting the record
    	
			
			
	
    }
}
