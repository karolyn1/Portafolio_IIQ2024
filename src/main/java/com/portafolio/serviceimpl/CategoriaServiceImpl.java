
package com.portafolio.serviceimpl;

import com.portafolio.dao.CategoriaDao;
import com.portafolio.domain.Categoria;
import com.portafolio.service.CategoriaService;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategorias(boolean activo){
        List<Categoria> lista = categoriaDao.findAll();
        
        //filtar en caso de querer solo activos, remuvo los que no son activos
        if (activo) {
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }
}
