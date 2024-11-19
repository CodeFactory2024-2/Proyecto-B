package com.codefactory.reserva_b.entity.interfaces;

import com.codefactory.reserva_b.entity.impl.DocumentTypeEntityImpl;
import com.codefactory.reserva_b.entity.impl.LuggageEntityImpl;
import com.codefactory.reserva_b.entity.impl.SeatEntityImpl;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public interface IPassengerEntity {
    // Getters
    BigInteger getIdPassenger();
    BigInteger getIdSeat();
    SeatEntityImpl getSeat();
    String getFirstName();
    String getLastName();
    LocalDate getDateOfBirth();
    String getDocumentId();
    String getPassportNumber();
    String getNationality();
    Boolean getLuggageIncluded();
    BigInteger getIdDocumentType();
    DocumentTypeEntityImpl getDocumentType();
    List<LuggageEntityImpl> getLuggage();

    // Setters
    void setIdPassenger(BigInteger idPassenger);
    void setIdSeat(BigInteger idSeat);
    void setSeat(SeatEntityImpl seat);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setDateOfBirth(LocalDate dateOfBirth);
    void setDocumentId(String documentId);
    void setPassportNumber(String passportNumber);
    void setNationality(String nationality);
    void setLuggageIncluded(Boolean luggageIncluded);
    void setIdDocumentType(BigInteger idDocumentType);
    void setDocumentType(DocumentTypeEntityImpl documentType);
    void setLuggage(List<LuggageEntityImpl> luggage);
}
