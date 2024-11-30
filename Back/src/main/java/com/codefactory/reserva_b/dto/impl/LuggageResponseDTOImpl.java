package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.ILuggageResponseDTO;

public class LuggageResponseDTOImpl implements ILuggageResponseDTO {
    private final Long idLuggage;
    private final Long idPassenger;
    private final Long idLuggageType;
    private final LuggageTypeResponseDTOImpl luggageType;
    private final Float heightCm;
    private final Float weightKg;
    private final Float widthCm;
    private final Float extraFree;

    public LuggageResponseDTOImpl(Long idLuggage, Long idPassenger, Long idLuggageType, LuggageTypeResponseDTOImpl luggageType, Float heightCm,
                                  Float weightKg, Float widthCm, Float extraFree) {
        this.idLuggage = idLuggage;
        this.idPassenger = idPassenger;
        this.idLuggageType = idLuggageType;
        this.luggageType = luggageType;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.widthCm = widthCm;
        this.extraFree = extraFree;
    }

    @Override
    public Long getIdLuggage() {
        return idLuggage;
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
    public LuggageTypeResponseDTOImpl getLuggageType() {
        return luggageType;
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
