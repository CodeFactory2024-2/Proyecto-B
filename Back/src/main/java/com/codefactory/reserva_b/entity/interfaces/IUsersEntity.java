package com.codefactory.reserva_b.entity.interfaces;

import com.codefactory.reserva_b.entity.impl.DocumentTypeEntityImpl;
import com.codefactory.reserva_b.entity.impl.UsersTypeEntityImpl;

import java.math.BigInteger;
import java.time.LocalDate;

public interface IUsersEntity {
    // Getters
    BigInteger getIdUsers();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getEmail();
    String getNationality();
    LocalDate getDateOfBirth();
    String getDocumentId();
    String getPassportNumber();
    LocalDate getRegistrationDate();
    Long getFlyerNumber();
    String getAddress();
    BigInteger getIdUsersType();
    UsersTypeEntityImpl getUsersType();
    BigInteger getIdDocumentType();
    DocumentTypeEntityImpl getDocumentType();

    // Setters
    void setIdUser(BigInteger idUser);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setPhoneNumber(String phoneNumber);
    void setEmail(String email);
    void setNationality(String nationality);
    void setDateOfBirth(LocalDate dateOfBirth);
    void setDocumentId(String documentId);
    void setPassportNumber(String passportNumber);
    void setRegistrationDate(LocalDate registrationDate);
    void setFlyerNumber(Long flyerNumber);
    void setAddress(String address);
    void setIdUsersType(BigInteger idUsersType);
    void setUsersType(UsersTypeEntityImpl usersType);
    void setIdDocumentType(BigInteger idDocumentType);
    void setDocumentType(DocumentTypeEntityImpl documentType);
    void setPasswordHash(String passwordHash);
}
