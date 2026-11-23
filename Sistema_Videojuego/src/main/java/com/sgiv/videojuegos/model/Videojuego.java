package com.sgiv.videojuegos.model;

import com.sgiv.videojuegos.enums.ClasificacionEdad;
import com.sgiv.videojuegos.enums.EstadoProducto;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "videojuego")
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_videojuego")
    private Integer idVideojuego;

    @Column(nullable = false, length = 120)
    private String titulo;

    @Column(nullable = false, length = 60)
    private String plataforma;

    @Column(length = 100)
    private String desarrollador;

    @Column(name = "anio_lanzamiento")
    private Integer anioLanzamiento;

    @Enumerated(EnumType.STRING)
    @Column(name = "clasificacion")
    private ClasificacionEdad clasificacion;

    @Column(name = "precio_compra", precision = 10, scale = 2)
    private BigDecimal precioCompra;

    @Column(name = "precio_venta", precision = 10, scale = 2)
    private BigDecimal precioVenta;

    @Column(name = "stock_actual")
    private Integer stockActual;

    @Column(name = "stock_minimo")
    private Integer stockMinimo;

    @Column(name = "stock_maximo")
    private Integer stockMaximo;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private EstadoProducto estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    // Getters y Setters
    public Integer getIdVideojuego() { return idVideojuego; }
    public void setIdVideojuego(Integer id) { this.idVideojuego = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public String getDesarrollador() { return desarrollador; }
    public void setDesarrollador(String desarrollador) { this.desarrollador = desarrollador; }

    public Integer getAnioLanzamiento() { return anioLanzamiento; }
    public void setAnioLanzamiento(Integer anio) { this.anioLanzamiento = anio; }

    public ClasificacionEdad getClasificacion() { return clasificacion; }
    public void setClasificacion(ClasificacionEdad c) { this.clasificacion = c; }

    public BigDecimal getPrecioCompra() { return precioCompra; }
    public void setPrecioCompra(BigDecimal p) { this.precioCompra = p; }

    public BigDecimal getPrecioVenta() { return precioVenta; }
    public void setPrecioVenta(BigDecimal p) { this.precioVenta = p; }

    public Integer getStockActual() { return stockActual; }
    public void setStockActual(Integer s) { this.stockActual = s; }

    public Integer getStockMinimo() { return stockMinimo; }
    public void setStockMinimo(Integer s) { this.stockMinimo = s; }

    public Integer getStockMaximo() { return stockMaximo; }
    public void setStockMaximo(Integer s) { this.stockMaximo = s; }

    public EstadoProducto getEstado() { return estado; }
    public void setEstado(EstadoProducto e) { this.estado = e; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}