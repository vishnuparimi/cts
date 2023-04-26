package com.EmployeeTravelDesk.ReservationsManagement.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class ReservationDocs {
	
	@Id
	private int id;
	private int reservationid;
	private String documentURl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReservationid() {
		return reservationid;
	}
	public void setReservationid(int reservationid) {
		this.reservationid = reservationid;
	}
	public String getDocumentURl() {
		return documentURl;
	}
	public void setDocumentURl(String documentURl) {
		this.documentURl = documentURl;
	}
	public ReservationDocs(int id, int reservationid, String documentURl) {
		super();
		this.id = id;
		this.reservationid = reservationid;
		this.documentURl = documentURl;
	}
	public ReservationDocs() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
