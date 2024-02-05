package com.gu.clase1_seguridad.repositorio;


import com.gu.clase1_seguridad.modelos.ModulosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImodulosRepositori extends JpaRepository<ModulosModel,Long> {

    ModulosModel findAllByNombre(String nombre);

}
