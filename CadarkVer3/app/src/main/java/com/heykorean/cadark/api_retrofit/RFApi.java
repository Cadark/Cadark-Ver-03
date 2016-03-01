package com.heykorean.cadark.api_retrofit;

import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.heykorean.cadark.app.RFApplication;
import com.heykorean.cadark.models.CarListHome;

import java.util.ArrayList;

import retrofit.Call;

/**
 * Created by SonNV1368 on 10/22/15.
 */
public class RFApi {

    //get contacts
    public static ArrayList<CarListHome> getContact(){
        ArrayList<CarListHome> arrayList = new ArrayList<CarListHome>();
        Call<JsonElement> call = RFApplication.apiServices.getContacts();

        try {
            JsonElement jsonElement = (JsonElement)call.execute().body();
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            JsonArray jsonArray = jsonObject.getAsJsonArray("list");
            for (int i = 0; i< jsonArray.size(); i++){
                JsonObject objectContact = jsonArray.get(i).getAsJsonObject();

                String name_car = objectContact.get("name_car").getAsString();
                String image_car = objectContact.get("image_car").getAsString();
                String num_bid = objectContact.get("num_bid").getAsString();
                String image_avar = objectContact.get("image_avar").getAsString();
                String top_price_car = objectContact.get("top_price_car").getAsString();

                CarListHome carListHome = new CarListHome(name_car, image_car, num_bid, image_avar, top_price_car);

                arrayList.add(carListHome);
            }

            Log.d("array", "array "+arrayList.size());
        }catch (Exception e){
            Log.e("Error", "Parser: " + e.getMessage().toString());
        }

        return arrayList;
    }
}
