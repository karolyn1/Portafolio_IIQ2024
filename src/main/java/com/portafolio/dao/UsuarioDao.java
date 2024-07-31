
package com.portafolio.dao;

import com.portafolio.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
    
    Usuario findByUsernameAndPassword(String username, String Password); //busca por password y nombre de usuario

    Usuario findByUsernameOrCorreo(String username, String correo); //busca por correo, y nombre de usuario

    boolean existsByUsernameOrCorreo(String username, String correo); //devuleve true o false
}

