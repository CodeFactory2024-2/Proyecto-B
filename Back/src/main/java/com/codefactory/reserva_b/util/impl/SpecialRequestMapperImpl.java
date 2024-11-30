package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.SpecialRequestResponseDTOImpl;
import com.codefactory.reserva_b.entity.impl.SpecialRequestEntityImpl;
import com.codefactory.reserva_b.entity.interfaces.ISpecialRequestEntity;
import com.codefactory.reserva_b.util.interfaces.ISpecialRequestMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SpecialRequestMapperImpl implements ISpecialRequestMapper {
    @Override
    public SpecialRequestResponseDTOImpl mapSpecialRequestEntityToSpecialRequestResponseDTO(ISpecialRequestEntity entity) {
        if (entity == null) {
            return null;
        }
        Long idSpecialRequest = entity.getIdSpecialRequest().longValue();
        String name = entity.getName();
        String description = entity.getDescription();
        return new SpecialRequestResponseDTOImpl(
                idSpecialRequest,
                name,
                description
        );
    }

    @Override
    public List<SpecialRequestResponseDTOImpl> mapSpecialRequestEntitiesToSpecialRequestResponseDTOs(List<SpecialRequestEntityImpl> specialRequestEntities) {
        if (specialRequestEntities == null) {
            return null;
        }
        return specialRequestEntities.stream()
                .map(this::mapSpecialRequestEntityToSpecialRequestResponseDTO)
                .collect(Collectors.toList());
    }
}
