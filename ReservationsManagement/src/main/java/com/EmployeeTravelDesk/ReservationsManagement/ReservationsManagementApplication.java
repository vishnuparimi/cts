package com.EmployeeTravelDesk.ReservationsManagement;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.EmployeeTravelDesk.ReservationsManagement.Entities.ReservationDocs;
import com.EmployeeTravelDesk.ReservationsManagement.Entities.ReservationTypes;
import com.EmployeeTravelDesk.ReservationsManagement.Entities.Reservations;
import com.EmployeeTravelDesk.ReservationsManagement.Repositories.ReservationDocsRepo;
import com.EmployeeTravelDesk.ReservationsManagement.Repositories.ReservationTypesRepo;
import com.EmployeeTravelDesk.ReservationsManagement.Repositories.ReservationsRepo;

@SpringBootApplication
public class ReservationsManagementApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ReservationsManagementApplication.class, args);
		
		ReservationTypesRepo rr=ctx.getBean(ReservationTypesRepo.class);
		ReservationTypes r=new ReservationTypes(1,"navu");
		rr.save(r);
		
		
		ReservationsRepo rsr=ctx.getBean(ReservationsRepo.class);
		Reservations res = new Reservations(1,2262989,23,69,LocalDate.now(),"okk",LocalDate.now(),1234,"1234","Nothing");
		rsr.save(res);
		
		ReservationDocsRepo rdr=ctx.getBean(ReservationDocsRepo.class);
		ReservationDocs rdocs=new ReservationDocs(1,2345,"Hii");
		rdr.save(rdocs);
	
	}

}
