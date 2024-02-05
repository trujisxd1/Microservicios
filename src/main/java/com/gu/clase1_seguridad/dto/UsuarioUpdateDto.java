package com.gu.clase1_seguridad.dto;

import lombok.Data;

@Data
public class UsuarioUpdateDto {

    private String nombre;
    private String correo;
    private String password;
    private Long perfil_id;

}
