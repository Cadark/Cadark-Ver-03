package com.heykorean.cadark.api_retrofit;

import com.google.gson.JsonElement;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by SonNV1368 on 10/22/15.
 *
 * Xay dung cac api lam viec voi server
 */
public interface IApiMethods {

    //get list contact
    @GET("/cadark/listcar")
    Call<JsonElement> getListCar();

}

