package com.example.model;

import org.springframework.web.multipart.MultipartFile;

public class ProductForm {


    private String name;

    private String description;

    private MultipartFile image;

    public ProductForm() {
    }

    public ProductForm( String name, String description, MultipartFile image) {

        this.name = name;
        this.description = description;
        this.image = image;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

}
