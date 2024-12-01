package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IBookingRequestDTO;
import com.codefactory.reserva_b.dto.interfaces.IPassengerRequestDTO;

import java.util.List;

public class BookingRequestDTOImpl implements IBookingRequestDTO {
    private final Long idFlight;
    private final Long idUser;
    private final Long idBookingStatus;
    private final List<PassengerRequestDTOImpl> passengers;

    public BookingRequestDTOImpl(Long idFlight, Long idUser,
                                 Long idBookingStatus, List<PassengerRequestDTOImpl> passengers) {
        this.idFlight = idFlight;
        this.idUser = idUser;
        this.idBookingStatus = idBookingStatus;
        this.passengers = passengers;
    }

    @Override
    public Long getIdFlight() {
        return idFlight;
    }

    @Override
    public Long getIdUser() {
        return idUser;
    }

    @Override
    public Long getIdBookingStatus() {
        return idBookingStatus;
    }

    @Override
    public List<PassengerRequestDTOImpl> getPassengers() {
        return passengers;
    }
}
