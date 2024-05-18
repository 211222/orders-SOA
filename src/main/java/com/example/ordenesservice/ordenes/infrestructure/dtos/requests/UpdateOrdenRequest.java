package com.example.ordenesservice.ordenes.infrestructure.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateOrdenRequest {
    private String status;
    private String id;
}
