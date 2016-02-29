package com.heykorean.cadark.api_retrofit;

import retrofit2.http.GET;

/**
 * Created by Hey.Hung on 2/29/2016.
 */
public interface IApiMethods {
    @GET("/cadark/listcar")
    void getListCarHome();
}
