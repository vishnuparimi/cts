package com.EmployeeTravelDesk.ReservationsManagement.payloads;
import java.time.LocalDate;

public class ReservationsDto {
	
	private int Id;
	
	private int ReservationDoneByEmployeeId;
	
	private int TravelRequestId;
	
	private int ReservationTypeId;
	
	private LocalDate CreatedOn;
	
	private String ReservationDoneWithEntity;
	
	private LocalDate ReservationDate;
	
	private int Amount;
	
	private String ConfirmationID;
	
	private String Remarks;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getReservationDoneByEmployeeId() {
		return ReservationDoneByEmployeeId;
	}

	public void setReservationDoneByEmployeeId(int reservationDoneByEmployeeId) {
		ReservationDoneByEmployeeId = reservationDoneByEmployeeId;
	}

	public int getTravelRequestId() {
		return TravelRequestId;
	}

	public void setTravelRequestId(int travelRequestId) {
		TravelRequestId = travelRequestId;
	}

	public int getReservationTypeId() {
		return ReservationTypeId;
	}

	public void setReservationTypeId(int reservationTypeId) {
		ReservationTypeId = reservationTypeId;
	}

	public LocalDate getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		CreatedOn = createdOn;
	}

	public String getReservationDoneWithEntity() {
		return ReservationDoneWithEntity;
	}

	public void setReservationDoneWithEntity(String reservationDoneWithEntity) {
		ReservationDoneWithEntity = reservationDoneWithEntity;
	}

	public LocalDate getReservationDate() {
		return ReservationDate;
	}

	public void setReservationDate(LocalDate reservationDate) {
		ReservationDate = reservationDate;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public String getConfirmationID() {
		return ConfirmationID;
	}

	public void setConfirmationID(String confirmationID) {
		ConfirmationID = confirmationID;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	

}
