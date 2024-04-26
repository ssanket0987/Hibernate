package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Flight_Table")
public class Flight {

	@Id
	@SequenceGenerator(name = "my_seq", initialValue = 8000, allocationSize = 1)
	@GeneratedValue(generator = "my_seq", strategy = GenerationType.SEQUENCE)

	private long flightNumber;
	private String flightSource;
	private String flightDestinatiom;
	private LocalDate flyDate;
	private String days;
	
	@OneToMany(cascade=CascadeType.PERSIST,mappedBy="flight")
	
	
	private List<Airport> airports=new ArrayList();

	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightSource() {
		return flightSource;
	}

	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}

	public String getFlightDestinatiom() {
		return flightDestinatiom;
	}

	public void setFlightDestinatiom(String flightDestinatiom) {
		this.flightDestinatiom = flightDestinatiom;
	}

	public LocalDate getFlyDate() {
		return flyDate;
	}

	public void setFlyDate(LocalDate flyDate) {
		this.flyDate = flyDate;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public List<Airport> getAirports() {
		return airports;
	}

	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightSource=" + flightSource + ", flightDestinatiom="
				+ flightDestinatiom + ", flyDate=" + flyDate + ", days=" + days + ", airports=" + airports + "]";
	}

}
