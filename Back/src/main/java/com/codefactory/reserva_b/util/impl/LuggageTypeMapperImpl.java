package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.LuggageTypeResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.ILuggageTypeEntity;
import com.codefactory.reserva_b.util.interfaces.ILuggageTypeMapper;
import org.springframework.stereotype.Component;

@Component
public class LuggageTypeMapperImpl implements ILuggageTypeMapper {
    @Override
    public LuggageTypeResponseDTOImpl mapLuggageTypeEntityToLuggageTypeResponseDTO(ILuggageTypeEntity entity) {
        if (entity == null) {
                return null;
            }
            return new LuggageTypeResponseDTOImpl(
                    entity.getIdLuggageType().longValue(),
                    entity.getName()
            );
        }
    }
