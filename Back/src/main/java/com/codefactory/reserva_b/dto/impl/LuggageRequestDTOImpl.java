package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.ILuggageRequestDTO;

public class LuggageRequestDTOImpl implements ILuggageRequestDTO {
    private final Long idPassenger;
    private final Long idLuggageType;
    private final Float heightCm;
    private final Float weightKg;
    private final Float widthCm;
    private final Float extraFree;

    public LuggageRequestDTOImpl(Long idPassenger, Long idLuggageType, Float heightCm,
                                 Float weightKg, Float widthCm, Float extraFree) {
        this.idPassenger = idPassenger;
        this.idLuggageType = idLuggageType;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.widthCm = widthCm;
        this.extraFree = extraFree;
    }

    @Override
    public Long getIdPassenger() {
        return idPassenger;
    }

    @Override
    public Long getIdLuggageType() {
        return idLuggageType;
    }

    @Override
    public Float getHeightCm() {
        return heightCm;
    }

    @Override
    public Float getWeightKg() {
        return weightKg;
    }

    @Override
    public Float getWidthCm() {
        return widthCm;
    }

    @Override
    public Float getExtraFree() {
        return extraFree;
    }
}
