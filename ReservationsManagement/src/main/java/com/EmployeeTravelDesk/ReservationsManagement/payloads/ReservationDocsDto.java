package com.EmployeeTravelDesk.ReservationsManagement.payloads;

public class ReservationDocsDto {
	
	private int Id;
	
	private int ReservationId;
	
	private String DocumentURL;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getReservationId() {
		return ReservationId;
	}

	public void setReservationId(int reservationId) {
		ReservationId = reservationId;
	}

	public String getDocumentURL() {
		return DocumentURL;
	}

	public void setDocumentURL(String documentURL) {
		DocumentURL = documentURL;
	}
	
	
	

}
