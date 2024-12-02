package model;

import java.util.ArrayList;

public class SocialEngagementModel {
    // model contains data
    ArrayList<SocialMediaPost> listOfPosts = new ArrayList<>(); // databases of previous (all) posts
    ArrayList<SocialMediaPost> featuredPosts = new ArrayList<>(); // databases of featured posts

    public SocialEngagementModel() { // constructor
        //
    }

    public void postInSocialMedia() {
        //
    }

    public ArrayList<SocialMediaPost> getListOfPosts() {
        return listOfPosts;
    }

    public void setListOfPosts(ArrayList<SocialMediaPost> listOfPosts) {
        this.listOfPosts = listOfPosts;
    }

    public ArrayList<SocialMediaPost> getFeaturedPosts() {
        return featuredPosts;
    }

    public void setFeaturedPosts(ArrayList<SocialMediaPost> featuredPosts) {
        this.featuredPosts = featuredPosts;
    }


}
