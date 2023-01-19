package com.example.melodysa.models;

import java.util.ArrayList;
import java.util.List;


public class latestSong {
    private List<Result> results = null;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }


    public class Album{

        public String name;
        public ArrayList<Artist> artists;
        public Image image;

        public Album(String name, ArrayList<Artist> artists, Image image) {
            this.name = name;
            this.artists = artists;
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public ArrayList<Artist> getArtists() {
            return artists;
        }

        public Image getImage() {
            return image;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setArtists(ArrayList<Artist> artists) {
            this.artists = artists;
        }

        public void setImage(Image image) {
            this.image = image;
        }



    }
    public class Artist{

        public String fullName;

        public Artist(String fullName) {
            this.fullName = fullName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
    }

    public class Cover{

        public String url;

        public Cover(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }


    }

    public class Result{
        public latestSong.Album album;
        public ArrayList<latestSong.Artist> artists;
        public String title;
        public latestSong.Image image;
        public String id;

        public Result(String id, Album album, ArrayList<Artist> artists, String title, Image image) {
            this.id = id;
            this.album = album;
            this.artists = artists;
            this.title = title;
            this.image = image;
        }

        public String getId() {
            return id;
        }

        public Album getAlbum() {
            return album;
        }

        public ArrayList<Artist> getArtists() {
            return artists;
        }

        public String getTitle() {
            return title;
        }

        public Image getImage() {
            return image;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setAlbum(Album album) {
            this.album = album;
        }

        public void setArtists(ArrayList<Artist> artists) {
            this.artists = artists;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setImage(Image image) {
            this.image = image;
        }

    }


    public class Image{
        public Cover cover;

        public Image(Cover cover) {
            this.cover = cover;
        }

        public Cover getCover() {
            return cover;
        }

        public void setCover(Cover cover) {
            this.cover = cover;
        }


    }






}
