package main;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.SimpleBean;
import domain.Employee;

public class Main {

	public static void main(String[] args) {
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
		SimpleBean simpleBean = context.getBean("simpleBean", SimpleBean.class);
		simpleBean.doSomething();
	}

}
