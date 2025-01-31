package com.apirest.api_rest.service;

import com.apirest.api_rest.model.dto.ClienteDto;
import com.apirest.api_rest.model.entity.Cliente;

public interface ICliente {

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

}
