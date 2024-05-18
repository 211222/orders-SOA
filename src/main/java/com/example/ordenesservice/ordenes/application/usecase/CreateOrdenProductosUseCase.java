package com.example.ordenesservice.ordenes.application.usecase;

import com.example.ordenesservice.ordenes.domain.entities.OrdenProductos;
import com.example.ordenesservice.ordenes.domain.port.IOrdenProductosPort;
import com.example.ordenesservice.ordenes.infrestructure.dtos.requests.CreateOrdenProductosRequest;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.OrdenProductosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateOrdenProductosUseCase {

    @Autowired
    IOrdenProductosPort repository;
    
    public List<OrdenProductosResponse> run(String id, List<CreateOrdenProductosRequest> productos){
        return productos.stream().map(producto -> from(id, producto)).toList();
    }

    private OrdenProductosResponse from(String id, CreateOrdenProductosRequest createOrdenProductosRequest) {
        OrdenProductos ordenProductos = new OrdenProductos();
        ordenProductos.setProductoId(createOrdenProductosRequest.getProductoId());
        ordenProductos.setCantidad(createOrdenProductosRequest.getCantidad());
        ordenProductos.setTotal(createOrdenProductosRequest.getTotal());
        ordenProductos.setOrdenId(id);
        return repository.CrearOrdenProducto(ordenProductos);
    }
}
