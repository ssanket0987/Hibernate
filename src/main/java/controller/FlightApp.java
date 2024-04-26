package controller;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Airport;
import model.AirportAddress;
import model.Flight;
import ultility.DBUtil;

public class FlightApp {

	public static void main(String[] args) {

		// Getting the object of the entity manager
		EntityManager em = DBUtil.getConnect();
		// creating the object of AirportAddress
		AirportAddress address = new AirportAddress();
		address.setCity("Mumbai");
		address.setCountry("India");

		// creating the object of first airport object

		Airport airport1 = new Airport();
		airport1.setAddress(address);
		airport1.setPortName("A Airport");

		// creating the object of seconf airport object

		Airport airport2 = new Airport();
		airport2.setAddress(address);
		airport2.setPortName("B Airport");

		// creating the object of the Flight

		Flight flight1 = new Flight();
		flight1.setFlightSource("Mumbai");
		flight1.setFlightDestinatiom("Nashik");
		flight1.setFlyDate(LocalDate.now());
		flight1.setDays("MON,TUE,WED");

		List<Airport> list = flight1.getAirports();
		list.add(airport1);
		list.add(airport2);
		flight1.setAirports(list);
	
		airport1.setFlight(flight1);
		airport2.setFlight(flight1);
		
		System.out.println("Linked with the DB");
		
		
		EntityTransaction et= em.getTransaction();
		et.begin();
		em.persist(flight1);
		et.commit();
		
		

	}

}
