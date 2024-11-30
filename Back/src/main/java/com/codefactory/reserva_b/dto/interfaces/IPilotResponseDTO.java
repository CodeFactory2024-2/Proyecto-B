package com.codefactory.reserva_b.dto.interfaces;

import com.codefactory.reserva_b.dto.impl.PilotStatusResponseDTOImpl;

import java.time.LocalDate;

public interface IPilotResponseDTO {
    Long getIdPilot();
    String getFirstName();
    String getLastName();
    String getLicenseNumber();
    LocalDate getDateOfBirth();
    String getNationality();
    String getRank();
    Float getHoursFlown();
    LocalDate getEmployeeDate();
    Long getIdPilotStatus();
    PilotStatusResponseDTOImpl getPilotStatus();
    String getHomeBase();
    LocalDate getLastMedicalCheck();
}
