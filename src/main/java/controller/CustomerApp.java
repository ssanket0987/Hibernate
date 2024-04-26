package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Address;
import model.Customer;
import model.Employee;
import model.Task;

public class CustomerApp {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
        EntityManager em = factory.createEntityManager();

        Customer customerObj = new Customer();
        Address addressObj = new Address();
        addressObj.setCityName("Kolkata");
        addressObj.setCountryName("India");
        addressObj.setPincode(70009030L);
        addressObj.setState("Wb");

        customerObj.setCustomerName("xyz");
        customerObj.setCustomerPhone(785595L);
        customerObj.setEmailId("xy@gmail.com");
        customerObj.setAddress(addressObj);

        Task taskObj = new Task();
        taskObj.setTaskName("Developing");
        taskObj.setTaskLocation("Work from home");

        Employee employeeObj = new Employee();
        employeeObj.setEmpName("Mayur");
        employeeObj.setEmpSalary(50070.0);
        employeeObj.setEmpEmail("Mayur@example.com");
        employeeObj.setTask(taskObj);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(customerObj);
        em.persist(employeeObj);

        transaction.commit();
        System.out.println("Objects saved in the persistence context area");

       
    }
}
