package com.gu.clase1_seguridad.services;


import com.gu.clase1_seguridad.modelos.ModulosModel;
import com.gu.clase1_seguridad.modelos.PerfilModel;
import com.gu.clase1_seguridad.modelos.PerfilesModulos;
import com.gu.clase1_seguridad.repositorio.IperfilesModulosRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class PermisoModulosService {


    @Autowired
    private IperfilesModulosRepositori repository;


    public void guardar(PerfilesModulos modulo) {

        this.repository.save(modulo);
    }


    public PerfilesModulos buscarPorId(Long id) {

        Optional<PerfilesModulos> optional = this.repository.findById(id);

        if (optional.isPresent()) {


            return optional.get();
        }

        return null;


    }

    public PerfilesModulos buscarPerfilModulo(PerfilModel perfilId, ModulosModel moduloId) {


        return this.repository.findByPerfilIdAndModuloId(perfilId, moduloId);
    }


    public List<PerfilesModulos> modulosPorperfil(PerfilModel perfilId) {


        return this.repository.findByPerfilId(perfilId);
    }


    public void eliminarPorPerfil(PerfilModel perfilId){

        this.repository.deleteByPerfilId(perfilId);

    }


    public void eliminar(Long id){

        this.repository.deleteById(id);
    }
}
