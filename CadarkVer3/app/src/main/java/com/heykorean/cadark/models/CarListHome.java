package com.heykorean.cadark.models;

import java.net.URI;

/**
 * Created by SonNV1368 on 10/22/15.
 */
public class CarListHome {
    private String carName;
    private String imageCar;
    private String numBid;
    private String imageAvar;
    private String topPrice;

    public CarListHome(String carName, String imageCar, String numBid, String imageAvar, String topPrice) {
        this.carName = carName;
        this.imageCar = imageCar;
        this.numBid = numBid;
        this.imageAvar = imageAvar;
        this.topPrice = topPrice;
    }

    public CarListHome(String carName, String imageCar, String topPrice) {
        this.carName = carName;
        this.imageCar = imageCar;
        this.topPrice = topPrice;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getImageCar() {
        return imageCar;
    }

    public void setImageCar(String imageCar) {
        this.imageCar = imageCar;
    }

    public String getNumBid() {
        return numBid;
    }

    public void setNumBid(String numBid) {
        this.numBid = numBid;
    }

    public String getImageAvar() {
        return imageAvar;
    }

    public void setImageAvar(String imageAvar) {
        this.imageAvar = imageAvar;
    }

    public String getTopPrice() {
        return topPrice;
    }

    public void setTopPrice(String topPrice) {
        this.topPrice = topPrice;
    }
}
