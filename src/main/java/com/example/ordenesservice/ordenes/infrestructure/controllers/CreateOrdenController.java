package com.example.ordenesservice.ordenes.infrestructure.controllers;


import com.example.ordenesservice.ordenes.application.usecase.CreateOrdenUseCase;
import com.example.ordenesservice.ordenes.application.usecase.CreateOrdenProductosUseCase;
import com.example.ordenesservice.ordenes.infrestructure.dtos.requests.CreateOrdenRequest;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.BaseResponse;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.CreateOrdenResponse;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.OrdenProductosResponse;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.OrdenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ordenes")
public class CreateOrdenController {
    @Autowired
    public CreateOrdenUseCase mainUseCase;

    @Autowired
    public CreateOrdenProductosUseCase secondUseCase;

    @PostMapping
    public BaseResponse run(@RequestBody CreateOrdenRequest request){
        OrdenResponse orden = mainUseCase.run(request);
        List<OrdenProductosResponse> productos = secondUseCase.run(orden.getId(), request.getProductos());
        CreateOrdenResponse response = new CreateOrdenResponse();
        response.setOrden(orden);
        response.setProductos(productos);
        BaseResponse resp = new BaseResponse();
        resp.setData(response);
        resp.setMessage("Orden creada con exito");
        resp.setSuccess(true);
        resp.setHttpStatus(HttpStatus.valueOf(201));
        return resp;
    }

}
