package controller;

import model.SocialEngagementModel;
import model.SocialMediaPost;
import view.SocialEngagementView;

import java.util.ArrayList;

public class SocialEngagementController {
    SocialEngagementView viewObj;
    SocialEngagementModel modelObj;

    public SocialEngagementController(model.SocialEngagementModel model,
                                      SocialEngagementView view) { // constructor
        viewObj = view;
        modelObj = model;
    }

    public void postInSocialMedia() {
        modelObj.postInSocialMedia();
        viewObj.socialMediaPost();
    }

    public void viewAllPosts() {
        viewObj.viewAllPosts(modelObj.getListOfPosts());
    }

    public void viewFeaturedPost() {
        viewObj.viewFeaturedPost(modelObj.getFeaturedPosts());
    }


}
