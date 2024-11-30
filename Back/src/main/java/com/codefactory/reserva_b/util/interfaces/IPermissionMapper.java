package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.BookingResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.PermissionResponseDTOImpl;
import com.codefactory.reserva_b.entity.impl.BookingEntityImpl;
import com.codefactory.reserva_b.entity.impl.PermissionEntityImpl;
import com.codefactory.reserva_b.entity.interfaces.IPermissionEntity;

import java.util.List;

public interface IPermissionMapper {
    PermissionResponseDTOImpl mapPermissionEntityToPermissionResponseDTO(IPermissionEntity entity);
    List<PermissionResponseDTOImpl> mapPermissionEntitiesToPermissionResponseDTOs(List<PermissionEntityImpl> permissionEntities);
}
