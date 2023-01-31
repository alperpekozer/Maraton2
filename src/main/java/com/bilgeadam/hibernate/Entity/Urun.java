package com.bilgeadam.hibernate.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Urun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String name;
    private int price;


    public Urun(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
