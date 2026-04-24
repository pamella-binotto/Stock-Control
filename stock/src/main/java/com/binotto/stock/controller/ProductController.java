package com.binotto.stock.controller;


import com.binotto.stock.model.Product;
import com.binotto.stock.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")

public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @Operation(summary = "List all products", description = "Returns a list of all products in stock")
    @ApiResponses(value = {
            @ApiResponse (responseCode =  "200", description = "Products retrieved successfully"),
            @ApiResponse (responseCode = "500",description = "Internal server error")
    })
    @GetMapping
    public List<Product> listProducts() {
        return productService.findAll();
    }


    @Operation (summary = "Create a new product", description = "Post product")
    @ApiResponses(value = {
            @ApiResponse (responseCode = "201", description = "Creates a new product in the stock with the provided data"),
            @ApiResponse (responseCode = "400", description = "Invalid input data")
    })
    @PostMapping
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "Product to be created",
            required = true,
            content = @Content(
                    mediaType = "application/json",
                    examples = @ExampleObject(
                            name = "Product Example",
                            value = """
                                    {
                                    "name": "Xiaomi Note 15",
                                    "quantity": 10,
                                    "price": 1400.00,
                                    "category": "Smartphone"
                                    }
                                    """
                    )
            )
    )
    public Product createProduct(@Valid @org.springframework.web.bind.annotation.RequestBody Product product) {
        return productService.save(product);
    }


    @Operation (summary = "Get product by ID", description = "Retrieves a product from the stock by its ID")
        @ApiResponses(value = {
                @ApiResponse (responseCode = "200", description = "Product retrieved successfully"),
                @ApiResponse (responseCode = "404", description = "Product not found")
        })
    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }



    @Operation (summary = "Update product by ID", description = "Updates an existing product in the stock by its ID")
        @ApiResponses(value = {
                @ApiResponse(responseCode = "200", description = "Product updated successfully"),
                @ApiResponse (responseCode = "400", description = "Invalid input data"),
                @ApiResponse (responseCode = "404", description = "Product not found")
        })
    @PutMapping("/{id}")
        public Product updateProduct(@PathVariable Long id, @Valid @RequestBody Product p){
            return productService.update(id,p);
    }


    @Operation (summary = "Delete product by ID", description = "Delete an existing product in the stock by its ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Product deleted successfully"),
            @ApiResponse (responseCode = "404", description = "Product not found")
    })
    @DeleteMapping ("/{id}")
        public void deleteProduct (@PathVariable Long id){
            productService.delete(id);
    }
}
