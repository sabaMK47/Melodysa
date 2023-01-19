package com.example.melodysa;

import com.example.melodysa.models.latestSong;
import com.example.melodysa.models.songDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Requests {
    @GET("song/new/0/11")
    Call<List<latestSong>> getdata();

    @GET("song/NThRYnA")
    Call<List<songDetails>> getsongdata();


}
