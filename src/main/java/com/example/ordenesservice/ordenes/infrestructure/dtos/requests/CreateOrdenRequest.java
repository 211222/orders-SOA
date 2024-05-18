package com.example.ordenesservice.ordenes.infrestructure.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter
public class CreateOrdenRequest {

    private float total;

    private Date fecha;

    private String status;

    private List<CreateOrdenProductosRequest> productos;
}
