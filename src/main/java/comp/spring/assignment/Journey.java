package comp.spring.assignment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="journey")
public class Journey {
	
	 @Id
	    @Column(name="traincode")
		  public String trainCode;
	 @Column(name="trainname")
	  public String trainName;
	 @Column(name="journey")
	  public String trainJourney;
	 @Column(name="ticketprice")
	 
	 
	 
	  public double ticketPrice;
	public Journey(String trainCode, String trainName, String trainJourney, double ticketPrice) {
		super();
		this.trainCode = trainCode;
		this.trainName = trainName;
		this.trainJourney = trainJourney;
		this.ticketPrice = ticketPrice;
	}
	/**
	 * @return the trainCode
	 */
	public String getTrainCode() {
		return trainCode;
	}
	/**
	 * @param trainCode the trainCode to set
	 */
	public void setTrainCode(String trainCode) {
		this.trainCode = trainCode;
	}
	/**
	 * @return the trainName
	 */
	public String getTrainName() {
		return trainName;
	}
	/**
	 * @param trainName the trainName to set
	 */
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	/**
	 * @return the trainJourney
	 */
	public String getTrainJourney() {
		return trainJourney;
	}
	/**
	 * @param trainJourney the trainJourney to set
	 */
	public void setTrainJourney(String trainJourney) {
		this.trainJourney = trainJourney;
	}
	/**
	 * @return the ticketPrice
	 */
	public double getTicketPrice() {
		return ticketPrice;
	}
	/**
	 * @param ticketPrice the ticketPrice to set
	 */
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	 
	 
	 	

}
