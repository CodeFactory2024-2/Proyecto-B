package com.codefactory.reserva_b.dto.interfaces;

import com.codefactory.reserva_b.dto.impl.LuggageTypeResponseDTOImpl;

public interface ILuggageResponseDTO {
    Long getIdLuggage();
    Long getIdPassenger();
    Long getIdLuggageType();
    LuggageTypeResponseDTOImpl getLuggageType();
    Float getHeightCm();
    Float getWeightKg();
    Float getWidthCm();
    Float getExtraFree();
}
