package ua.kiev.prog.oauth2.loginviagoogle.model;


import ua.kiev.prog.oauth2.loginviagoogle.dto.ProductDTO;

import javax.persistence.*;

@Entity
@Table(name = "productList")
public class Product {
    @Id
    @GeneratedValue
    private Long productId;

    private String name;

    private String brendId;

    private String categoryId;

    private int price;

    /**
     * @prodDescr - Product Description - a written representation of an object.
     */
    private String prodDescr;

    public Product () {
    }

    private Product(String name,
                    String brend,
                    String categoryId,
                    int price,
                    String prodDescr){

        this.name = name;
        this.brendId = brend;
        this.categoryId = categoryId;
        this.price = price;
        this.prodDescr = prodDescr;
    }

    public static Product of(String name,
                             String brend,
                             String categoryId,
                             int price,
                             String prodDescr){
        return  new Product (name, brend, categoryId,price,prodDescr);
    }

    public  ProductDTO toDTO(){
        return ProductDTO.of(name, brendId, categoryId, price, prodDescr);
    }


    public static Product fromDTO(ProductDTO productDTO) {
        return Product.of(
                productDTO.getName (),
                productDTO.getBrendId(),
                productDTO.getCategoryId(),
                productDTO.getPrice (),
                productDTO.getProdDescr ());
    }


    public Long getProductId () {
        return productId;
    }

    public void setProductId (Long productId) {
        this.productId = productId;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getBrendId () {
        return brendId;
    }

    public void setBrendId (String brendId) {
        this.brendId = brendId;
    }

    public String getCategoryId () {
        return categoryId;
    }

    public void setCategoryId (String categoryId) {
        this.categoryId = categoryId;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public String getProdDescr () {
        return prodDescr;
    }

    public void setProdDescr (String prodDescr) {
        this.prodDescr = prodDescr;
    }
}
