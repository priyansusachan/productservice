package dev.priyansu.productservice.controllers;

import dev.priyansu.productservice.dtos.GenericProductDto;
import dev.priyansu.productservice.dtos.ProductDto;
import dev.priyansu.productservice.models.Product;
import dev.priyansu.productservice.serrvice.IProductService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    private IProductService _productService;
    public  ProductController(IProductService productService){
        this._productService = productService;
    }

    @GetMapping("{id}")
    public GenericProductDto getProductById(@PathVariable("id") long id){
       return this._productService.getProductById(id);

        //return "product is hit";
    }

    public void deleteProductById(long id)
    {

    }
}
