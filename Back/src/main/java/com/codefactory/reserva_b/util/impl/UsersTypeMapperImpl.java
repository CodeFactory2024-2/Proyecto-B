package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.UsersTypeResponseDTOImpl;
import com.codefactory.reserva_b.entity.interfaces.IUsersTypeEntity;
import com.codefactory.reserva_b.util.interfaces.IUsersTypeMapper;
import org.springframework.stereotype.Component;

@Component
public class UsersTypeMapperImpl implements IUsersTypeMapper {
    @Override
    public UsersTypeResponseDTOImpl mapUsersTypeEntityToUsersTypeResponseDTO(IUsersTypeEntity entity) {
        if (entity == null) {
            return null;
        }
        return new UsersTypeResponseDTOImpl(
                entity.getIdUsersType().longValue(),
                entity.getName(),
                entity.getDescription()
        );
    }
}
