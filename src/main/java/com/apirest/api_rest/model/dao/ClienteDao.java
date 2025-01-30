package com.apirest.api_rest.model.dao;

import com.apirest.api_rest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {

}
