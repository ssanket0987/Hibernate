package controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Order;
import model.Product;
import ultility.DBUtil;


public class ProductApp {

	public static void main(String[] args) {
		
		//get the object of EntityManager
		EntityManager em=DBUtil.getConnect();
		//getting the entity transaction object
		EntityTransaction et=em.getTransaction();
		//starting transaction
		et.begin();
		//creating first object of product
		Product p1=new Product();
		p1.setProductName("Laptop");
		p1.setProductPrice(25000.0);
		
		//creating of second object of product
		Product p2= new Product();
		p2.setProductName("MObile");
		p2.setProductPrice(84000.0);
		
		//creating first object of order
		Order o1=new Order();
		o1.setOrderName("HP-Laptop_order");
		
		//creating second object of order
		Order o2=new Order();
			o2.setOrderName("Samsung-mobile-order");
			
		//creating list of product object by initializing array list object
			List<Product> list=new ArrayList();
			list.add(p1);
			list.add(p2);
			
		//creating list of Order object by initalizing arrya list object
			List<Order>listofOrder=new ArrayList();
			listofOrder.add(o1);
			listofOrder.add(o2);
			
		//setting the listofOrder with product object
			p1.setOrders(listofOrder);
			p2.setOrders(listofOrder);
		
		//setting the list of product with order 
			o1.setProducts(list);
			o2.setProducts(list);
		//persisiting the object of entity manager
			em.persist(p1);
			em.persist(p2);
			em.persist(o1);
			em.persist(o2);
			
			//commititng transaction
			et.commit();
		
		

	}

}