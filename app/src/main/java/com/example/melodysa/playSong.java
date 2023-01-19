package com.example.melodysa;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.melodysa.models.songDetails;

import java.util.ArrayList;
import java.util.List;

public class playSong extends AppCompatActivity {
    private ImageView song_image;
    private TextView songName,singerName,currentTime,totalTime;
    private SeekBar seekBar;
    private Button play,next,prev;
    private MediaPlayer mediaPlayer=new MediaPlayer();
    private Handler handler=new Handler();
    List<songDetails.Root> dataSonglist=new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        song_image=findViewById(R.id.song_picture);
        songName=findViewById(R.id.song_name);
        singerName=findViewById(R.id.singer_name);
        currentTime=findViewById(R.id.current_time);
        totalTime=findViewById(R.id.total_time);
        seekBar=findViewById(R.id.seekBar);
        play=findViewById(R.id.button_play);
        next=findViewById(R.id.button_next);
        prev=findViewById(R.id.button_previous);

        seekBar.setMax(100);


    }
}