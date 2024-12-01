package controller;

import model.HostContestModel;
import view.HostContestView;

public class HostContestController {
    HostContestModel model_obj;
    HostContestView view_obj;

    public HostContestController(HostContestModel model_obj, HostContestView view_obj) {
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

    public void printContestRules() {
        view_obj.printContestRules(model_obj.getContestRules());
    }
}
