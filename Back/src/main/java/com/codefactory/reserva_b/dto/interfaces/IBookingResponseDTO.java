package com.codefactory.reserva_b.dto.interfaces;

import com.codefactory.reserva_b.dto.impl.*;

import java.time.LocalDateTime;
import java.util.List;

public interface IBookingResponseDTO {
    Long getIdBooking();
    Long getIdFlight();
    FlightResponseDTOImpl getFlight();
    Long getIdUser();
    UsersResponseDTOImpl getUser();
    LocalDateTime getBookingDate();
    Long getIdBookingStatus();
    BookingStatusResponseDTOImpl getBookingStatus();
    List<PassengerResponseDTOImpl> getPassengers();
    PaymentResponseDTOImpl getPayment();
}
