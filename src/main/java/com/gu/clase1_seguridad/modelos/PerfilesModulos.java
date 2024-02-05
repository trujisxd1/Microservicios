package com.gu.clase1_seguridad.modelos;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data

@AllArgsConstructor
@Entity
@Table(name = "perfiles_modulos")
public class PerfilesModulos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "perfil_id")
    private PerfilModel perfilId;

    @ManyToOne
    @JoinColumn(name = "modulo_id")
    private ModulosModel moduloId;

    public PerfilesModulos(PerfilModel perfilId, ModulosModel modulosId) {
        this.perfilId = perfilId;
        this.moduloId = modulosId;
    }

    public PerfilesModulos() {
    }
}
