package controller;

import view.view;
import model.model;

public class controller {
    view viewObj = new view();
    model modelObj = new model();

    public controller() { // constructor
        //
    }

    public void postInSocialMedia() {
        modelObj.addSocialMediaPost();
        viewObj.socialMediaPost();
    }

    public void hostContest() {
        viewObj.contestAnnouncement();
        modelObj.receiveSubmissions();
        viewObj.viewContestSubmissions();
        modelObj.judgeSubmissions();
        viewObj.publishResult();
    }

    public void formCommittee(){
        modelObj.formCommittee();
        viewObj.committeeMembers();
    }

    public void meeting() {
        viewObj.meetingAnnouncement();
        viewObj.printMeetingDecisions();
    }

}
