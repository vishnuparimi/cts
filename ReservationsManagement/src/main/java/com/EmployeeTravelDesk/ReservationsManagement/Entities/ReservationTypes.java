package com.EmployeeTravelDesk.ReservationsManagement.Entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReservationTypes {
	@Id
	private int typeId;
	
	private String typeName;
	
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public ReservationTypes() {
		super();
	}
	
	public ReservationTypes(int typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}

}
