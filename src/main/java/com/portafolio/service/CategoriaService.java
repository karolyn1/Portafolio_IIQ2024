
package com.portafolio.service;

import com.portafolio.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //metodo que obtiene lista de categorias
    public List<Categoria> getCategorias(boolean activo);
    
}
