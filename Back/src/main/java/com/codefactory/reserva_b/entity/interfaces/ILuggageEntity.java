package com.codefactory.reserva_b.entity.interfaces;

import com.codefactory.reserva_b.entity.impl.LuggageTypeEntityImpl;

import java.math.BigInteger;

public interface ILuggageEntity {
    // Getters
    BigInteger getIdLuggage();
    BigInteger getIdPassenger();
    BigInteger getIdLuggageType();
    LuggageTypeEntityImpl getLuggageType();
    Double getHeightCm();
    Double getWeightKg();
    Double getWidthCm();
    Double getExtraFree();

    // Setters
    void setIdLuggage(BigInteger idLuggage);
    void setIdPassenger(BigInteger idPassenger);
    void setHeightCm(Double heightCm);
    void setIdLuggageType(BigInteger idLuggageType);
    void setLuggageType(LuggageTypeEntityImpl luggageType);
    void setWeightKg(Double weightKg);
    void setWidthCm(Double widthCm);
    void setExtraFree(Double extraFree);
}
