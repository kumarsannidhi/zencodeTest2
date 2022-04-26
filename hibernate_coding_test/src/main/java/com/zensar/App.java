package com.zensar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.zensar.bean.Address;
import com.zensar.bean.BankAccount;
import com.zensar.bean.Employee;
import com.zensar.bean.Skill;
import com.zensar.util.*;

public class App {
	public static void loadTesting() {
// write code here to load employee object
		Address address = new Address();
		address.setCityName("ELURU");
		address.setPinCode("534406");
		BankAccount account = new BankAccount();
		account.setAccountId("12345678909876");
		Skill skill = new Skill();
		skill.setSkilllevel(4);
		skill.setSkillName("SQL");
		Employee employee = new Employee();
		employee.setEmployeeId(101);
		employee.setName("KUMAR");
		employee.setBasicSalary(32000.10);
		employee.setAddress(address);
		employee.setAccount(account);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	public static void insertTesting() {
// write the code here to persist employee object



    	EntityManager em = com.zensar.util.JPAUtil.createEntityManager("PU");
    	Employee employee = em.find(Employee.class, 101);
    	System.out.println(employee);



    	JPAUtil.shutDown();

	}

	public static void main(String[] args) {
		loadTesting();
	}
}
