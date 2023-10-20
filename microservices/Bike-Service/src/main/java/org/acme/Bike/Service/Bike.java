package org.acme.Bike.Service;

import java.sql.Date;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "bikes")
public class Bike extends PanacheEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "date_created")

    private Date date_created;

    @Column(name = "price")
    private Integer price;

    @Column(name = "image")
    private byte[] image;
    
    @Column(name = "warranty_status")
    private String warranty_status;
}
