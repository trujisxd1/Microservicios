package com.gu.clase1_seguridad.modelos;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "variables_globales")
public class VariablesGlobales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String nombre;

    private String valor;

}
