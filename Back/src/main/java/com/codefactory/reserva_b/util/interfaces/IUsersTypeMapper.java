package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.UsersTypeResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IUsersTypeEntity;

public interface IUsersTypeMapper {
    UsersTypeResponseDTOImpl mapUsersTypeEntityToUsersTypeResponseDTO(IUsersTypeEntity entity);
}
