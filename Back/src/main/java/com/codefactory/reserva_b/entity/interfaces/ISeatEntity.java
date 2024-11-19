package com.codefactory.reserva_b.entity.interfaces;

import com.codefactory.reserva_b.entity.impl.SeatClassEntityImpl;

import java.math.BigInteger;

public interface ISeatEntity {
    // Getters
    BigInteger getIdSeat();
    BigInteger getIdFlight();
    String getSeatNumber();
    Boolean getIsReserved();
    Double getPrice();
    BigInteger getIdSeatClass();
    SeatClassEntityImpl getSeatClass();

    // Setters
    void setIdSeat(BigInteger idSeat);
    void setIdFlight(BigInteger idFlight);
    void setSeatNumber(String seatNumber);
    void setIsReserved(Boolean isReserved);
    void setPrice(Double price);
    void setIdSeatClass(BigInteger idSeatClass);
    void setSeatClass(SeatClassEntityImpl seatClass);
}
