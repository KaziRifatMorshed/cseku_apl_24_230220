package model;

import java.util.ArrayList;

class Photo {
    // dummy class
}

class Video {
    // dummy class
}

public class SocialMediaPost {
    private String postDescription;
    private ArrayList<Photo> photos;
    private ArrayList<Video> videos;


    public void addPhoto(Photo p) {
        photos.add(p);
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public void setDescription(String postDescription) {
        this.postDescription = postDescription;
    }
}
