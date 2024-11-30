package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.BookingResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.SeatClassResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.SeatResponseDTOImpl;
import com.codefactory.reserva_b.dto.interfaces.ISeatResponseDTO;
import com.codefactory.reserva_b.entity.impl.BookingEntityImpl;
import com.codefactory.reserva_b.entity.impl.SeatEntityImpl;
import com.codefactory.reserva_b.entity.interfaces.ISeatEntity;
import com.codefactory.reserva_b.util.interfaces.ISeatClassMapper;
import com.codefactory.reserva_b.util.interfaces.ISeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SeatMapperImpl implements ISeatMapper {
    @Autowired
    private ISeatClassMapper seatClassMapper;
    @Override
    public SeatResponseDTOImpl mapSeatEntityToSeatResponseDTO(ISeatEntity seatEntity) {
        if (seatEntity == null) {
            return null;
        }

        Long idSeat = seatEntity.getIdSeat().longValue();
        Long idFlight = seatEntity.getIdFlight().longValue();
        String seatNumber = seatEntity.getSeatNumber();
        Boolean isReserved = seatEntity.getIsReserved();
        Float price = seatEntity.getPrice() != null ? seatEntity.getPrice().floatValue() : null;
        Long idSeatClass = seatEntity.getIdSeatClass().longValue();
        SeatClassResponseDTOImpl seatClass = seatEntity.getSeatClass() != null ?
                seatClassMapper.mapSeatClassEntityToSeatClassResponseDTO(seatEntity.getSeatClass()) : null;

        return new SeatResponseDTOImpl(
                idSeat,
                idFlight,
                seatNumber,
                isReserved,
                price,
                idSeatClass,
                seatClass
        );
    }
    public List<SeatResponseDTOImpl> mapSeatEntitiesToSeatResponseDTOs(List<SeatEntityImpl> seatEntities) {
        if (seatEntities == null) {
            return null;
        }
        return seatEntities.stream()
                .map(this::mapSeatEntityToSeatResponseDTO)
                .collect(Collectors.toList());
    }
}
