package com.example.ordenesservice.ordenes.domain.port;

import com.example.ordenesservice.ordenes.domain.entities.OrdenProductos;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.OrdenProductosResponse;

public interface IOrdenProductosPort {
    OrdenProductosResponse CrearOrdenProducto(OrdenProductos ordenProductos);
}
