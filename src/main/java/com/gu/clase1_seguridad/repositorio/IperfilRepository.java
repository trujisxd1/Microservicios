package com.gu.clase1_seguridad.repositorio;

import com.gu.clase1_seguridad.modelos.PerfilModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IperfilRepository extends JpaRepository<PerfilModel,Long> {
}
