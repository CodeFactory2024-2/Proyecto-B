package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IPermissionResponseDTO;
import com.codefactory.reserva_b.dto.interfaces.IRoleResponseDTO;

import java.util.List;

public class RoleResponseDTOImpl implements IRoleResponseDTO {
    private final Long idRole;
    private final String name;
    private final String description;
    private final List<PermissionResponseDTOImpl> permissions;

    public RoleResponseDTOImpl(Long idRole, String name, String description, List<PermissionResponseDTOImpl> permissions) {
        this.idRole = idRole;
        this.name = name;
        this.description = description;
        this.permissions = permissions;
    }

    @Override
    public Long getIdRole() {
        return idRole;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public List<PermissionResponseDTOImpl> getPermissions() {
        return permissions;
    }
}
