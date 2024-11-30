package com.codefactory.reserva_b.dto.interfaces;

import com.codefactory.reserva_b.dto.impl.DocumentTypeResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.RoleResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.UsersTypeResponseDTOImpl;

import java.util.List;

public interface IUsersResponseDTO {
    Long getIdUser();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getEmail();
    String getNationality();
    String getDateOfBirth();
    String getDocumentId();
    String getPassportNumber();
    String getRegistrationDate();
    Integer getFlyerNumber();
    String getAddress();
    Long getIdUsersType();
    UsersTypeResponseDTOImpl getUsersType();
    Long getIdDocumentType();
    DocumentTypeResponseDTOImpl getDocumentType();
    List<RoleResponseDTOImpl> getRoles();
}
