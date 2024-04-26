package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Flight_Airport")
public class Airport {
	
	@Id
	@GeneratedValue
	private long airportId;
	private String portName;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="address_id")
	private AirportAddress address;
	@ManyToOne
	@JoinColumn(name="flight_id")
	private Flight flight;
	public long getAirportId() {
		return airportId;
	}
	public void setAirportId(long airportId) {
		this.airportId = airportId;
	}
	public String getPortName() {
		return portName;
	}
	public void setPortName(String portName) {
		this.portName = portName;
	}
	public AirportAddress getAddress() {
		return address;
	}
	public void setAddress(AirportAddress address) {
		this.address = address;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	@Override
	public String toString() {
		return "Airport [airportId=" + airportId + ", portName=" + portName + ", address=" + address + ", flight="
				+ flight + "]";
	}
	
	
	
	
	
	

}
