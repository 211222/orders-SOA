package com.example.ordenesservice.ordenes.domain.port;


import com.example.ordenesservice.ordenes.domain.entities.Orden;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.BaseResponse;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.OrdenResponse;

public interface IOrdenPort {
    BaseResponse Listar();
    OrdenResponse Crear(Orden orden);
    BaseResponse ActualizarStatus(String id, String status);
}
