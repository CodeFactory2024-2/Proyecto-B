package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IPermissionResponseDTO;

public class PermissionResponseDTOImpl implements IPermissionResponseDTO {
    private final Long idPermission;
    private final String name;
    private final String description;

    public PermissionResponseDTOImpl(Long idPermission, String name, String description) {
        this.idPermission = idPermission;
        this.name = name;
        this.description = description;
    }

    @Override
    public Long getIdPermission() {
        return idPermission;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
