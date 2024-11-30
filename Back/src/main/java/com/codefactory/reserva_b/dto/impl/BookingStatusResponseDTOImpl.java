package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IBookingStatusResponseDTO;

public class BookingStatusResponseDTOImpl implements IBookingStatusResponseDTO {
    private final Long idBookingStatus;
    private final String name;
    private final String description;

    public BookingStatusResponseDTOImpl(Long idBookingStatus, String name, String description) {
        this.idBookingStatus = idBookingStatus;
        this.name = name;
        this.description = description;
    }

    @Override
    public Long getIdBookingStatus() {
        return idBookingStatus;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
