package com.heykorean.cadark.api_retrofit;

import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.heykorean.cadark.app.RFApplication;
import com.heykorean.cadark.models.Carlist_Item;

import java.util.ArrayList;

import retrofit.Call;

/**
 * Created by SonNV1368 on 10/22/15.
 */
public class IApi {

    //get contacts
    public static ArrayList<Carlist_Item> getContact(){
        ArrayList<Carlist_Item> arrayList = new ArrayList<Carlist_Item>();
        Call<JsonElement> call = RFApplication.apiServices.getListCar();

        try {
            JsonElement jsonElement = (JsonElement)call.execute().body();
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            JsonArray jsonArray = jsonObject.getAsJsonArray("list");
            for (int i = 0; i< jsonArray.size(); i++){
                JsonObject objectContact = jsonArray.get(i).getAsJsonObject();

                /*String id = objectContact.get("id").getAsString();
                String name = objectContact.get("name").getAsString();
                String email = objectContact.get("email").getAsString();*/

                String nameCar = objectContact.get("name_car").getAsString();
                String imageCar = objectContact.get("image_car").getAsString();
                String numBid = objectContact.get("num_bid").getAsString();
                String imageAvar = objectContact.get("image_avar").getAsString();
                String topPriceCar = objectContact.get("top_price_car").getAsString();

                Carlist_Item contacts = new Carlist_Item(nameCar, imageCar, numBid, imageAvar, topPriceCar);

                arrayList.add(contacts);
            }

            Log.d("array", "array "+arrayList.size());
        }catch (Exception e){
            Log.e("Error", "Parser: " + e.getMessage().toString());
        }

        return arrayList;
    }
}
