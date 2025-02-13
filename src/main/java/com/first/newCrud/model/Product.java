package com.first.newCrud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Entity(name = "product")
@Table(name = "product")
@NoArgsConstructor
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String name;

    private BigDecimal price;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public @NotNull String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
