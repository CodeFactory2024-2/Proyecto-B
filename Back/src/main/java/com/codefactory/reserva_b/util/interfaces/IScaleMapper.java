package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.RoleResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.ScaleResponseDTOImpl;
import com.codefactory.reserva_b.entity.impl.RoleEntityImpl;
import com.codefactory.reserva_b.entity.impl.ScaleEntityImpl;
import com.codefactory.reserva_b.entity.interfaces.IScaleEntity;

import java.util.List;

public interface IScaleMapper {
    ScaleResponseDTOImpl mapScaleEntityToScaleResponseDTO(IScaleEntity entity);
    List<ScaleResponseDTOImpl> mapScaleEntitiesToScaleResponseDTOs(List<ScaleEntityImpl> scaleEntities);
}
