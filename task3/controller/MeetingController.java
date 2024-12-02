package controller;

import model.MeetingModel;
import view.MeetingView;

import java.util.ArrayList;

public class MeetingController {

    MeetingModel modelObj;
    MeetingView viewObj;

    public MeetingController(MeetingModel modelObj, MeetingView viewObj) {
        this.modelObj = modelObj;
        this.viewObj = viewObj;
    }

    public void meeting() {
        viewObj.meetingAnnouncement();
        modelObj.startMeeting();
        viewObj.printMeetingDecisions(modelObj.getDecisions_taken_in_meeting());
    }


    public void numOfMeetingHeld() {
        viewObj.numOfMeetingHeld(modelObj.getNumOfMeetingHeld());
    }

    public void setDecisions_taken_in_meeting(ArrayList<String> decisionTakenInMeeting) {
        modelObj.setDecisions_taken_in_meeting(decisionTakenInMeeting);
    }

    public void updateAttendance() {
        modelObj.updateAttendance();
    }

}
