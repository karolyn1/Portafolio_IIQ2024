
package com.portafolio.dao;

import com.portafolio.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {    
    Usuario findByUsername(String username); //busca por nombre de usuario
}
