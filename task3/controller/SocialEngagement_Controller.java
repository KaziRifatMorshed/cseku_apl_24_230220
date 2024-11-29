package controller;

import model.SocialEngagement_Model;
import view.SocialEngagement_View;

public class SocialEngagement_Controller {
    SocialEngagement_View viewObj;
    SocialEngagement_Model modelObj;

    public SocialEngagement_Controller(model.SocialEngagement_Model _model,
                                       SocialEngagement_View _view) { // constructor
        viewObj = _view;
        modelObj = _model;
    }

    public void postInSocialMedia() {
        modelObj.postInSocialMedia();
        viewObj.socialMediaPost();
    }

    // more implementation

}
