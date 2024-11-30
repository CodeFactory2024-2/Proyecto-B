package com.codefactory.reserva_b.dto.impl;

import com.codefactory.reserva_b.dto.interfaces.IUsersResponseDTO;

import java.util.List;

public class UsersResponseDTOImpl implements IUsersResponseDTO {
    private final Long idUser;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String email;
    private final String nationality;
    private final String dateOfBirth;
    private final String documentId;
    private final String passportNumber;
    private final String registrationDate;
    private final Integer flyerNumber;
    private final String address;
    private final Long idUsersType;
    private final UsersTypeResponseDTOImpl usersType;
    private final Long idDocumentType;
    private final DocumentTypeResponseDTOImpl documentType;
    private final List<RoleResponseDTOImpl> roles;

    public UsersResponseDTOImpl(Long idUser, String firstName, String lastName, String phoneNumber,
                                String email, String nationality, String dateOfBirth, String documentId,
                                String passportNumber, String registrationDate, Integer flyerNumber,
                                String address, Long idUsersType, UsersTypeResponseDTOImpl usersType,
                                Long idDocumentType, DocumentTypeResponseDTOImpl documentType, List<RoleResponseDTOImpl> roles) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.documentId = documentId;
        this.passportNumber = passportNumber;
        this.registrationDate = registrationDate;
        this.flyerNumber = flyerNumber;
        this.address = address;
        this.idUsersType = idUsersType;
        this.usersType = usersType;
        this.idDocumentType = idDocumentType;
        this.documentType = documentType;
        this.roles = roles;
    }

    @Override
    public Long getIdUser() {
        return idUser;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String getDocumentId() {
        return documentId;
    }

    @Override
    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public Integer getFlyerNumber() {
        return flyerNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public Long getIdUsersType() {return idUsersType; }

    @Override
    public UsersTypeResponseDTOImpl getUsersType() {
        return usersType;
    }

    @Override
    public Long getIdDocumentType() {return idDocumentType; }

    @Override
    public DocumentTypeResponseDTOImpl getDocumentType() {return documentType; }

    @Override
    public List<RoleResponseDTOImpl> getRoles() {
        return roles;
    }
}
