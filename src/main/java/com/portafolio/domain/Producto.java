package com.portafolio.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;

    //muchos productos una categoria
    @ManyToOne //tipo de relacion, la relacion entre el producto y catergoria es de muchos a uno, un produtcyo tiene una categoria
    @JoinColumn(name = "id_categoria")
    Categoria categoria; //se le pone un nombre cualquiera en este caso categopria en minuscula,se le dice ese objetvo producto se va a relacionar
    //con categoria por medio de ese id_categoria, entonces todos los datos de categoria los vamos a guardar aqui, aqui si le puedo cambiar la categoria

    public Producto() {
    }

    public Producto(String descripcion, String detalle, double precio, int existencias, String imagen, boolean activo) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = imagen;
        this.activo = activo;
    }
}
