package com.example.melodysa;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.melodysa.models.latestSong;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    latestSongAdapter adapter;
    LinearLayoutManager layoutManager;
    List<latestSong.Result> datalist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new latestSongAdapter(datalist);
        recyclerView.setAdapter(adapter);

        fetchdata();

    }
      public void fetchdata(){
        RequestManager.getRetrofitClient().getdata().enqueue(new Callback<List<latestSong>>() {
            @Override
            public void onResponse(Call<List<latestSong>> call, Response<List<latestSong>> response) {
                if (response.isSuccessful() && response.body() != null){
                    datalist.addAll(response.body().get(0).getResults());
                    adapter.notifyDataSetChanged();
                }
            }
            @Override
            public void onFailure(Call<List<latestSong>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error:"+t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
      }

}