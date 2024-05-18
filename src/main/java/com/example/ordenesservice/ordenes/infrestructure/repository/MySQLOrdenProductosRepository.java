package com.example.ordenesservice.ordenes.infrestructure.repository;

import com.example.ordenesservice.ordenes.domain.entities.OrdenProductos;
import com.example.ordenesservice.ordenes.domain.port.IOrdenProductosPort;
import com.example.ordenesservice.ordenes.infrestructure.models.MySQLOrdenProductosModel;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.OrdenProductosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.ordenesservice.ordenes.infrestructure.repository.jparepositories.IOrdenProductosRepository;
@Component
public class MySQLOrdenProductosRepository implements IOrdenProductosPort {

    @Autowired
    IOrdenProductosRepository repos;
    @Autowired
    MySQLOrdenRepository ordenRepository ;

    @Override
    public OrdenProductosResponse CrearOrdenProducto(OrdenProductos ordenProductos) {
        MySQLOrdenProductosModel model = new MySQLOrdenProductosModel();
        model.setId(ordenProductos.getId());
        model.setProducto_id(ordenProductos.getProductoId());
        model.setOrden(ordenRepository.findAndEnsureExist(ordenProductos.getOrdenId()));
        model.setCantidad(ordenProductos.getCantidad());
        model.setTotal(ordenProductos.getTotal());
        return from(repos.save(model));
    }

    OrdenProductosResponse from(MySQLOrdenProductosModel ordenProductos) {
        OrdenProductosResponse resp = new OrdenProductosResponse();
        resp.setId(ordenProductos.getId());
        resp.setProductoId(ordenProductos.getProducto_id());
        resp.setOrdenId(ordenProductos.getOrden().getId());
        resp.setCantidad(ordenProductos.getCantidad());
        resp.setTotal(ordenProductos.getTotal());
        return resp;
    }


}
