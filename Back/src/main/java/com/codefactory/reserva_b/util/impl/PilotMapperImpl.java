package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.PilotResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.PilotStatusResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IPilotEntity;
import com.codefactory.reserva_b.util.interfaces.IPilotMapper;
import com.codefactory.reserva_b.util.interfaces.IPilotStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PilotMapperImpl implements IPilotMapper {
    @Autowired
    private IPilotStatusMapper pilotStatusMapper;
    @Override
    public PilotResponseDTOImpl mapPilotEntityToPilotResponseDTO(IPilotEntity pilotEntity) {
        if (pilotEntity == null) {
            return null;
        }

        Long idPilot = pilotEntity.getIdPilot().longValue();
        String firstName = pilotEntity.getFirstName();
        String lastName = pilotEntity.getLastName();
        String licenseNumber = pilotEntity.getLicenseNumber();
        LocalDate dateOfBirth = pilotEntity.getDateOfBirth();
        String nationality = pilotEntity.getNationality();
        String rank = pilotEntity.getRank();
        Float hoursFlown = pilotEntity.getHoursFlown() != null ? pilotEntity.getHoursFlown().floatValue() : null;
        LocalDate employeeDate = pilotEntity.getEmployeeDate();
        Long idPilotStatus = pilotEntity.getIdPilotStatus().longValue();
        String homeBase = pilotEntity.getHomeBase();
        LocalDate lastMedicalCheck = pilotEntity.getLastMedicalCheck();
        PilotStatusResponseDTOImpl pilotStatus = pilotEntity.getPilotStatus() != null ?
                pilotStatusMapper.mapPilotStatusEntityToPilotStatusResponseDTO(pilotEntity.getPilotStatus()) : null;

        return new PilotResponseDTOImpl(
                idPilot,
                firstName,
                lastName,
                licenseNumber,
                dateOfBirth,
                nationality,
                rank,
                hoursFlown,
                employeeDate,
                idPilotStatus,
                pilotStatus,
                homeBase,
                lastMedicalCheck
        );
    }
}
