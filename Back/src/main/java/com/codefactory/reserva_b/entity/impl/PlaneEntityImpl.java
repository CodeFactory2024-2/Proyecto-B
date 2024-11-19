package com.codefactory.reserva_b.entity.impl;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IPlaneEntity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "plane")
public class PlaneEntityImpl implements IPlaneEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plane")
    private BigInteger idPlane;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "manufacturer", nullable = false)
    private String manufacturer;

    @Column(name = "capacity_economy", nullable = false)
    private Long capacityEconomy;

    @Column(name = "capacity_business", nullable = false)
    private Long capacityBusiness;

    @Column(name = "capacity_first_class", nullable = false)
    private Long capacityFirstClass;

    @Column(name = "date_manufactured", nullable = false)
    private LocalDate dateManufactured;

    @Column(name = "last_maintenance_date", nullable = false)
    private LocalDate lastMaintenanceDate;

    @Column(name = "registration_number", nullable = false)
    private String registrationNumber;

    @Column(name = "fuel_capacity", nullable = false)
    private Double fuelCapacity;

    public PlaneEntityImpl() {}

    public PlaneEntityImpl(String model, String manufacturer, Long capacityEconomy, Long capacityBusiness, Long capacityFirstClass, LocalDate dateManufactured, LocalDate lastMaintenanceDate, String registrationNumber, Double fuelCapacity) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.capacityEconomy = capacityEconomy;
        this.capacityBusiness = capacityBusiness;
        this.capacityFirstClass = capacityFirstClass;
        this.dateManufactured = dateManufactured;
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.registrationNumber = registrationNumber;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public BigInteger getIdPlane() {
        return idPlane;
    }

    @Override
    public void setIdPlane(BigInteger idPlane) {
        this.idPlane = idPlane;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public Long getCapacityEconomy() {
        return capacityEconomy;
    }

    @Override
    public void setCapacityEconomy(Long capacityEconomy) {
        this.capacityEconomy = capacityEconomy;
    }

    @Override
    public Long getCapacityBusiness() {
        return capacityBusiness;
    }

    @Override
    public void setCapacityBusiness(Long capacityBusiness) {
        this.capacityBusiness = capacityBusiness;
    }

    @Override
    public Long getCapacityFirstClass() {
        return capacityFirstClass;
    }

    @Override
    public void setCapacityFirstClass(Long capacityFirstClass) {
        this.capacityFirstClass = capacityFirstClass;
    }

    @Override
    public LocalDate getDateManufactured() {
        return dateManufactured;
    }

    @Override
    public void setDateManufactured(LocalDate dateManufactured) {
        this.dateManufactured = dateManufactured;
    }

    @Override
    public LocalDate getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    @Override
    public void setLastMaintenanceDate(LocalDate lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public Double getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public void setFuelCapacity(Double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaneEntityImpl that = (PlaneEntityImpl) o;
        return Objects.equals(idPlane, that.idPlane);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPlane);
    }

    @Override
    public String toString() {
        return "PlaneEntityImpl{" +
                "idPlane=" + idPlane +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", capacityEconomy=" + capacityEconomy +
                ", capacityBusiness=" + capacityBusiness +
                ", capacityFirstClass=" + capacityFirstClass +
                ", dateManufactured=" + dateManufactured +
                ", lastMaintenanceDate=" + lastMaintenanceDate +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}