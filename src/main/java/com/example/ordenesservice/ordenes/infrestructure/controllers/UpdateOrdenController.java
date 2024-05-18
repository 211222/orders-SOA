package com.example.ordenesservice.ordenes.infrestructure.controllers;

import com.example.ordenesservice.ordenes.application.usecase.UpdateOrdenUseCase;
import com.example.ordenesservice.ordenes.infrestructure.dtos.requests.UpdateOrdenRequest;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ordenes")
public class UpdateOrdenController {

    @Autowired
    private UpdateOrdenUseCase useCase;

    @PutMapping
    public BaseResponse update(@RequestBody UpdateOrdenRequest request) {return useCase.run( request);}

}
