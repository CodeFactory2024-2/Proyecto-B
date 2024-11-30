package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.PermissionResponseDTOImpl;
import com.codefactory.reserva_b.entity.impl.PermissionEntityImpl;
import com.codefactory.reserva_b.entity.interfaces.IPermissionEntity;
import com.codefactory.reserva_b.util.interfaces.IPermissionMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PermissionMapperImpl implements IPermissionMapper {
    @Override
    public PermissionResponseDTOImpl mapPermissionEntityToPermissionResponseDTO(IPermissionEntity entity) {
        if (entity == null) {
            return null;
        }
        return new PermissionResponseDTOImpl(
                entity.getIdPermission().longValue(),
                entity.getName(),
                entity.getDescription()
        );
    }

    @Override
    public List<PermissionResponseDTOImpl> mapPermissionEntitiesToPermissionResponseDTOs(List<PermissionEntityImpl> permissionEntities) {
        if (permissionEntities == null) {
            return null;
        }
        return permissionEntities.stream()
                .map(this::mapPermissionEntityToPermissionResponseDTO)
                .collect(Collectors.toList());
    }
}
