package com.codefactory.reserva_b.util.interfaces;

import com.codefactory.reserva_b.dto.impl.PermissionResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.RoleResponseDTOImpl;
import com.codefactory.reserva_b.entity.impl.PermissionEntityImpl;
import com.codefactory.reserva_b.entity.impl.RoleEntityImpl;
import com.codefactory.reserva_b.entity.interfaces.IRoleEntity;

import java.util.List;

public interface IRoleMapper {
    RoleResponseDTOImpl mapRoleEntityToRoleDTO(IRoleEntity entity);
    List<RoleResponseDTOImpl> mapRoleEntitiesToRoleResponseDTOs(List<RoleEntityImpl> roleEntities);
}
