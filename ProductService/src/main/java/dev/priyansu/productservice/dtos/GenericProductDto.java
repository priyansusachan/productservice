package dev.priyansu.productservice.dtos;

import lombok.Setter;

@Setter
public class GenericProductDto {
    private  long id;
    private String title;
    private  double price;
    private String category;

    private String image;
}
