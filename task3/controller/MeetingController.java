package controller;

import model.MeetingModel;
import view.MeetingView;

public class MeetingController {

    MeetingModel model_obj;
    MeetingView view_obj;

    public MeetingController(MeetingModel model_obj, MeetingView view_obj) {
        this.model_obj = model_obj;
        this.view_obj = view_obj;
    }

    public void meeting() {
        view_obj.meetingAnnouncement();
        model_obj.startMeeting();
        view_obj.printMeetingDecisions();
    }
}
