package com.codefactory.reserva_b.util.impl;

import com.codefactory.reserva_b.dto.impl.PermissionResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.RoleResponseDTOImpl;
import com.codefactory.reserva_b.entity.impl.RoleEntityImpl;
import com.codefactory.reserva_b.entity.interfaces.IRoleEntity;
import com.codefactory.reserva_b.util.interfaces.IPermissionMapper;
import com.codefactory.reserva_b.util.interfaces.IRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoleMapperImpl implements IRoleMapper {
    @Autowired
    private IPermissionMapper permissionMapper;
    @Override
    public RoleResponseDTOImpl mapRoleEntityToRoleDTO(IRoleEntity entity) {
        if (entity == null) {
            return null;
        }
        Long idRole = entity.getIdRole().longValue();
        String name = entity.getName();
        String description = entity.getDescription();
        List<PermissionResponseDTOImpl> permissions = entity.getPermissions() != null ?
                permissionMapper.mapPermissionEntitiesToPermissionResponseDTOs(entity.getPermissions()): null;

        return new RoleResponseDTOImpl(
                idRole,
                name,
                description,
                permissions
        );
    }

    @Override
    public List<RoleResponseDTOImpl> mapRoleEntitiesToRoleResponseDTOs(List<RoleEntityImpl> roleEntities) {
        if (roleEntities == null) {
            return null;
        }
        return roleEntities.stream()
                .map(this::mapRoleEntityToRoleDTO)
                .collect(Collectors.toList());
    }
}
