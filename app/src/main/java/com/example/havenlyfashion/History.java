package com.example.havenlyfashion;

import androidx.appcompat.app.AppCompatActivity;

public class History {
    private String name;
    private String price;
    private int photo;
    private String invoice;

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }
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


    public History(String invoice, String name, String price, int photo) {
        this.invoice = invoice;
        this.name = name;
        this.price = price;
        this.photo = photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void add(History history) {
    }


}
