package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.database.UsuarioModel;

public interface UserRepository extends CrudRepository<UsuarioModel, Long>{

}
