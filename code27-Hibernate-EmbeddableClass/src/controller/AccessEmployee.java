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
		homeAddress.setStreet("Hindi ko alam ehhhh(intonation)");
		homeAddress.setCity("SM East Ortigas");
		homeAddress.setZip(1900);
		
		//Make the Employee own the Address
		employee.setAddress(homeAddress);
		
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
