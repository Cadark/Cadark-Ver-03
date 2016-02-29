package com.heykorean.cadark.models;

/**
 * Created by Hey.Hung on 2/29/2016.
 */
public class Carlist_Item {
    private String name_car;
    private String image_car;
    private String num_bid;
    private String image_avar;
    private String top_price_car;

    public Carlist_Item(String name_car, String image_car, String num_bid, String image_avar, String top_price_car) {
        this.name_car = name_car;
        this.image_car = image_car;
        this.num_bid = num_bid;
        this.image_avar = image_avar;
        this.top_price_car = top_price_car;
    }

    public String getName_car() {
        return name_car;
    }

    public void setName_car(String name_car) {
        this.name_car = name_car;
    }

    public String getImage_car() {
        return image_car;
    }

    public void setImage_car(String image_car) {
        this.image_car = image_car;
    }

    public String getNum_bid() {
        return num_bid;
    }

    public void setNum_bid(String num_bid) {
        this.num_bid = num_bid;
    }

    public String getImage_avar() {
        return image_avar;
    }

    public void setImage_avar(String image_avar) {
        this.image_avar = image_avar;
    }

    public String getTop_price_car() {
        return top_price_car;
    }

    public void setTop_price_car(String top_price_car) {
        this.top_price_car = top_price_car;
    }
}
