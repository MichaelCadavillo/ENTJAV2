package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;
import model.Address;

public class AccessEmployee {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("Michelle The Walking API with Paul The Walker");
		employee.setDepartment("SM Department Store");
		employee.setPosition("Manager");
		
		Address homeAddress = new Address();
		homeAddress.setHouseNumber("143");
		homeAddress.setStreet("intonation");
		homeAddress.setCity("SM East Ortigas");
		homeAddress.setZip(1900);
		
		Address billingAddress = new Address();
		billingAddress.setHouseNumber("143");
		billingAddress.setStreet("Hindi");
		billingAddress.setCity("SM East Ortigas");
		billingAddress.setZip(1900);
		
		Address shippingAddress = new Address();
		shippingAddress.setHouseNumber("143");
		shippingAddress.setStreet("ko");
		shippingAddress.setCity("SM East Ortigas");
		shippingAddress.setZip(1900);
		
		Address officeAddress = new Address();
		officeAddress.setHouseNumber("143");
		officeAddress.setStreet("ehhhh");
		officeAddress.setCity("SM East Ortigas");
		officeAddress.setZip(1900);
		
		//Make the Employee own the Address
		employee.setAddress(homeAddress);
		employee.setAddress(billingAddress);
		employee.setAddress(shippingAddress);
		employee.setAddress(officeAddress);
		
		//for hibernate operations
		SessionFactory sessionFactory = 
			new Configuration().configure().buildSessionFactory();
			
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			
			if (session != null) {
				transaction = session.beginTransaction();
				session.save(employee); //insert into sql statement equivalent
				transaction.commit();
			} else {
				System.err.println("session is null.");
			}			
		} catch (Exception e) {
			transaction.rollback();
		}		

	}

}
