package dev.priyansu.productservice.serrvice;

import dev.priyansu.productservice.dtos.GenericProductDto;
import dev.priyansu.productservice.dtos.ProductDto;
import dev.priyansu.productservice.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.awt.geom.GeneralPath;

@Service
public class ProductService implements  IProductService{

    RestTemplateBuilder _restTemplateBuilder;
    private String requestUrl = "https://fakestoreapi.com/products/{id}";
    public ProductService(RestTemplateBuilder restTemplateBuilder)
    {
        _restTemplateBuilder = restTemplateBuilder;
    }
    public GenericProductDto getProductById(long id)
    {
        RestTemplate restTemplate = _restTemplateBuilder.build();
        ResponseEntity<ProductDto> response = restTemplate.getForEntity(requestUrl, ProductDto.class, id);
        ProductDto productDto = response.getBody();
        GenericProductDto product = new GenericProductDto();
        product.setId(productDto.getId());
        product.setCategory(productDto.getCategory());
        product.setTitle((productDto.getTitle()));
        product.setPrice((productDto.getPrice()));
        product.setImage((productDto.getImage()));
        return product;
    }
}
