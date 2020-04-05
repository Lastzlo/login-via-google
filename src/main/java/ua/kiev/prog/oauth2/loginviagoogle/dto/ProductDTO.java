package ua.kiev.prog.oauth2.loginviagoogle.dto;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ProductDTO {

    private Long productId;

    private String name;
    private String brendId;
    private String categoryId;
    private int price;
    private String prodDescr;


    @JsonCreator
    public ProductDTO(
            @JsonProperty(required = true) String name,
            @JsonProperty(required = true) String brendId,
            @JsonProperty(required = true) String categoryId,
            @JsonProperty(required = true) int price,
            @JsonProperty(required = true) String prodDescr){

        this.name = name;
        this.brendId = brendId;
        this.categoryId = categoryId;
        this.price = price;
        this.prodDescr = prodDescr;
    }

    private ProductDTO(
                    Long productId,
                    String name,
                    String brendId,
                    String categoryId,
                    int price,
                    String prodDescr){
        this.productId = productId;
        this.name = name;
        this.brendId = brendId;
        this.categoryId = categoryId;
        this.price = price;
        this.prodDescr = prodDescr;
    }

    public static ProductDTO of(String name,
                             String brendId,
                             String categoryId,
                             int price,
                             String description){
        return  new ProductDTO (null, name, brendId, categoryId,price,description);
    }

    public static ProductDTO of(Long id,
                                String name,
                                String brendId,
                                String categoryId,
                                int price,
                                String description){
        return  new ProductDTO (id, name, brendId, categoryId,price,description);
    }

    public Long getProductId () {
        return productId;
    }

    public String getName () {
        return name;
    }

    public String getBrendId () {
        return brendId;
    }

    public String getCategoryId () {
        return categoryId;
    }

    public int getPrice () {
        return price;
    }

    public String getProdDescr () {
        return prodDescr;
    }
}
