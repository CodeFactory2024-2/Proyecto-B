package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.*;
import com.codefactory.reserva_b.dto.interfaces.ILuggageResponseDTO;
import com.codefactory.reserva_b.dto.interfaces.IPassengerResponseDTO;
import com.codefactory.reserva_b.dto.interfaces.ISeatResponseDTO;
import com.codefactory.reserva_b.entity.impl.PassengerEntityImpl;
import com.codefactory.reserva_b.entity.interfaces.IPassengerEntity;
import com.codefactory.reserva_b.util.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PassengerMapperImpl implements IPassengerMapper {
    @Autowired
    private ISeatMapper seatMapper;
    @Autowired
    private ILuggageMapper luggageMapper;
    @Autowired
    private IDocumentTypeMapper documentTypeMapper;
    @Autowired
    private ISpecialRequestMapper specialRequestMapper;
    @Override
    public PassengerResponseDTOImpl mapPassengerEntityToPassengerResponseDTO(IPassengerEntity passengerEntity) {
        if (passengerEntity == null) {
            return null;
        }

        Long idPassenger = passengerEntity.getIdPassenger().longValue();
        Long idSeat = passengerEntity.getIdSeat().longValue();
        String firstName = passengerEntity.getFirstName();
        String lastName = passengerEntity.getLastName();
        String dateOfBirth = passengerEntity.getDateOfBirth().toString();
        String documentId = passengerEntity.getDocumentId();
        String passportNumber = passengerEntity.getPassportNumber();
        String nationality = passengerEntity.getNationality();
        Boolean luggageIncluded = passengerEntity.getLuggageIncluded();
        Long idDocumentType = passengerEntity.getIdDocumentType().longValue();
        DocumentTypeResponseDTOImpl documentType = passengerEntity.getDocumentType() != null ?
                documentTypeMapper.mapDocumentTypeEntityToDocumentTypeResponseDTO(passengerEntity.getDocumentType()) : null;
        SeatResponseDTOImpl seat = passengerEntity.getSeat() != null ?
                seatMapper.mapSeatEntityToSeatResponseDTO(passengerEntity.getSeat()) : null;
        List<LuggageResponseDTOImpl> luggage = passengerEntity.getLuggage() != null ?
                luggageMapper.mapLuggageEntitiesToLuggageResponseDTOs(passengerEntity.getLuggage()) : null;
        List<SpecialRequestResponseDTOImpl> specialRequests = passengerEntity.getSpecialRequests() != null ?
                specialRequestMapper.mapSpecialRequestEntitiesToSpecialRequestResponseDTOs(passengerEntity.getSpecialRequests()) : null;
        return new PassengerResponseDTOImpl(
                idPassenger,
                idSeat,
                seat,
                firstName,
                lastName,
                dateOfBirth,
                documentId,
                passportNumber,
                nationality,
                idDocumentType,
                documentType,
                luggageIncluded,
                luggage,
                specialRequests
        );
    }

    public List<PassengerResponseDTOImpl> mapPassengerEntitiesToPassengerResponseDTOs(List<PassengerEntityImpl> passengerEntities) {
        if (passengerEntities == null) {
            return null;
        }
        return passengerEntities.stream()
                .map(this::mapPassengerEntityToPassengerResponseDTO)
                .collect(Collectors.toList());
    }
}
