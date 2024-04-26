package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="FK_Product")

public class Product {
	
	@Id
	@GeneratedValue
	private long productId;
	private String productName;
	private double productPrice;
	@ManyToMany
	private List<Order>orders;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public Product(long productId, String productName, double productPrice, List<Order> orders) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.orders = orders;
	}
	
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", orders=" + orders + "]";
	}
	
	

}