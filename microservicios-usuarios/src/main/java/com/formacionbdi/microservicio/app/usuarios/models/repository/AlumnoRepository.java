package com.formacionbdi.microservicio.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicio.app.usuarios.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	
}
