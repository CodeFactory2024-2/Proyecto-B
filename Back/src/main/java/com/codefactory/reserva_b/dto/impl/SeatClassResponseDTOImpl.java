package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.ISeatClassResponseDTO;

public class SeatClassResponseDTOImpl implements ISeatClassResponseDTO {
    private final Long idSeatClass;
    private final String name;

    public SeatClassResponseDTOImpl(Long idSeatClass, String name) {
        this.idSeatClass = idSeatClass;
        this.name = name;
    }

    @Override
    public Long getIdSeatClass() {
        return idSeatClass;
    }

    @Override
    public String getName() {
        return name;
    }
}
