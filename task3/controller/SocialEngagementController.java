package controller;

import model.SocialEngagementModel;
import view.SocialEngagementView;

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

    // more implementation

}
