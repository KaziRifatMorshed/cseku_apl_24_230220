package SocialEngagement;


public class PostInSocialMedia implements PostInterface {

    protected void setPostDescription() {
//
    }

    protected void addPhoto() {
//
    }

    protected void addVideo() {
//        
    }

    @Override
    public void post() {
        setPostDescription();
        addPhoto();
        addVideo();
    }

}
