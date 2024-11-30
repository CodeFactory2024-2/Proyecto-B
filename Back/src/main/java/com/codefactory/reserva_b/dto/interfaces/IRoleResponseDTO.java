package com.codefactory.reserva_b.dto.interfaces;

import com.codefactory.reserva_b.dto.impl.PermissionResponseDTOImpl;

import java.util.List;

public interface IRoleResponseDTO {
    Long getIdRole();
    String getName();
    String getDescription();
    List<PermissionResponseDTOImpl> getPermissions();
}
