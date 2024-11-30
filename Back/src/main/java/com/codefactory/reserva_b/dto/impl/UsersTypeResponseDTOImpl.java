package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IUsersTypeResponseDTO;

public class UsersTypeResponseDTOImpl implements IUsersTypeResponseDTO {
    private final Long idUsersType;
    private final String name;
    private final String description;

    public UsersTypeResponseDTOImpl(Long idUsersType, String name, String description) {
        this.idUsersType = idUsersType;
        this.name = name;
        this.description = description;
    }

    @Override
    public Long getIdUsersType() {
        return idUsersType;
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
