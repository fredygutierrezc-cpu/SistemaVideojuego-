package com.sgiv.videojuegos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "almacen")
public class Almacen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_almacen")
    private Integer idAlmacen;

    @Column(nullable = false, length = 80)
    private String nombre;

    @Column(nullable = false, length = 120)
    private String ubicacion;

    @Column(length = 100)
    private String responsable;

    @Column(nullable = false)
    private Boolean activo = true;

    // Getters y Setters
    public Integer getIdAlmacen() { return idAlmacen; }
    public void setIdAlmacen(Integer id) { this.idAlmacen = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getResponsable() { return responsable; }
    public void setResponsable(String responsable) { this.responsable = responsable; }

    public Boolean getActivo() { return activo; }
    public void setActivo(Boolean activo) { this.activo = activo; }
}