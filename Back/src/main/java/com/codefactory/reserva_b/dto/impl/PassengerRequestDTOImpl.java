package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IPassengerRequestDTO;

import java.util.List;

public class PassengerRequestDTOImpl implements IPassengerRequestDTO {
    private final Long idSeat;
    private final String firstName;
    private final String lastName;
    private final String dateOfBirth;
    private final String documentId;
    private final String passportNumber;
    private final String nationality;
    private final Long idDocumentType;
    private final Boolean luggageIncluded;
    private final List<LuggageRequestDTOImpl> luggage;

    public PassengerRequestDTOImpl(Long idSeat, String firstName, String lastName, String dateOfBirth,
                                   String documentId, String passportNumber, String nationality,
                                   Long idDocumentType, Boolean luggageIncluded,
                                   List<LuggageRequestDTOImpl> luggage) {
        this.idSeat = idSeat;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.documentId = documentId;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
        this.idDocumentType = idDocumentType;
        this.luggageIncluded = luggageIncluded;
        this.luggage = luggage;
    }

    @Override
    public Long getIdSeat() {
        return idSeat;
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
    public Long getIdDocumentType() {
        return idDocumentType;
    }

    @Override
    public Boolean getLuggageIncluded() {
        return luggageIncluded;
    }

    @Override
    public List<LuggageRequestDTOImpl> getLuggage() {
        return luggage;
    }
}
