package com.example.melodysa;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.melodysa.models.latestSong;
import com.squareup.picasso.Picasso;

import java.util.List;

public class latestSongAdapter extends RecyclerView.Adapter <latestSongAdapter.ViewHolder>{

    private List<latestSong.Result> datalist;
    public latestSongAdapter(List<latestSong.Result> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.songcard,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.title.setText(datalist.get(position).getTitle());
        holder.singerName.setText(datalist.get(position).getArtists().get(0).getFullName());
        Picasso.get().load(datalist.get(0).getImage().getCover().getUrl()).into(holder.cover);

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView singerName;
        ImageView cover;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.song_name);
            singerName=itemView.findViewById(R.id.singer_name);
            cover=itemView.findViewById(R.id.song_image);
        }

    }
}
