package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IUsersEntity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "users")
public class UsersEntityImpl implements IUsersEntity, IEntity, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private BigInteger idUser;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "document_id", nullable = false)
    private String documentId;

    @Column(name = "passport_number", nullable = false)
    private String passportNumber;

    @Column(name = "registration_date", nullable = false)
    private LocalDate registrationDate;

    @Column(name = "flyer_number", nullable = false)
    private Long flyerNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "id_users_type")
    private BigInteger idUsersType;

    @ManyToOne
    @JoinColumn(name = "id_users_type", nullable = false, insertable = false, updatable = false)
    private UsersTypeEntityImpl usersType;

    @Column(name = "id_document_type")
    private BigInteger idDocumentType;

    @ManyToOne
    @JoinColumn(name = "id_document_type", nullable = false, insertable = false, updatable = false)
    private DocumentTypeEntityImpl documentType;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    public UsersEntityImpl() {}

    public UsersEntityImpl(String firstName, String lastName, String phoneNumber, String email, String nationality, LocalDate dateOfBirth, String documentId, String passportNumber, LocalDate registrationDate, Long flyerNumber, String address, BigInteger idUsersType, BigInteger idDocumentType, String passwordHash) {
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
        this.idDocumentType = idDocumentType;
        this.passwordHash = passwordHash;
    }

    public BigInteger getIdUsers() {
        return idUser;
    }

    @Override
    public void setIdUser(BigInteger idUser) {
        this.idUser = idUser;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    @Override
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getDocumentId() {
        return documentId;
    }

    @Override
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    @Override
    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public Long getFlyerNumber() {
        return flyerNumber;
    }

    @Override
    public void setFlyerNumber(Long flyerNumber) {
        this.flyerNumber = flyerNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public BigInteger getIdUsersType() {
        return idUsersType;
    }

    @Override
    public void setIdUsersType(BigInteger idUsersType) {
        this.idUsersType = idUsersType;
    }

    @Override
    public UsersTypeEntityImpl getUsersType() {
        return usersType;
    }

    @Override
    public void setUsersType(UsersTypeEntityImpl usersType) {
        this.usersType = usersType;
    }

    @Override
    public BigInteger getIdDocumentType() {
        return idDocumentType;
    }

    @Override
    public void setIdDocumentType(BigInteger idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    @Override
    public DocumentTypeEntityImpl getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentTypeEntityImpl documentType) {
        this.documentType = documentType;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntityImpl that = (UsersEntityImpl) o;
        return Objects.equals(idUser, that.idUser);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idUser);
    }

    @Override
    public String toString() {
        return "UsersEntityImpl{" +
                "idUser=" + idUser +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", documentId='" + documentId + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", registrationDate=" + registrationDate +
                ", flyerNumber=" + flyerNumber +
                ", address='" + address + '\'' +
                ", idUsersType=" + idUsersType +
                ", usersType=" + usersType +
                ", idDocumentType=" + idDocumentType +
                ", documentType=" + documentType +
                ", passwordHash='" + passwordHash + '\'' +
                '}';
    }
}
