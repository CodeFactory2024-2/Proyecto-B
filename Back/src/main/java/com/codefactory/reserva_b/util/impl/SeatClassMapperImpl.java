package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.SeatClassResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.ISeatClassEntity;
import com.codefactory.reserva_b.util.interfaces.ISeatClassMapper;
import org.springframework.stereotype.Component;

@Component
public class SeatClassMapperImpl implements ISeatClassMapper {
    @Override
    public SeatClassResponseDTOImpl mapSeatClassEntityToSeatClassResponseDTO(ISeatClassEntity entity) {
        if (entity == null) {
            return null;
        }
        return new SeatClassResponseDTOImpl(
                entity.getIdSeatClass().longValue(),
                entity.getName()
        );
    }
}
