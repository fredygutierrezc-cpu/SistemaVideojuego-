package com.sgiv.videojuegos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "proveedor")
public class Proeveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Integer idProveedor;

    @Column(name = "razon_social", nullable = false, length = 120)
    private String razonSocial;

    @Column(unique = true, length = 20)
    private String ruc;

    @Column(length = 20)
    private String telefono;

    @Column(length = 100)
    private String email;

    @Column(columnDefinition = "TEXT")
    private String direccion;

    @Column(nullable = false)
    private Boolean activo = true;

    // Getters y Setters
    public Integer getIdProveedor() { return idProveedor; }
    public void setIdProveedor(Integer id) { this.idProveedor = id; }

    public String getRazonSocial() { return razonSocial; }
    public void setRazonSocial(String r) { this.razonSocial = r; }

    public String getRuc() { return ruc; }
    public void setRuc(String ruc) { this.ruc = ruc; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public Boolean getActivo() { return activo; }
    public void setActivo(Boolean activo) { this.activo = activo; }
}