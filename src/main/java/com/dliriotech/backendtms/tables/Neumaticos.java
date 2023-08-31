package com.dliriotech.backendtms.tables;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "consolidado", schema = "qiwezwcd_tsm_system")
public class Neumaticos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_llantas")
    @Getter @Setter
    private Long primaryKey;

    @Getter @Setter
    private String base;

    @Getter @Setter
    private String operacion;

    @Getter @Setter
    private String vehiculo;

    @Getter @Setter
    private String ruta;

    @Getter @Setter
    private String configuracion;

    @Getter @Setter
    private String placa;

    @Getter @Setter
    private int posicion;

    @Getter @Setter
    private String cod_interno;

    @Getter @Setter
    private String medida;

    @Getter @Setter
    private String marca;

    @Getter @Setter
    private String diseno;

    @Getter @Setter
    private int dot;

    @Getter @Setter
    private double precio;

    @Getter @Setter
    private String estado;

    @Getter @Setter
    private String diseno_reencauche;

    @Getter @Setter
    private int rtd_original;

    @Getter @Setter
    private int rtd_para_reencauche;

    @Getter @Setter
    private int rtd_instalacion;

    @Getter @Setter
    private int km_instalacion;

    @Getter @Setter
    private String fecha_instalacion;

    @Getter @Setter
    private int rtd_actual;

    @Getter @Setter
    private int km_actual;

    @Getter @Setter
    private int fecha_actual;

    @Getter @Setter
    private double km_entre_mm;

    @Getter @Setter
    private int rtd_gastado;

    @Getter @Setter
    private double porcent_consumido;

    @Getter @Setter
    private int km_recorrido;

    @Getter @Setter
    private double km_proyectado;

    @Getter @Setter
    private String situacion;

    @Getter @Setter
    private String observacion;

    @Getter @Setter
    private String empresa;

    public Neumaticos() {
    }

    public Neumaticos(Long primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Neumaticos(Long primaryKey, String base, String operacion, String vehiculo, String ruta, String configuracion,
                      String placa, int posicion, String cod_interno, String medida, String marca, String diseno, int dot,
                      double precio, String estado, String diseno_reencauche, int rtd_original, int rtd_para_reencauche,
                      int rtd_instalacion, int km_instalacion, String fecha_instalacion, int rtd_actual, int km_actual,
                      int fecha_actual, double km_entre_mm, int rtd_gastado, double porcent_consumido, int km_recorrido,
                      double km_proyectado, String situacion, String observacion, String empresa) {

        this.primaryKey = primaryKey;
        this.base = base;
        this.operacion = operacion;
        this.vehiculo = vehiculo;
        this.ruta = ruta;
        this.configuracion = configuracion;
        this.placa = placa;
        this.posicion = posicion;
        this.cod_interno = cod_interno;
        this.medida = medida;
        this.marca = marca;
        this.diseno = diseno;
        this.dot = dot;
        this.precio = precio;
        this.estado = estado;
        this.diseno_reencauche = diseno_reencauche;
        this.rtd_original = rtd_original;
        this.rtd_para_reencauche = rtd_para_reencauche;
        this.rtd_instalacion = rtd_instalacion;
        this.km_instalacion = km_instalacion;
        this.fecha_instalacion = fecha_instalacion;
        this.rtd_actual = rtd_actual;
        this.km_actual = km_actual;
        this.fecha_actual = fecha_actual;
        this.km_entre_mm = km_entre_mm;
        this.rtd_gastado = rtd_gastado;
        this.porcent_consumido = porcent_consumido;
        this.km_recorrido = km_recorrido;
        this.km_proyectado = km_proyectado;
        this.situacion = situacion;
        this.observacion = observacion;
        this.empresa = empresa;
    }
}
