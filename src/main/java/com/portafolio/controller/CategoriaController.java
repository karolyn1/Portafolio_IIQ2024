
package com.portafolio.controller;

import org.springframework.stereotype.Controller;
import com.portafolio.domain.Categoria;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.portafolio.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
    
    @Autowired
    CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model) {
        List<Categoria> lista = categoriaService.getCategorias(false);
        model.addAttribute ("categorias", lista);
        model.addAttribute ("totalCategorias", lista.size();
        
        return "/categoria/listado";
    }
    
}
