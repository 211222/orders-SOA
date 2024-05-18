package com.example.ordenesservice.ordenes.application.usecase;

import com.example.ordenesservice.ordenes.domain.entities.Orden;
import com.example.ordenesservice.ordenes.domain.port.IOrdenPort;
import com.example.ordenesservice.ordenes.infrestructure.dtos.requests.CreateOrdenRequest;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.OrdenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateOrdenUseCase {

    @Autowired
    IOrdenPort repository;

    public OrdenResponse run(CreateOrdenRequest request) {
        Orden orden = new Orden();
        orden.setFecha(request.getFecha());
        orden.setStatus(request.getStatus());
        orden.setTotal(request.getTotal());
        return repository.Crear(orden);
    }

}
