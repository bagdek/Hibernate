package com.project.hibernetproject1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App      //main class
{
	//main method
    public static void main( String[] args ) {
    System.out.println( "project started" );
    Configuration cfg=new Configuration();  //Creating a new hibernet Configuration
    cfg.configure("hibernet.cfg.xml");     //hibernet configuration from the Hibernate.cfg.xml file
    
    SessionFactory factory = cfg.buildSessionFactory(); //hibernet SessionFactory(using cfg)
    Customer c = new Customer();            //Creating a new Customer entity object
    
 //Setting values for the Customer entity
    c.setId(101);
    c.setName("Pooja");
    
    Product p=new Product();  //Creating a new Product entity object and setting values
    p.setPid(1001);  
    p.setPname("Toothbrush");
    p.setPprice(50);
    
   //one to one Mapping     
     c.setProd(p); //Establish a one-to-one mapping between Customer and Product
    //session opening
    Session session=factory.openSession(); 
    
    //starting the session
    Transaction tx=session.beginTransaction();//Begin a new transaction
    session.save(c);   
    session.save(p);
    tx.commit();   //Commit the transaction
    session.close(); //session closed
    factory.close(); //factory closed
 }
}
