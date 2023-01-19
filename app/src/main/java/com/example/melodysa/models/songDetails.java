package com.example.melodysa.models;

import java.util.List;

public class songDetails {

    public List<Root> getRoot() {
        return root;
    }

    public void setRoot(List<Root> root) {
        this.root = root;
    }

    private List<songDetails.Root> root = null;

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

    public class Audio{
        public Medium medium;

        public Audio(Medium medium) {
            this.medium = medium;
        }

        public Medium getMedium() {
            return medium;
        }

        public void setMedium(Medium medium) {
            this.medium = medium;
        }
    }
    public class Medium{
        public String url;

        public Medium(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
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
    public class Root{
        public String id;
        public Audio audio;
        public int duration;
        public String title;
        public String lyrics;
        public Artist artist;
        public Image image;

        public Root(String id, Audio audio, int duration, String title, String lyrics, Artist artist, Image image) {
            this.id = id;
            this.audio = audio;
            this.duration = duration;
            this.title = title;
            this.lyrics = lyrics;
            this.artist = artist;
            this.image = image;
        }

        public String getId() {
            return id;
        }

        public Audio getAudio() {
            return audio;
        }

        public int getDuration() {
            return duration;
        }

        public String getTitle() {
            return title;
        }

        public String getLyrics() {
            return lyrics;
        }

        public Artist getArtist() {
            return artist;
        }

        public Image getImage() {
            return image;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setAudio(Audio audio) {
            this.audio = audio;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setLyrics(String lyrics) {
            this.lyrics = lyrics;
        }

        public void setArtist(Artist artist) {
            this.artist = artist;
        }

        public void setImage(Image image) {
            this.image = image;
        }
    }

}
