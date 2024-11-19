package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IPilotEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "pilot")
public class PilotEntityImpl implements IPilotEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pilot")
    private BigInteger idPilot;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "license_number", nullable = false)
    private String licenseNumber;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "nationality", nullable = false)
    private String nationality;

    @Column(name = "rank", nullable = false)
    private String rank;

    @Column(name = "hours_flown", nullable = false)
    private Double hoursFlown;

    @Column(name = "employee_date", nullable = false)
    private LocalDate employeeDate;

    @Column(name = "id_pilot_status", nullable = false)
    private BigInteger idPilotStatus;

    @ManyToOne
    @JoinColumn(name = "id_pilot_status", nullable = false, insertable = false, updatable = false)
    private PilotStatusEntityImpl pilotStatus;

    @Column(name = "home_base")
    private String homeBase;

    @Column(name = "last_medical_check", nullable = false)
    private LocalDate lastMedicalCheck;

    public PilotEntityImpl() {}

    public PilotEntityImpl(String firstName, String lastName, String licenseNumber, LocalDate dateOfBirth, String nationality, String rank, Double hoursFlown, LocalDate employeeDate, BigInteger idPilotStatus, String homeBase, LocalDate lastMedicalCheck) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenseNumber = licenseNumber;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.rank = rank;
        this.hoursFlown = hoursFlown;
        this.employeeDate = employeeDate;
        this.idPilotStatus = idPilotStatus;
        this.homeBase = homeBase;
        this.lastMedicalCheck = lastMedicalCheck;
    }

    @Override
    public BigInteger getIdPilot() {
        return idPilot;
    }

    @Override
    public void setIdPilot(BigInteger idPilot) {
        this.idPilot = idPilot;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    @Override
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String getRank() {
        return rank;
    }

    @Override
    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public Double getHoursFlown() {
        return hoursFlown;
    }

    @Override
    public void setHoursFlown(Double hoursFlown) {
        this.hoursFlown = hoursFlown;
    }

    @Override
    public LocalDate getEmployeeDate() {
        return employeeDate;
    }

    @Override
    public void setEmployeeDate(LocalDate employeeDate) {
        this.employeeDate = employeeDate;
    }

    @Override
    public BigInteger getIdPilotStatus() {
        return idPilotStatus;
    }

    @Override
    public void setIdPilotStatus(BigInteger idPilotStatus) {
        this.idPilotStatus = idPilotStatus;
    }

    @Override
    public PilotStatusEntityImpl getPilotStatus() {
        return pilotStatus;
    }

    @Override
    public void setPilotStatus(PilotStatusEntityImpl pilotStatus) {
        this.pilotStatus = pilotStatus;
    }

    @Override
    public String getHomeBase() {
        return homeBase;
    }

    @Override
    public void setHomeBase(String homeBase) {
        this.homeBase = homeBase;
    }

    @Override
    public LocalDate getLastMedicalCheck() {
        return lastMedicalCheck;
    }

    @Override
    public void setLastMedicalCheck(LocalDate lastMedicalCheck) {
        this.lastMedicalCheck = lastMedicalCheck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PilotEntityImpl that = (PilotEntityImpl) o;
        return Objects.equals(idPilot, that.idPilot);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPilot);
    }

    @Override
    public String toString() {
        return "PilotEntityImpl{" +
                "idPilot=" + idPilot +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nationality='" + nationality + '\'' +
                ", rank='" + rank + '\'' +
                ", hoursFlown=" + hoursFlown +
                ", employeeDate=" + employeeDate +
                ", idPilotStatus=" + idPilotStatus +
                ", pilotStatus=" + pilotStatus +
                ", homeBase='" + homeBase + '\'' +
                ", lastMedicalCheck=" + lastMedicalCheck +
                '}';
    }
}