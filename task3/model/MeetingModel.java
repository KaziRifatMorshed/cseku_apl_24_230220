package model;

import java.util.ArrayList;

public class MeetingModel {

    /*data of meeting*/
    private int numOfMeetingHeld;
    private ArrayList<String> decisionTakenInMeeting;
    private ArrayList<Member> attendance;

    public MeetingModel() {
        //
    }

    public void startMeeting() {
        // more code goes here
        numOfMeetingHeld++;
    }

    public int getNumOfMeetingHeld() {
        return numOfMeetingHeld;
    }


    public ArrayList<String> getDecisions_taken_in_meeting() {
        return decisionTakenInMeeting;
    }

    public void setDecisions_taken_in_meeting(ArrayList<String> decisionTakenInMeeting) {
        this.decisionTakenInMeeting = decisionTakenInMeeting;
    }

    public void updateAttendance() {
        //
    }
}
