package com.codefactory.reserva_b.entity.interfaces;

import com.codefactory.reserva_b.entity.impl.*;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

public interface IBookingEntity {
    // Getters
    BigInteger getIdBooking();
    BigInteger getIdFlight();
    FlightEntityImpl getFlight();
    BigInteger getIdUser();
    UsersEntityImpl getUser();
    LocalDateTime getBookingDate();
    BigInteger getIdBookingStatus();
    BookingStatusEntityImpl getBookingStatus();
    List<PassengerEntityImpl> getPassengers();
    PaymentEntityImpl getPayment();

    // Setters
    void setIdBooking(BigInteger idBooking);
    void setIdFlight(BigInteger idFlight);
    void setFlight(FlightEntityImpl flight);
    void setIdUser(BigInteger idUser);
    void setUser(UsersEntityImpl user);
    void setBookingDate(LocalDateTime bookingDate);
    void setIdBookingStatus(BigInteger idBookingStatus);
    void setBookingStatus(BookingStatusEntityImpl bookingStatus);
    void setPassengers(List<PassengerEntityImpl> passengers);
    void setPayment(PaymentEntityImpl payment);
}
