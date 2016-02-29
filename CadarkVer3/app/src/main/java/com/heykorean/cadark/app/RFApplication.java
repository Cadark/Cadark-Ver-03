package com.heykorean.cadark.app;

import android.app.Application;

import com.heykorean.cadark.api_retrofit.IApiCommon;
import com.heykorean.cadark.api_retrofit.IApiMethods;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by SonNV1368 on 10/22/15.
 * Xay dung nhung thanh phan chi khoi tao 1 lan
 *
 */
public class RFApplication extends Application {
    public static Retrofit mRetrofit;
    public static IApiMethods apiServices;

    @Override
    public void onCreate() {
        super.onCreate();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(IApiCommon.BASE_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiServices = mRetrofit.create(IApiMethods.class);
    }

}
