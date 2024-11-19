package com.codefactory.reserva_b.entity.impl;

import com.codefactory.reserva_b.entity.interfaces.ICityEntity;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "city")
public class CityEntityImpl implements ICityEntity, IEntity, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_city")
    private BigInteger idCity;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "id_country", nullable = false)
    private BigInteger idCountry;

    @ManyToOne
    @JoinColumn(name = "id_country", nullable = false, insertable=false, updatable=false)
    private CountryEntityImpl country;

    @Column(name = "timezone", nullable = false)
    private String timezone;

    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @Column(name = "longitude", nullable = false)
    private Double longitude;

    public CityEntityImpl() {}

    public CityEntityImpl(String name, BigInteger idCountry,String timezone, Double latitude, Double longitude) {
        this.name = name;
        this.idCountry = idCountry;
        this.timezone = timezone;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public BigInteger getIdCity() {
        return idCity;
    }

    @Override
    public void setIdCity(BigInteger idCity) {
        this.idCity = idCity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BigInteger getIdCountry() {
        return idCountry;
    }

    @Override
    public void setIdCountry(BigInteger idCountry) {
        this.idCountry = idCountry;
    }

    @Override
    public CountryEntityImpl getCountry() {
        return country;
    }

    @Override
    public void setCountry(CountryEntityImpl country) {
        this.country = country;
    }

    @Override
    public String getTimezone() {
        return timezone;
    }

    @Override
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public Double getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public Double getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityEntityImpl that = (CityEntityImpl) o;
        return Objects.equals(idCity, that.idCity);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idCity);
    }

    @Override
    public String toString() {
        return "CityEntityImpl{" +
                "idCity=" + idCity +
                ", name='" + name + '\'' +
                ", idCountry=" + idCountry +
                ", country=" + country +
                ", timezone='" + timezone + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}