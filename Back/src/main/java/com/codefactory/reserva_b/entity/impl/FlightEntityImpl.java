package com.codefactory.reserva_b.entity.impl;
import com.codefactory.reserva_b.entity.interfaces.IEntity;
import com.codefactory.reserva_b.entity.interfaces.IFlightEntity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "flight")
public class FlightEntityImpl implements IFlightEntity, IEntity, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_flight")
    private BigInteger idFlight;

    @Column(name = "flight_number", nullable = false)
    private Long flightNumber;

    @Column(name = "id_plane", nullable = false)
    private BigInteger idPlane;

    @ManyToOne
    @JoinColumn(name = "id_plane", nullable = false, insertable=false, updatable=false)
    private PlaneEntityImpl plane;

    @Column(name = "id_departure_city", nullable = false)
    private BigInteger idDepartureCity;

    @ManyToOne
    @JoinColumn(name = "id_departure_city", nullable = false, insertable=false, updatable=false)
    private CityEntityImpl departureCity;

    @Column(name = "id_arrival_city", nullable = false)
    private BigInteger idArrivalCity;

    @ManyToOne
    @JoinColumn(name = "id_arrival_city", nullable = false, insertable=false, updatable=false)
    private CityEntityImpl arrivalCity;

    @Column(name = "departure_time", nullable = false)
    private LocalDateTime departureTime;

    @Column(name = "arrival_time", nullable = false)
    private LocalDateTime arrivalTime;

    @Column(name = "id_flight_status", nullable = false)
    private BigInteger idFlightStatus;

    @ManyToOne
    @JoinColumn(name = "id_flight_status", nullable = false, insertable=false, updatable=false)
    private FlightStatusEntityImpl flightStatus;

    @Column(name = "flight_duration", nullable = false)
    private String flightDuration;

    @Column(name = "distance_km", nullable = false)
    private Double distanceKm;

    @Column(name = "seats", nullable = false)
    private Integer seats;

    @Column(name = "id_captain", nullable = false)
    private BigInteger idCaptain;

    @ManyToOne
    @JoinColumn(name = "id_captain", nullable = false, insertable=false, updatable=false)
    private PilotEntityImpl captain;

    @Column(name = "id_sub_captain")
    private BigInteger idSubCaptain;

    @ManyToOne
    @JoinColumn(name = "id_sub_captain", insertable=false, updatable=false)
    private PilotEntityImpl subCaptain;

    @Column(name = "price_economy", nullable = false)
    private Double priceEconomy;

    @Column(name = "price_business", nullable = false)
    private Double priceBusiness;

    @Column(name = "price_first_class", nullable = false)
    private Double priceFirstClass;

    @OneToMany(mappedBy = "idFlight", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ScaleEntityImpl> scales;

    public FlightEntityImpl() {}

    public FlightEntityImpl(BigInteger idPlane, Long flightNumber, BigInteger idDepartureCity, BigInteger idArrivalCity, LocalDateTime departureTime, LocalDateTime arrivalTime, BigInteger idFlightStatus, String flightDuration, Double distanceKm, Integer seats, BigInteger idCaptain, BigInteger idSubCaptain, Double priceEconomy, Double priceBusiness, Double priceFirstClass) {
        this.idPlane = idPlane;
        this.flightNumber = flightNumber;
        this.idDepartureCity = idDepartureCity;
        this.idArrivalCity = idArrivalCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.idFlightStatus = idFlightStatus;
        this.flightDuration = flightDuration;
        this.distanceKm = distanceKm;
        this.seats = seats;
        this.idCaptain = idCaptain;
        this.idSubCaptain = idSubCaptain;
        this.priceEconomy = priceEconomy;
        this.priceBusiness = priceBusiness;
        this.priceFirstClass = priceFirstClass;
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
    public Long getFlightNumber() {
        return flightNumber;
    }

    @Override
    public void setFlightNumber(Long flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public BigInteger getIdPlane() {
        return idPlane;
    }

    @Override
    public void setIdPlane(BigInteger idPlane) {
        this.idPlane = idPlane;
    }

    @Override
    public PlaneEntityImpl getPlane() {
        return plane;
    }

    @Override
    public void setPlane(PlaneEntityImpl plane) {
        this.plane = plane;
    }

    @Override
    public BigInteger getIdDepartureCity() {
        return idDepartureCity;
    }

    @Override
    public void setIdDepartureCity(BigInteger idDepartureCity) {
        this.idDepartureCity = idDepartureCity;
    }

    @Override
    public CityEntityImpl getDepartureCity() {
        return departureCity;
    }

    @Override
    public void setDepartureCity(CityEntityImpl departureCity) {
        this.departureCity = departureCity;
    }

    @Override
    public BigInteger getIdArrivalCity() {
        return idArrivalCity;
    }

    @Override
    public void setIdArrivalCity(BigInteger idArrivalCity) {
        this.idArrivalCity = idArrivalCity;
    }

    @Override
    public CityEntityImpl getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public void setArrivalCity(CityEntityImpl arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    @Override
    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public BigInteger getIdFlightStatus() {
        return idFlightStatus;
    }

    @Override
    public void setIdFlightStatus(BigInteger idFlightStatus) {
        this.idFlightStatus = idFlightStatus;
    }

    @Override
    public FlightStatusEntityImpl getFlightStatus() {
        return flightStatus;
    }

    @Override
    public void setFlightStatus(FlightStatusEntityImpl flightStatus) {
        this.flightStatus = flightStatus;
    }

    @Override
    public String getFlightDuration() {
        return flightDuration;
    }

    @Override
    public void setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
    }

    @Override
    public Double getDistanceKm() {
        return distanceKm;
    }

    @Override
    public void setDistanceKm(Double distanceKm) {
        this.distanceKm = distanceKm;
    }

    @Override
    public BigInteger getIdCaptain() {
        return idCaptain;
    }

    @Override
    public void setIdCaptain(BigInteger idCaptain) {
        this.idCaptain = idCaptain;
    }

    @Override
    public Integer getSeats() {
        return seats;
    }

    @Override
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    @Override
    public PilotEntityImpl getCaptain() {
        return captain;
    }

    @Override
    public void setCaptain(PilotEntityImpl captain) {
        this.captain = captain;
    }

    @Override
    public BigInteger getIdSubCaptain() {
        return idSubCaptain;
    }

    @Override
    public void setIdSubCaptain(BigInteger idSubCaptain) {
        this.idSubCaptain = idSubCaptain;
    }

    @Override
    public PilotEntityImpl getSubCaptain() {
        return subCaptain;
    }

    @Override
    public void setSubCaptain(PilotEntityImpl subCaptain) {
        this.subCaptain = subCaptain;
    }

    @Override
    public Double getPriceEconomy() {
        return priceEconomy;
    }

    @Override
    public void setPriceEconomy(Double priceEconomy) {
        this.priceEconomy = priceEconomy;
    }

    @Override
    public Double getPriceBusiness() {
        return priceBusiness;
    }

    @Override
    public void setPriceBusiness(Double priceBusiness) {
        this.priceBusiness = priceBusiness;
    }

    @Override
    public Double getPriceFirstClass() {
        return priceFirstClass;
    }

    @Override
    public void setPriceFirstClass(Double priceFirstClass) {
        this.priceFirstClass = priceFirstClass;
    }

    @Override
    public List<ScaleEntityImpl> getScales() {
        return scales;
    }

    @Override
    public void setScales(List<ScaleEntityImpl> scales) {
        this.scales = scales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightEntityImpl that = (FlightEntityImpl) o;
        return Objects.equals(idFlight, that.idFlight);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idFlight);
    }

    @Override
    public String toString() {
        return "FlightEntityImpl{" +
                "idFlight=" + idFlight +
                ", flightNumber=" + flightNumber +
                ", idPlane=" + idPlane +
                ", plane=" + plane +
                ", idDepartureCity=" + idDepartureCity +
                ", departureCity=" + departureCity +
                ", idArrivalCity=" + idArrivalCity +
                ", arrivalCity=" + arrivalCity +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", idFlightStatus=" + idFlightStatus +
                ", flightStatus=" + flightStatus +
                ", flightDuration='" + flightDuration + '\'' +
                ", distanceKm=" + distanceKm +
                ", seats=" + seats +
                ", idCaptain=" + idCaptain +
                ", captain=" + captain +
                ", idSubCaptain=" + idSubCaptain +
                ", subCaptain=" + subCaptain +
                ", priceEconomy=" + priceEconomy +
                ", priceBusiness=" + priceBusiness +
                ", priceFirstClass=" + priceFirstClass +
                ", scales=" + scales +
                '}';
    }
}