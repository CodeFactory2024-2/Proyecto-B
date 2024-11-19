package com.codefactory.reserva_b.entity.impl;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IPassengerEntity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "passenger")
public class PassengerEntityImpl implements IPassengerEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_passenger")
    private BigInteger idPassenger;

    @Column(name = "id_seat", nullable = false)
    private BigInteger idSeat;

    @ManyToOne
    @JoinColumn(name = "id_seat", nullable = false, insertable=false, updatable=false)
    private SeatEntityImpl seat;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "document_id", nullable = false)
    private String documentId;

    @Column(name = "passport_number", nullable = false)
    private String passportNumber;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "luggage_included", nullable = false)
    private Boolean luggageIncluded;

    @Column(name = "id_document_type", nullable = false)
    private BigInteger idDocumentType;

    @ManyToOne
    @JoinColumn(name = "id_document_type", nullable = false, insertable=false, updatable=false)
    private DocumentTypeEntityImpl documentType;

    @OneToMany(mappedBy = "idPassenger", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LuggageEntityImpl> luggage;

    public PassengerEntityImpl() {}

    public PassengerEntityImpl(BigInteger idSeat, String firstName, String lastName, LocalDate dateOfBirth, String documentId, String passportNumber, String nationality, Boolean luggageIncluded, BigInteger idDocumentType) {
        this.idSeat = idSeat;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.documentId = documentId;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
        this.luggageIncluded = luggageIncluded;
        this.idDocumentType = idDocumentType;
    }

    @Override
    public BigInteger getIdPassenger() {
        return idPassenger;
    }

    @Override
    public void setIdPassenger(BigInteger idPassenger) {
        this.idPassenger = idPassenger;
    }

    @Override
    public BigInteger getIdSeat() {
        return idSeat;
    }

    @Override
    public void setIdSeat(BigInteger idSeat) {
        this.idSeat = idSeat;
    }

    @Override
    public SeatEntityImpl getSeat() {
        return seat;
    }

    @Override
    public void setSeat(SeatEntityImpl seat) {
        this.seat = seat;
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
    public String getNationality() {
        return nationality;
    }

    @Override
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public Boolean getLuggageIncluded() {
        return luggageIncluded;
    }

    @Override
    public void setLuggageIncluded(Boolean luggageIncluded) {
        this.luggageIncluded = luggageIncluded;
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

    @Override
    public void setDocumentType(DocumentTypeEntityImpl documentType) {
        this.documentType = documentType;
    }

    @Override
    public List<LuggageEntityImpl> getLuggage() {
        return luggage;
    }

    @Override
    public void setLuggage(List<LuggageEntityImpl> luggage) {
        this.luggage = luggage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerEntityImpl that = (PassengerEntityImpl) o;
        return Objects.equals(idPassenger, that.idPassenger);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPassenger);
    }

    @Override
    public String toString() {
        return "PassengerEntityImpl{" +
                "idPassenger=" + idPassenger +
                ", idSeat=" + idSeat +
                ", seat=" + seat +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", documentId='" + documentId + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                ", luggageIncluded=" + luggageIncluded +
                ", idDocumentType=" + idDocumentType +
                ", documentType=" + documentType +
                ", luggage=" + luggage +
                '}';
    }
}
