package dev.priyansu.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDto {
    private  long id;
    private String title;
    private  double price;
    private String category;

    private String image;
}
