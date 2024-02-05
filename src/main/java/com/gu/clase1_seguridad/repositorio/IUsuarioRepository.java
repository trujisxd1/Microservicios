package com.gu.clase1_seguridad.repositorio;

import com.gu.clase1_seguridad.modelos.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<UsuarioModel,Long> {

    UsuarioModel findByCorreoAndEstado(String correo,Integer estado);

    UsuarioModel findByTokenAndEstado(String token,Integer estado);

    UsuarioModel findByCorreo(String correo);
}
