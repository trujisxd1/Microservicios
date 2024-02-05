package com.gu.clase1_seguridad.dto;

import com.gu.clase1_seguridad.modelos.PerfilModel;
import lombok.Data;

@Data
public class UsuarioResponseDto {

    private Long id;
    private String nombre;
    private String correo;
    private PerfilModel PerfilId;

    private String Perfil;

    public UsuarioResponseDto(Long id, String nombre, String correo, PerfilModel perfilId, String perfil) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        PerfilId = perfilId;
        Perfil = perfil;
    }

    public UsuarioResponseDto() {
    }
}
