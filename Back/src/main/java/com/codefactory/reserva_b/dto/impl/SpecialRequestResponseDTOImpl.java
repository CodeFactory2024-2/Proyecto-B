package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.ISpecialRequestResponseDTO;

public class SpecialRequestResponseDTOImpl implements ISpecialRequestResponseDTO {
    private final Long idSpecialRequest;
    private final String name;
    private final String description;

    public SpecialRequestResponseDTOImpl(Long idSpecialRequest, String name, String description) {
        this.idSpecialRequest = idSpecialRequest;
        this.name = name;
        this.description = description;
    }

    @Override
    public Long getIdSpecialRequest() {
        return idSpecialRequest;
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
