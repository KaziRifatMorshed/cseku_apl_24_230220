package controller;

import model.HostContest_Model;
import view.HostContest_View;

public class HostContest_Controller {
    HostContest_Model model_obj;
    HostContest_View view_obj;

    public HostContest_Controller(HostContest_Model model_obj, HostContest_View view_obj) {
        this.model_obj = model_obj;
        this.view_obj = view_obj;
    }

    public void hostContest() {
        view_obj.contestAnnouncement();
        model_obj.receiveSubmissions();
        view_obj.viewContestSubmissions();
        model_obj.judgeSubmissions();
        view_obj.publishResult();
    }
}
