package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.CityResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.ScaleResponseDTOImpl;
import com.codefactory.reserva_b.entity.impl.ScaleEntityImpl;
import com.codefactory.reserva_b.entity.interfaces.IScaleEntity;
import com.codefactory.reserva_b.util.interfaces.ICityMapper;
import com.codefactory.reserva_b.util.interfaces.IScaleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Component
public class ScaleMapperImpl implements IScaleMapper {
    @Autowired
    private ICityMapper cityMapper;
    @Override
    public ScaleResponseDTOImpl mapScaleEntityToScaleResponseDTO(IScaleEntity entity) {
        if (entity == null) {
            return null;
        }

        Long idScale = entity.getIdScale().longValue();
        Long idFlight = entity.getIdFlight().longValue();
        Long idCity = entity.getIdCity().longValue();
        CityResponseDTOImpl city = entity.getCity() != null ?
                cityMapper.mapCityEntityToCityResponseDTO(entity.getCity()) : null;
        String arrivalTime = entity.getArrivalTime().toString();
        String departureTime = entity.toString();
        String layoverDuration = entity.getLayoverDuration().toString();

        return new ScaleResponseDTOImpl(
                idScale,
                idFlight,
                idCity,
                city,
                arrivalTime,
                departureTime,
                layoverDuration
        );
    }

    @Override
    public List<ScaleResponseDTOImpl> mapScaleEntitiesToScaleResponseDTOs(List<ScaleEntityImpl> scaleEntities) {
        return List.of();
    }
}
