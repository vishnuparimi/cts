package com.EmployeeTravelDesk.ReservationsManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeTravelDesk.ReservationsManagement.Entities.Reservations;

public interface ReservationsRepo extends  JpaRepository<Reservations,Integer> {

}