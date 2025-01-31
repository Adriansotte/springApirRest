package com.apirest.api_rest.service.impl;

import com.apirest.api_rest.model.dao.ClienteDao;
import com.apirest.api_rest.model.dto.ClienteDto;
import com.apirest.api_rest.model.entity.Cliente;
import com.apirest.api_rest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional
    public Cliente save(ClienteDto clienteDto) {
        Cliente cliente = Cliente.builder().idCliente(clienteDto.getIdCliente())
                .nombre(clienteDto.getNombre())
                .apellido(clienteDto.getApellido())
                .correo(clienteDto.getCorreo())
                .fechaRegistro(clienteDto.getFechaRegistro())
                .build();
        return clienteDao.save(cliente);
    }
    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Integer id) {

        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
}
