package com.codefactory.reserva_b.dto.interfaces;

import com.codefactory.reserva_b.dto.impl.DocumentTypeResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.LuggageResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.SeatResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.SpecialRequestResponseDTOImpl;

import java.util.List;

public interface IPassengerResponseDTO {
    Long getIdPassenger();
    Long getIdSeat();
    ISeatResponseDTO getSeat();
    String getFirstName();
    String getLastName();
    String getDateOfBirth();
    String getDocumentId();
    String getPassportNumber();
    String getNationality();
    Boolean getLuggageIncluded();
    Long getIdDocumentType();
    DocumentTypeResponseDTOImpl getDocumentType();
    List<LuggageResponseDTOImpl> getLuggage();
    List<SpecialRequestResponseDTOImpl> getSpecialRequest();
}
