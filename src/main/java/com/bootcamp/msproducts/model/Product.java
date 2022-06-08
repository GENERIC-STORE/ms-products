package com.bootcamp.msproducts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity()
@Table( name = "products" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;
    private Double price;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
}
