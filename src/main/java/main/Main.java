package main;
//HIBERNATE
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import customers.CustomerRepository;

//01 bean
//import bean.SimpleBean;

//HIBERNATE
//import domain.Employee;

public class Main {

	public static void main(String[] args) {
		
		//HIBERNATE
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		
//		Employee employee = new Employee();
//		employee.setName("Dzons");
//		
//		entityManager.getTransaction().begin();
//		entityManager.persist(employee);
//		entityManager.getTransaction().commit();
//		
//		entityManager.close();
//		entityManagerFactory.close();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		//01 bean
//		SimpleBean simpleBean = context.getBean("simpleBean", SimpleBean.class);
//		simpleBean.doSomething();
		
		//02 customers
		CustomerRepository customerRepository = context.getBean("customerRepository", CustomerRepository.class);
		System.out.println(customerRepository.getCustomerName(34L));
		
		
	}

}
