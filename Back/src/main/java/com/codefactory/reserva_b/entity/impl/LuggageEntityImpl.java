package com.codefactory.reserva_b.entity.impl;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.ILuggageEntity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "luggage")
public class LuggageEntityImpl implements ILuggageEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_luggage")
    private BigInteger idLuggage;

    @Column(name = "id_passenger", nullable = false)
    private BigInteger idPassenger;

    @Column(name = "id_luggage_type")
    private BigInteger idLuggageType;

    @ManyToOne
    @JoinColumn(name = "id_luggage_type", nullable = false, insertable = false, updatable = false)
    private LuggageTypeEntityImpl luggageType;

    @Column(name = "height_cm", nullable = false)
    private Double heightCm;

    @Column(name = "weight_kg", nullable = false)
    private Double weightKg;

    @Column(name = "width_cm", nullable = false)
    private Double widthCm;

    @Column(name = "extra_free")
    private Double extraFree;

    public LuggageEntityImpl() {}

    public LuggageEntityImpl(BigInteger idPassenger, BigInteger idLuggageType, Double heightCm, Double weightKg, Double widthCm, Double extraFree) {
        this.idPassenger = idPassenger;
        this.idLuggageType = idLuggageType;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.widthCm = widthCm;
        this.extraFree = extraFree;
    }

    @Override
    public BigInteger getIdLuggage() {
        return idLuggage;
    }

    @Override
    public void setIdLuggage(BigInteger idLuggage) {
        this.idLuggage = idLuggage;
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
    public BigInteger getIdLuggageType() {
        return idLuggageType;
    }

    @Override
    public void setIdLuggageType(BigInteger idLuggageType) {
        this.idLuggageType = idLuggageType;
    }

    @Override
    public LuggageTypeEntityImpl getLuggageType() {
        return luggageType;
    }

    @Override
    public void setLuggageType(LuggageTypeEntityImpl luggageType) {
        this.luggageType = luggageType;
    }

    @Override
    public Double getHeightCm() {
        return heightCm;
    }

    @Override
    public void setHeightCm(Double heightCm) {
        this.heightCm = heightCm;
    }

    @Override
    public Double getWeightKg() {
        return weightKg;
    }

    @Override
    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    public Double getWidthCm() {
        return widthCm;
    }

    @Override
    public void setWidthCm(Double widthCm) {
        this.widthCm = widthCm;
    }

    @Override
    public Double getExtraFree() {
        return extraFree;
    }

    @Override
    public void setExtraFree(Double extraFree) {
        this.extraFree = extraFree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LuggageEntityImpl that = (LuggageEntityImpl) o;
        return Objects.equals(idLuggage, that.idLuggage);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idLuggage);
    }

    @Override
    public String toString() {
        return "LuggageEntityImpl{" +
                "idLuggage=" + idLuggage +
                ", idPassenger=" + idPassenger +
                ", idLuggageType=" + idLuggageType +
                ", luggageType=" + luggageType +
                ", heightCm=" + heightCm +
                ", weightKg=" + weightKg +
                ", widthCm=" + widthCm +
                ", extraFree=" + extraFree +
                '}';
    }
}
