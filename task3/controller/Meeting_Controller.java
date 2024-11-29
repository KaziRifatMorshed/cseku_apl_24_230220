package controller;

import model.Meeting_Model;
import view.Meeting_View;

public class Meeting_Controller {

    Meeting_Model model_obj;
    Meeting_View view_obj;

    public Meeting_Controller(Meeting_Model model_obj, Meeting_View view_obj) {
        this.model_obj = model_obj;
        this.view_obj = view_obj;
    }

    public void meeting() {
        view_obj.meetingAnnouncement();
        model_obj.startMeeting();
        view_obj.printMeetingDecisions();
    }
}
