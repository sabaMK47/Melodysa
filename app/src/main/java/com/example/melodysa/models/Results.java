package com.example.melodysa.models;

import android.media.Image;
import android.provider.MediaStore;

import java.util.ArrayList;

public class Results {
    public String id;
    public Album album;
    public ArrayList<Artist> artists;
    public MediaStore.Audio audio;
    public String downloadCount;
    public int duration;
    public String title;
    public Image image;
}



