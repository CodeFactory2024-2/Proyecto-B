package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.RoleResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.SpecialRequestResponseDTOImpl;
import com.codefactory.reserva_b.entity.impl.RoleEntityImpl;
import com.codefactory.reserva_b.entity.impl.SpecialRequestEntityImpl;
import com.codefactory.reserva_b.entity.interfaces.ISpecialRequestEntity;

import java.util.List;

public interface ISpecialRequestMapper {
    SpecialRequestResponseDTOImpl mapSpecialRequestEntityToSpecialRequestResponseDTO(ISpecialRequestEntity entity);
    List<SpecialRequestResponseDTOImpl> mapSpecialRequestEntitiesToSpecialRequestResponseDTOs(List<SpecialRequestEntityImpl> specialRequestEntities);
}
