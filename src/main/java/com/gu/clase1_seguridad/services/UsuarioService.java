package com.gu.clase1_seguridad.services;


import com.gu.clase1_seguridad.modelos.UsuarioModel;
import com.gu.clase1_seguridad.repositorio.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class UsuarioService {


    @Autowired
    private IUsuarioRepository repository;


    public List<UsuarioModel>listar(){


        return this.repository.findAll();
    }

    public UsuarioModel buscarPorId(Long id){

        Optional<UsuarioModel>optional = this.repository.findById(id);

        if(optional.isPresent()){

            return optional.get();
        }

        return null;

    }

    public UsuarioModel buscarPorCorreoLogin(String correo){

        return this.repository.findByCorreoAndEstado(correo,1);

    }


    public UsuarioModel buscarPorCorreo(String correo){


        return this.repository.findByCorreo(correo);
    }


    public UsuarioModel buscarPorToken(String token){

        return this.repository.findByTokenAndEstado(token,0);
    }

}
