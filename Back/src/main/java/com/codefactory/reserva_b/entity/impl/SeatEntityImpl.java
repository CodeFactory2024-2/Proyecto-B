package com.codefactory.reserva_b.entity.impl;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.ISeatEntity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "seat")
public class SeatEntityImpl implements ISeatEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seat")
    private BigInteger idSeat;

    @Column(name = "id_flight", nullable = false)
    private BigInteger idFlight;

    @Column(name = "seat_number", nullable = false)
    private String seatNumber;

    @Column(name = "is_reserved", nullable = false)
    private Boolean isReserved;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "id_seat_class", nullable = false)
    private BigInteger idSeatClass;

    @ManyToOne
    @JoinColumn(name = "id_seat_class", nullable = false, insertable = false, updatable = false)
    private SeatClassEntityImpl seatClass;

    public SeatEntityImpl() {}

    public SeatEntityImpl(BigInteger idFlight, String seatNumber, Boolean isReserved, Double price, BigInteger idSeatClass) {
        this.idFlight = idFlight;
        this.seatNumber = seatNumber;
        this.isReserved = isReserved;
        this.price = price;
        this.idSeatClass = idSeatClass;
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
    public BigInteger getIdFlight() {
        return idFlight;
    }

    @Override
    public void setIdFlight(BigInteger idFlight) {
        this.idFlight = idFlight;
    }

    @Override
    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Boolean getIsReserved() {
        return isReserved;
    }

    public void setIsReserved(Boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public BigInteger getIdSeatClass() {
        return idSeatClass;
    }

    @Override
    public void setIdSeatClass(BigInteger idSeatClass) {
        this.idSeatClass = idSeatClass;
    }

    @Override
    public SeatClassEntityImpl getSeatClass() {
        return seatClass;
    }

    @Override
    public void setSeatClass(SeatClassEntityImpl seatClass) {
        this.seatClass = seatClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeatEntityImpl that = (SeatEntityImpl) o;
        return Objects.equals(idSeat, that.idSeat);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idSeat);
    }

    @Override
    public String toString() {
        return "SeatEntityImpl{" +
                "idSeat=" + idSeat +
                ", idFlight=" + idFlight +
                ", seatNumber='" + seatNumber + '\'' +
                ", isReserved=" + isReserved +
                ", price=" + price +
                ", idSeatClass=" + idSeatClass +
                ", seatClass=" + seatClass +
                '}';
    }
}
