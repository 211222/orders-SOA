package com.example.ordenesservice.ordenes.domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;



@Getter
public class OrdenProductos {
    private String id;

    @Setter
    private String ordenId;

    @Setter
    private String productoId;

    @Setter
    private float total;

    @Setter
    private int cantidad;

    public OrdenProductos() {
        this.id = UUID.randomUUID().toString();
    }

}
