package com.decathlon.projetl3rentcar.controller.out;

import com.decathlon.projetl3rentcar.entity.Customer;
import com.decathlon.projetl3rentcar.entity.RentalRecord;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentalRecordDtoOut {
    private int id;
    private int vehicleId;
    private float totalCost;
    private ZonedDateTime startDate;
    private ZonedDateTime endDate;
    private String status;
    private String customerEmail;
    public RentalRecordDtoOut(RentalRecord rentalRecord,String customerEmail ) {
        this.id = rentalRecord.getId();
        this.vehicleId = rentalRecord.getVehicleId();
        this.totalCost = rentalRecord.getTotalCost();
        this.startDate=rentalRecord.getStartDate();
        this.endDate=rentalRecord.getEndDate();
        this.status=rentalRecord.getStatus();
        this.customerEmail=customerEmail;
    }

}
