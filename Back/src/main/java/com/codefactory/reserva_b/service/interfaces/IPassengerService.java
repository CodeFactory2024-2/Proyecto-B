package com.codefactory.reserva_b.service.interfaces;

import com.codefactory.reserva_b.dto.impl.BookingResponseDTOImpl;
import com.codefactory.reserva_b.dto.impl.PassengerRequestDTOImpl;
import com.codefactory.reserva_b.dto.impl.PassengerResponseDTOImpl;
import com.codefactory.reserva_b.entity.impl.BookingEntityImpl;
import com.codefactory.reserva_b.entity.impl.PassengerEntityImpl;

import java.math.BigInteger;
import java.util.List;

public interface IPassengerService {
    PassengerResponseDTOImpl findPassengerByIdPassenger(String id);
    List<PassengerResponseDTOImpl> findPassengersByIdBooking(String idBooking);
    PassengerResponseDTOImpl addPassenger(PassengerRequestDTOImpl passenger, String idBooking);
    BookingResponseDTOImpl deletePassenger(String idPassenger, String idBooking);
    PassengerResponseDTOImpl editPassengerSeat(String idPassenger, String idSeat);
    PassengerResponseDTOImpl editPassengerInfo(String idPassenger, PassengerRequestDTOImpl passenger);
    PassengerResponseDTOImpl addSpecialRequestToPassenger(String idPassenger, String idSpecialRequest);
}
