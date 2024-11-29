package SocialEngagement;

public class SocialEngagement extends SocialMediaPlatform {

    public SocialEngagement(String social_media_name) {
        postInSocialMedia(social_media_name);
    }

    private void postInSocialMedia(String social_media_name) {
        if (social_media_name.equals("facebook")) {
            postInFacebook();
        } else if (social_media_name.equals("instagram")) {
            postInInstagram();
        } else if (social_media_name.equals("linkedin")) {
            postInLinkedin();
        } else if (social_media_name.equals("youtube")) {
            postInYoutube();
        }
    }

}
