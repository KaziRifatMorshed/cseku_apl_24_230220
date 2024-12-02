package controller;

import model.HostContestModel;
import view.HostContestView;

import java.util.ArrayList;

public class HostContestController {
    HostContestModel modelObj;
    HostContestView viewObj;

    public HostContestController(HostContestModel modelObj, HostContestView viewObj) {
        this.modelObj = modelObj;
        this.viewObj = viewObj;
    }

    public void hostContest() {
        printContestAnnouncement();
        receiveSubmissions();
        viewContestSubmissions();
        judgeSubmissions();
    }

    public void printContestAnnouncement() {
        viewObj.contestAnnouncement();
    }

    public void printContestRules() {
        viewObj.printContestRules(modelObj.getContestRules());
    }

    public void receiveSubmissions() {
        modelObj.receiveSubmissions();
    }

    public void viewContestSubmissions() {
        viewObj.viewContestSubmissions();
    }

    public void judgeSubmissions() {
        modelObj.judgeSubmissions();
    }

    public void publishResult() {
        viewObj.publishResult();
    }

    public void setContestRules(ArrayList<String> contestRules) {
        modelObj.setContestRules(contestRules);
    }

    public void setSegments(ArrayList<String> segments) {
        modelObj.setSegments(segments);
    }

    public void viewSegments() {
        viewObj.viewSegments(modelObj.getSegments());
    }

    public void setListOfJudges(ArrayList<String> listOfJudges) {
        modelObj.setListOfJudges(listOfJudges);
    }

    public void printListOfJudges() {
        viewObj.printListOfJudges(modelObj.getListOfJudges());
    }

}
