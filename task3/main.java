import controller.*;
import model.*;
import view.*;

class main {
        public static void main(String[] args) {

                /* Model, View, Controller Instances */
                CommitteeModel CommitteeModel = new CommitteeModel();
                CommitteeView CommitteeView = new CommitteeView();
                CommitteeController CommitteeController = new CommitteeController(CommitteeModel, CommitteeView);

                MeetingModel MeetingModel = new MeetingModel();
                MeetingView MeetingView = new MeetingView();
                MeetingController MeetingController = new MeetingController(MeetingModel, MeetingView);

                HostContestModel HostContestModel = new HostContestModel();
                HostContestView HostContestView = new HostContestView();
                HostContestController HostContestController = new HostContestController(HostContestModel,
                                HostContestView);

                SocialEngagementModel SocialEngagementModel = new SocialEngagementModel();
                SocialEngagementView SocialEngagementView = new SocialEngagementView();
                SocialEngagementController SocialEngagementController = new SocialEngagementController(
                                SocialEngagementModel, SocialEngagementView);

                /* Services being called from respective controller */

                CommitteeController.formCommittee();
                MeetingController.meeting();
                HostContestController.hostContest();
                SocialEngagementController.postInSocialMedia();
        }

}
