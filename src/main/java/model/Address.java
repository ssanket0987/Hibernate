package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_Address")
public class Address {
	@Id
	@GeneratedValue

	@Column(name = "address_id")
	private long addressId;

	@Column(name = "city_name", nullable = false)
	private String cityName;

	@Column(name = "state_name", nullable = false)
	private String state;

	@Column(name="pin_code")
	private long pincode;

	@Column(name = "country_name")
	private String countryName;

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	
	public Address(long addressId, String cityName, String state, long pincode, String countryName) {
		super();
		this.addressId = addressId;
		this.cityName = cityName;
		this.state = state;
		this.pincode = pincode;
		this.countryName = countryName;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", cityName=" + cityName + ", state=" + state + ", pincode="
				+ pincode + ", countryName=" + countryName + "]";
	}
	
	
	

}
