package com.codefactory.reserva_b.entity.interfaces;

import java.math.BigInteger;
import java.time.LocalDate;

public interface IPlaneEntity {
    // Getters
    BigInteger getIdPlane();
    String getModel();
    String getManufacturer();
    Long getCapacityEconomy();
    Long getCapacityBusiness();
    Long getCapacityFirstClass();
    LocalDate getDateManufactured();
    LocalDate getLastMaintenanceDate();
    String getRegistrationNumber();
    Double getFuelCapacity();

    // Setters
    void setIdPlane(BigInteger idPlane);
    void setModel(String model);
    void setManufacturer(String manufacturer);
    void setCapacityEconomy(Long capacityEconomy);
    void setCapacityBusiness(Long capacityBusiness);
    void setCapacityFirstClass(Long capacityFirstClass);
    void setDateManufactured(LocalDate dateManufactured);
    void setLastMaintenanceDate(LocalDate lastMaintenanceDate);
    void setRegistrationNumber(String registrationNumber);
    void setFuelCapacity(Double fuelCapacity);
}
