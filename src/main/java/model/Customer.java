package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Table")


public class Customer {
	
	
	@Id
	@GeneratedValue
	@Column(name="c_id")
	private long customerId;
	
	@Column(name="c_name")
	private String customerName;
	
	@Column(name="c_phone",unique=true)
	private long customerPhone;
	
	@Column(name="c_email",unique=true)
	private String emailId;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="address_id")
	private Address address;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer(long customerId, String customerName, long customerPhone, String emailId, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.emailId = emailId;
		this.address = address;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + ", emailId=" + emailId + ", address=" + address + "]";
	}
	
	
	//@Column(name="c_city")
	//private String city;
	
	
	
	
	
	

}
