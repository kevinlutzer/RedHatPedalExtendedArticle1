package com.redhat.Bike.Service;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "bikes")
@Getter @Setter @NoArgsConstructor
public class Bike {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "date_created")

    private Date date_created;

    @Column(name = "price")
    private Integer price;

    @Column(name = "image")
    private Byte image;

    @Column(name = "warranty_status")
    private String warranty_status;
}