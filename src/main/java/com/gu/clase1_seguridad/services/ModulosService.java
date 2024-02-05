package com.gu.clase1_seguridad.services;


import com.gu.clase1_seguridad.modelos.ModulosModel;
import com.gu.clase1_seguridad.repositorio.ImodulosRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class ModulosService {


    @Autowired
    private ImodulosRepositori repositori;


    public List<ModulosModel>listar(){


        return this.repositori.findAll(Sort.by("id").descending());
    }


    public void guardar(ModulosModel module){

         this.repositori.save(module);

    }


    public ModulosModel BuscarNombre(String nombre){


        return this.repositori.findAllByNombre(nombre);

    }

    public ModulosModel buscarporId(Long id){

        Optional<ModulosModel>optional=this.repositori.findById(id);

        if (optional.isPresent()){

            return  optional.get();
        }
        return null;
    }

    public void eliminar(Long id){


        this.repositori.deleteById(id);
    }



}
