package com.example.melodysa;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RequestManager {

    public static Retrofit retrofit=null;
    Context context;
    public static Requests getRetrofitClient() {
        if(retrofit==null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api-beta.melobit.com/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(Requests.class);
    }
    public RequestManager(Context context){
        this.context=context;
    }


}



