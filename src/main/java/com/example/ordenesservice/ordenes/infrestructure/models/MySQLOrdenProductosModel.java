package com.example.ordenesservice.ordenes.infrestructure.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "ordenes_productos")
@Getter @Setter
public class MySQLOrdenProductosModel {
    @Id
    private String id;

    @Column(nullable = false)
    private String producto_id;

    @Column(nullable = false)
    private float total;

    @Column(nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "orden_id")
    private MySQLOrdenModel orden;
}
