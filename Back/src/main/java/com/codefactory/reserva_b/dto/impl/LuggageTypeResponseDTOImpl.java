package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.ILuggageTypeResponseDTO;

public class LuggageTypeResponseDTOImpl implements ILuggageTypeResponseDTO {
    private final Long idLuggageType;
    private final String name;

    public LuggageTypeResponseDTOImpl(Long idLuggageType, String name) {
        this.idLuggageType = idLuggageType;
        this.name = name;
    }

    @Override
    public Long getIdLuggageType() {
        return idLuggageType;
    }

    @Override
    public String getName() {
        return name;
    }
}
