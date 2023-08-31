package com.dliriotech.backendtms.tables;

import javax.persistence.*;
@Entity
@Table(name = "tabla_equipos", schema = "qiwezwcd_tsm_system")
public class Equipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id")
    private Long primaryKey;

    @Column(name = "vehiculo")
    private String vehiculo;

    @Column(name = "num_posiciones")
    private int numPosiciones;

    @Column(name = "empresa")
    private String empresa;

    public Equipos() {
    }

    public Equipos(Long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Equipos(Long primaryKey, String vehiculo, int numPosiciones, String empresa) {
        this.primaryKey = primaryKey;
        this.vehiculo = vehiculo;
        this.numPosiciones = numPosiciones;
        this.empresa = empresa;
    }

    public Long getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumPosiciones() {
        return numPosiciones;
    }

    public void setNumPosiciones(int numPosiciones) {
        this.numPosiciones = numPosiciones;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "primaryKey=" + primaryKey +
                ", vehiculo='" + vehiculo + '\'' +
                ", numPosiciones=" + numPosiciones +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}
