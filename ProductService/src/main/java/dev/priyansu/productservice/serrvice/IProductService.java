package dev.priyansu.productservice.serrvice;

import dev.priyansu.productservice.dtos.GenericProductDto;
import dev.priyansu.productservice.dtos.ProductDto;

public interface IProductService {
     public GenericProductDto getProductById(long id);
}
