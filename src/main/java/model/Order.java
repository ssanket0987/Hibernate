package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;




@Entity
@Table(name="FK_Order")
public class Order {

	@Id
	@GeneratedValue
	private long orderId;
	private String orderName;
	@ManyToMany(cascade=CascadeType.PERSIST)
	
	@JoinTable(name= "Order_Product", joinColumns = {@JoinColumn(name="order_id")},
	inverseJoinColumns = {@JoinColumn(name="product_id")})
	private List<Product>products;

	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Order(long orderId, String orderName, List<Product> products) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.products = products;
	}
	
	
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", products=" + products + "]";
	}
	
	
	
	
	
	
}