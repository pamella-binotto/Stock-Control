package com.binotto.stock.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.math.BigDecimal;

import jakarta.validation.constraints.*;


@Entity
@Table(name = "products")
@Schema(description = "Represents a product in stock.")
public class Product {

    @Id
    @Schema(description = "Product ID.", example = "1", accessMode =  Schema.AccessMode.READ_ONLY )
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank (message = "The name is required.")
    @Column(nullable = false)
    @Schema(description = "Product name", example = "Xiaomi Redmi Note 15")
    private String name;

    @NotNull(message = "The quantity is required")
    @Min(value = 1, message = "The quantity must be greater than zero")
    @Column(nullable = false)
    @Schema(description = "Quantity in stock", example = "10")
    private Integer quantity;

    @NotNull(message = "The price is required")
    @DecimalMin(value = "0.01", message = "The price must be greater than zero.")
    @Column(nullable = false, precision = 10, scale = 2)
    @Schema(description = "Unit price.", example = "1400.00")
    private BigDecimal price;

    @NotBlank (message = "The category is required.")
    @Column(nullable = false)
    @Schema(description = "Product category", example = "Smartphone")
    private String category;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
