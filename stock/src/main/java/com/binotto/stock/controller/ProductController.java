package com.binotto.stock.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")

public class ProductController {

    @GetMapping
    public String ListProduct(){
        return "Lista de Produtos";
    }

    @PostMapping
    public String createProduct (@RequestBody String name){
        return "Produto" + name + "criado com sucesso!";
    }

    @GetMapping("/{id}")
    public String findById (@PathVariable long id){
        return "Buscando por ID: " + id;
    }
}
