package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.LuggageTypeResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.ILuggageTypeEntity;

public interface ILuggageTypeMapper {
    LuggageTypeResponseDTOImpl mapLuggageTypeEntityToLuggageTypeResponseDTO(ILuggageTypeEntity entity);
}
