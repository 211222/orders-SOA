package com.example.ordenesservice.ordenes.infrestructure.dtos.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class OrdenResponse {
    private String id;

    private float total;

    private Date fecha;

    private String status;
}
