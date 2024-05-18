package com.example.ordenesservice.ordenes.infrestructure.controllers;

import com.example.ordenesservice.ordenes.application.usecase.GetOrdenUseCase;
import com.example.ordenesservice.ordenes.infrestructure.dtos.responses.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ordenes")
public class GetOrdenController {
    @Autowired
    private GetOrdenUseCase useCase;

    @GetMapping
    public BaseResponse run(){return useCase.run();}

}
