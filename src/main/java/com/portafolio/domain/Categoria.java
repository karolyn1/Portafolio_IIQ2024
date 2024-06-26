
package com.portafolio.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //automatica me crea set and get
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen; //al final hibernate lo transfroma en ruta imagen
    private boolean activo;

    public Categoria() {
    }
    
    
    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }  
    
}
