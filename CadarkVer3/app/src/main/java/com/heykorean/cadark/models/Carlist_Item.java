package com.heykorean.cadark.models;

/**
 * Created by Hey.Hung on 2/29/2016.
 */
public class Carlist_Item {
    private String nameCarItem;
    private int imgCarItem;
    private String numBidItem;
    private int imgAvarItem;
    private String priceCarItem;

    public Carlist_Item(String nameCarItem, int imgCarItem, String numBidItem, int imgAvarItem, String priceCarItem) {
        this.nameCarItem = nameCarItem;
        this.imgCarItem = imgCarItem;
        this.numBidItem = numBidItem;
        this.imgAvarItem = imgAvarItem;
        this.priceCarItem = priceCarItem;
    }

    public String getNameCarItem() {
        return nameCarItem;
    }

    public void setNameCarItem(String nameCarItem) {
        this.nameCarItem = nameCarItem;
    }

    public int getImgCarItem() {
        return imgCarItem;
    }

    public void setImgCarItem(int imgCarItem) {
        this.imgCarItem = imgCarItem;
    }

    public String getNumBidItem() {
        return numBidItem;
    }

    public void setNumBidItem(String numBidItem) {
        this.numBidItem = numBidItem;
    }

    public int getImgAvarItem() {
        return imgAvarItem;
    }

    public void setImgAvarItem(int imgAvarItem) {
        this.imgAvarItem = imgAvarItem;
    }

    public String getPriceCarItem() {
        return priceCarItem;
    }

    public void setPriceCarItem(String priceCarItem) {
        this.priceCarItem = priceCarItem;
    }
}
