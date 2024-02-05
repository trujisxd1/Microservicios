package com.gu.clase1_seguridad.dto;


import com.gu.clase1_seguridad.modelos.PerfilModel;
import com.gu.clase1_seguridad.modelos.PerfilesModulos;
import lombok.Data;

import java.util.List;

@Data
public class PerfilesModulosPermisosDto {

    private PerfilModel perfiles;
    private List<PerfilesModulos>PerfilesModulos;


    public PerfilesModulosPermisosDto(PerfilModel perfiles, List<com.gu.clase1_seguridad.modelos.PerfilesModulos> perfilesModulos) {

        this.perfiles = perfiles;
        PerfilesModulos = perfilesModulos;
    }

    public PerfilesModulosPermisosDto() {
    }
}
