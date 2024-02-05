package com.gu.clase1_seguridad.services;


import com.gu.clase1_seguridad.modelos.PerfilModel;
import com.gu.clase1_seguridad.repositorio.IperfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class PerfilesService {


    @Autowired
    private IperfilRepository repository;



    public List<PerfilModel>listar(){



        return this.repository.findAll();

    }

    public PerfilModel buscarpoId(Long id){

        Optional<PerfilModel> optional=this.repository.findById(id);

        if (optional.isPresent()){

            return optional.get();
        }

        return null;

    }


}
