package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IPassengerResponseDTO;
import com.codefactory.reserva_b.dto.interfaces.IUsersResponseDTO;

import java.util.List;

public class PassengerResponseDTOImpl implements IPassengerResponseDTO {
    private final Long idPassenger;
    private final Long idSeat;
    private final SeatResponseDTOImpl seat;
    private final String firstName;
    private final String lastName;
    private final String dateOfBirth;
    private final String documentId;
    private final String passportNumber;
    private final String nationality;
    private final Long idDocumentType;
    private final DocumentTypeResponseDTOImpl documentType;
    private final Boolean luggageIncluded;
    private final List<LuggageResponseDTOImpl> luggage;
    private final List<SpecialRequestResponseDTOImpl> specialRequest;

    public PassengerResponseDTOImpl(Long idPassenger, Long idSeat, SeatResponseDTOImpl seat, String firstName,
                                    String lastName, String dateOfBirth, String documentId, String passportNumber,
                                    String nationality, Long idDocumentType, DocumentTypeResponseDTOImpl documentType,
                                    Boolean luggageIncluded, List<LuggageResponseDTOImpl> luggage, List<SpecialRequestResponseDTOImpl> specialRequest) {
        this.idPassenger = idPassenger;
        this.idSeat = idSeat;
        this.seat = seat;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.documentId = documentId;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
        this.idDocumentType = idDocumentType;
        this.documentType = documentType;
        this.luggageIncluded = luggageIncluded;
        this.luggage = luggage;
        this.specialRequest = specialRequest;
    }

    @Override
    public Long getIdPassenger() {
        return idPassenger;
    }

    @Override
    public Long getIdSeat() {
        return idSeat;
    }

    @Override
    public SeatResponseDTOImpl getSeat() {
        return seat;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String getDocumentId() {
        return documentId;
    }

    @Override
    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    @Override
    public Long getIdDocumentType() {return idDocumentType;}

    @Override
    public DocumentTypeResponseDTOImpl getDocumentType() { return documentType; }

    @Override
    public Boolean getLuggageIncluded() {
        return luggageIncluded;
    }

    @Override
    public List<LuggageResponseDTOImpl> getLuggage() {
        return luggage;
    }

    @Override
    public List<SpecialRequestResponseDTOImpl> getSpecialRequest() {
        return specialRequest;
    }
}
