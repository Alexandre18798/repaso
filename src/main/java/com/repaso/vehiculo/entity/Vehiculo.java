package com.repaso.vehiculo.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "vehiculo")
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VEHICULO54")
    private Integer idVehiculo54;

    @Column(name = "ESTADO54")
    private Boolean estado54;

    @Size(max = 10)
    @Column(name = "PLACA54")
    private String placa54;

    @Size(max = 50)
    @Column(name = "MARCA54")
    private String marca54;

    @Size(max = 50)
    @Column(name = "MODELO54")
    private String modelo54;

    @Size(max = 30)
    @Column(name = "COLOR54")
    private String color54;

    @Column(name = "PRECIO_DIA54")
    private BigDecimal precioDia54;

    public Vehiculo() {
    }

    public Vehiculo(Integer idVehiculo54) {
        this.idVehiculo54 = idVehiculo54;
    }

    public Integer getIdVehiculo54() {
        return idVehiculo54;
    }

    public void setIdVehiculo54(Integer idVehiculo54) {
        this.idVehiculo54 = idVehiculo54;
    }

    public Boolean getEstado54() {
        return estado54;
    }

    public void setEstado54(Boolean estado54) {
        this.estado54 = estado54;
    }

    public String getPlaca54() {
        return placa54;
    }

    public void setPlaca54(String placa54) {
        this.placa54 = placa54;
    }

    public String getMarca54() {
        return marca54;
    }

    public void setMarca54(String marca54) {
        this.marca54 = marca54;
    }

    public String getModelo54() {
        return modelo54;
    }

    public void setModelo54(String modelo54) {
        this.modelo54 = modelo54;
    }

    public String getColor54() {
        return color54;
    }

    public void setColor54(String color54) {
        this.color54 = color54;
    }

    public BigDecimal getPrecioDia54() {
        return precioDia54;
    }

    public void setPrecioDia54(BigDecimal precioDia54) {
        this.precioDia54 = precioDia54;
    }

    @Override
    public String toString() {
        return "com.repaso.vehiculo.entity.Vehiculo[ idVehiculo54=" + idVehiculo54 + " ]";
    }
}