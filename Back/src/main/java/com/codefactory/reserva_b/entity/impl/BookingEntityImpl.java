package com.codefactory.reserva_b.entity.impl;
import com.codefactory.reserva_b.entity.interfaces.IBookingEntity;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "booking")
public class BookingEntityImpl implements IBookingEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_booking", nullable = false)
    private BigInteger idBooking;

    @Column(name = "id_flight", nullable = false)
    private BigInteger idFlight;

    @ManyToOne
    @JoinColumn(name = "id_flight", nullable = false, insertable = false, updatable = false)
    private FlightEntityImpl flight;

    @Column(name = "id_user", nullable = false)
    private BigInteger idUser;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false, insertable = false, updatable = false)
    private UsersEntityImpl user;

    @Column(name = "booking_date", nullable = false)
    private LocalDateTime bookingDate;

    @Column(name = "id_booking_status", nullable = false)
    private BigInteger idBookingStatus;

    @ManyToOne
    @JoinColumn(name = "id_booking_status", nullable = false, insertable = false, updatable = false)
    private BookingStatusEntityImpl bookingStatus;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(name = "booking_passenger", joinColumns = @JoinColumn(name = "id_booking"), inverseJoinColumns = @JoinColumn(name = "id_passenger"))
    private List<PassengerEntityImpl> passengers;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_booking")
    private PaymentEntityImpl payment;

    // Constructor por defecto
    public BookingEntityImpl() {
    }

    // Constructor con todos los campos
    public BookingEntityImpl(BigInteger idFlight, BigInteger idUser, LocalDateTime bookingDate, BigInteger idBookingStatus) {
        this.idFlight = idFlight;
        this.idUser = idUser;
        this.bookingDate = bookingDate;
        this.idBookingStatus = idBookingStatus;
    }

    @Override
    public BigInteger getIdBooking() {
        return idBooking;
    }

    @Override
    public void setIdBooking(BigInteger idBooking) {
        this.idBooking = idBooking;
    }

    @Override
    public BigInteger getIdFlight() {
        return idFlight;
    }

    @Override
    public void setIdFlight(BigInteger idFlight) {
        this.idFlight = idFlight;
    }

    @Override
    public FlightEntityImpl getFlight() {
        return flight;
    }

    @Override
    public void setFlight(FlightEntityImpl flight) {
        this.flight = flight;
    }

    @Override
    public BigInteger getIdUser() {
        return idUser;
    }

    @Override
    public void setIdUser(BigInteger idUser) {
        this.idUser = idUser;
    }

    @Override
    public UsersEntityImpl getUser() {
        return user;
    }

    @Override
    public void setUser(UsersEntityImpl user) {
        this.user = user;
    }

    @Override
    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    @Override
    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public BigInteger getIdBookingStatus() {
        return idBookingStatus;
    }

    @Override
    public void setIdBookingStatus(BigInteger idBookingStatus) {
        this.idBookingStatus = idBookingStatus;
    }

    @Override
    public BookingStatusEntityImpl getBookingStatus() {
        return bookingStatus;
    }

    @Override
    public void setBookingStatus(BookingStatusEntityImpl bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public List<PassengerEntityImpl> getPassengers() {
        return passengers;
    }

    @Override
    public void setPassengers(List<PassengerEntityImpl> passengers) {
        this.passengers = passengers;
    }

    @Override
    public PaymentEntityImpl getPayment() {
        return payment;
    }

    @Override
    public void setPayment(PaymentEntityImpl payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingEntityImpl that = (BookingEntityImpl) o;
        return Objects.equals(idBooking, that.idBooking);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idBooking);
    }

    @Override
    public String toString() {
        return "BookingEntityImpl{" +
                "idBooking=" + idBooking +
                ", idFlight=" + idFlight +
                ", flight=" + flight +
                ", idUser=" + idUser +
                ", user=" + user +
                ", bookingDate=" + bookingDate +
                ", bookingStatus='" + bookingStatus + '\'' +
                ", passengers=" + passengers +
                ", payment=" + payment +
                '}';
    }
}
