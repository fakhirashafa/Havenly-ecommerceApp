package com.example.havenlyfashion;

public class Product {
    private String name;
    private String price;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public Product(String name, String price, int photo) {
        this.name = name;
        this.price = price;
        this.photo = photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void add(Product product) {
    }
}
