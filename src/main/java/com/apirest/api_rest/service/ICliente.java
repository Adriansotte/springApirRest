package com.apirest.api_rest.service;

import com.apirest.api_rest.model.entity.Cliente;

public interface ICliente {

    Cliente save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

}
