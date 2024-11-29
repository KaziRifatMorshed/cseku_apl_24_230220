import controller.*;
import model.*;
import view.*;

class main {
    public static void main(String[] args) {

        /* Model, View, Controller Instances*/
        Committee_Model committee_model = new Committee_Model();
        Committee_View committee_view = new Committee_View();
        Committee_Controller committee_controller =
                new Committee_Controller(committee_model, committee_view);

        Meeting_Model meeting_model = new Meeting_Model();
        Meeting_View meeting_view = new Meeting_View();
        Meeting_Controller meeting_controller =
                new Meeting_Controller(meeting_model, meeting_view);

        HostContest_Model hostContest_model = new HostContest_Model();
        HostContest_View hostContest_view = new HostContest_View();
        HostContest_Controller hostContest_controller =
                new HostContest_Controller(hostContest_model, hostContest_view);

        SocialEngagement_Model socialEngagement_model = new SocialEngagement_Model();
        SocialEngagement_View socialEngagement_view = new SocialEngagement_View();
        SocialEngagement_Controller socialEngagement_controller =
                new SocialEngagement_Controller(socialEngagement_model, socialEngagement_view);



        /* Services being called from respective controller*/

        committee_controller.formCommittee();
        meeting_controller.meeting();
        hostContest_controller.hostContest();
        socialEngagement_controller.postInSocialMedia();
    }

}
