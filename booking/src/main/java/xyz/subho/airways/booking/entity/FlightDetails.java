package xyz.subho.airways.booking.entity;

import java.time.DayOfWeek;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class FlightDetails {
	
	/**
	 * Date Time Format is yyyy-MM-dd'T'HH:mm:ss.SSSXXX — for example, "2000-10-31T01:30:00.000-05:00" 
	 */
	@Id
	@GeneratedValue
	private Long id;
	private String flightNumber;
	private String firline;
	private String fromPlace;
	private String toPlace;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Long startDateTime;	
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Long endDateTime;
	
	private DayOfWeek scheduledDays;
	private String instrumentUsed;
	private Integer businessClassSeats = 0;
	private Integer nonBusinessClassSeats;
	private Double ticketCost;
	private Integer rows;
	private String Meals;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}
	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	/**
	 * @return the firline
	 */
	public String getFirline() {
		return firline;
	}
	/**
	 * @param firline the firline to set
	 */
	public void setFirline(String firline) {
		this.firline = firline;
	}
	/**
	 * @return the fromPlace
	 */
	public String getFromPlace() {
		return fromPlace;
	}
	/**
	 * @param fromPlace the fromPlace to set
	 */
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	/**
	 * @return the toPlace
	 */
	public String getToPlace() {
		return toPlace;
	}
	/**
	 * @param toPlace the toPlace to set
	 */
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	/**
	 * @return the startDateTime
	 */
	public Long getStartDateTime() {
		return startDateTime;
	}
	/**
	 * @param startDateTime the startDateTime to set
	 */
	public void setStartDateTime(Long startDateTime) {
		this.startDateTime = startDateTime;
	}
	/**
	 * @return the endDateTime
	 */
	public Long getEndDateTime() {
		return endDateTime;
	}
	/**
	 * @param endDateTime the endDateTime to set
	 */
	public void setEndDateTime(Long endDateTime) {
		this.endDateTime = endDateTime;
	}
	/**
	 * @return the scheduledDays
	 */
	public DayOfWeek getScheduledDays() {
		return scheduledDays;
	}
	/**
	 * @param scheduledDays the scheduledDays to set
	 */
	public void setScheduledDays(DayOfWeek scheduledDays) {
		this.scheduledDays = scheduledDays;
	}
	/**
	 * @return the instrumentUsed
	 */
	public String getInstrumentUsed() {
		return instrumentUsed;
	}
	/**
	 * @param instrumentUsed the instrumentUsed to set
	 */
	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}
	/**
	 * @return the businessClassSeats
	 */
	public Integer getBusinessClassSeats() {
		return businessClassSeats;
	}
	/**
	 * @param businessClassSeats the businessClassSeats to set
	 */
	public void setBusinessClassSeats(Integer businessClassSeats) {
		this.businessClassSeats = businessClassSeats;
	}
	/**
	 * @return the nonBusinessClassSeats
	 */
	public Integer getNonBusinessClassSeats() {
		return nonBusinessClassSeats;
	}
	/**
	 * @param nonBusinessClassSeats the nonBusinessClassSeats to set
	 */
	public void setNonBusinessClassSeats(Integer nonBusinessClassSeats) {
		this.nonBusinessClassSeats = nonBusinessClassSeats;
	}
	/**
	 * @return the ticketCost
	 */
	public Double getTicketCost() {
		return ticketCost;
	}
	/**
	 * @param ticketCost the ticketCost to set
	 */
	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}
	/**
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}
	/**
	 * @param rows the rows to set
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	/**
	 * @return the meals
	 */
	public String getMeals() {
		return Meals;
	}
	/**
	 * @param meals the meals to set
	 */
	public void setMeals(String meals) {
		Meals = meals;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Meals == null) ? 0 : Meals.hashCode());
		result = prime * result + ((businessClassSeats == null) ? 0 : businessClassSeats.hashCode());
		result = prime * result + ((endDateTime == null) ? 0 : endDateTime.hashCode());
		result = prime * result + ((firline == null) ? 0 : firline.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		result = prime * result + ((fromPlace == null) ? 0 : fromPlace.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((instrumentUsed == null) ? 0 : instrumentUsed.hashCode());
		result = prime * result + ((nonBusinessClassSeats == null) ? 0 : nonBusinessClassSeats.hashCode());
		result = prime * result + ((rows == null) ? 0 : rows.hashCode());
		result = prime * result + ((scheduledDays == null) ? 0 : scheduledDays.hashCode());
		result = prime * result + ((startDateTime == null) ? 0 : startDateTime.hashCode());
		result = prime * result + ((ticketCost == null) ? 0 : ticketCost.hashCode());
		result = prime * result + ((toPlace == null) ? 0 : toPlace.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightDetails other = (FlightDetails) obj;
		if (Meals == null) {
			if (other.Meals != null)
				return false;
		} else if (!Meals.equals(other.Meals))
			return false;
		if (businessClassSeats == null) {
			if (other.businessClassSeats != null)
				return false;
		} else if (!businessClassSeats.equals(other.businessClassSeats))
			return false;
		if (endDateTime == null) {
			if (other.endDateTime != null)
				return false;
		} else if (!endDateTime.equals(other.endDateTime))
			return false;
		if (firline == null) {
			if (other.firline != null)
				return false;
		} else if (!firline.equals(other.firline))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (fromPlace == null) {
			if (other.fromPlace != null)
				return false;
		} else if (!fromPlace.equals(other.fromPlace))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (instrumentUsed == null) {
			if (other.instrumentUsed != null)
				return false;
		} else if (!instrumentUsed.equals(other.instrumentUsed))
			return false;
		if (nonBusinessClassSeats == null) {
			if (other.nonBusinessClassSeats != null)
				return false;
		} else if (!nonBusinessClassSeats.equals(other.nonBusinessClassSeats))
			return false;
		if (rows == null) {
			if (other.rows != null)
				return false;
		} else if (!rows.equals(other.rows))
			return false;
		if (scheduledDays != other.scheduledDays)
			return false;
		if (startDateTime == null) {
			if (other.startDateTime != null)
				return false;
		} else if (!startDateTime.equals(other.startDateTime))
			return false;
		if (ticketCost == null) {
			if (other.ticketCost != null)
				return false;
		} else if (!ticketCost.equals(other.ticketCost))
			return false;
		if (toPlace == null) {
			if (other.toPlace != null)
				return false;
		} else if (!toPlace.equals(other.toPlace))
			return false;
		return true;
	}	
	
	@Override
	public String toString() {
		return "FlightDetails [id=" + id + ", flightNumber=" + flightNumber + ", firline=" + firline + ", fromPlace="
				+ fromPlace + ", toPlace=" + toPlace + ", startDateTime=" + startDateTime + ", endDateTime="
				+ endDateTime + ", scheduledDays=" + scheduledDays + ", instrumentUsed=" + instrumentUsed
				+ ", businessClassSeats=" + businessClassSeats + ", nonBusinessClassSeats=" + nonBusinessClassSeats
				+ ", ticketCost=" + ticketCost + ", rows=" + rows + ", Meals=" + Meals + "]";
	}
	
}
