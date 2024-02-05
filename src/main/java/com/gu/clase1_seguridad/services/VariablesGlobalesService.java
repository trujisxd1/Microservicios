package com.gu.clase1_seguridad.services;

import com.gu.clase1_seguridad.modelos.VariablesGlobales;
import com.gu.clase1_seguridad.repositorio.IVariablesGlobalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Primary
public class VariablesGlobalesService {

    @Autowired
    private IVariablesGlobalesRepository repository;



    public VariablesGlobales buscarpoId(Long id){

        Optional<VariablesGlobales> optional = this.repository.findById(id);

        if (optional.isPresent()){


            return optional.get();
        }

        return null;

    }



}
