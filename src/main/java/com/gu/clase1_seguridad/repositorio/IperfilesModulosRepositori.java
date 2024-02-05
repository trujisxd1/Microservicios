package com.gu.clase1_seguridad.repositorio;


import com.gu.clase1_seguridad.modelos.ModulosModel;
import com.gu.clase1_seguridad.modelos.PerfilModel;
import com.gu.clase1_seguridad.modelos.PerfilesModulos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IperfilesModulosRepositori extends JpaRepository<PerfilesModulos,Long> {

    PerfilesModulos findByPerfilIdAndModuloId(PerfilModel perfilId, ModulosModel moduloId);

    List<PerfilesModulos>findByPerfilId(PerfilModel perfilId);


    void deleteByPerfilId(PerfilModel perfilId);

}
