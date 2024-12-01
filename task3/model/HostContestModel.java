package model;

import java.util.ArrayList;

public class HostContestModel {
    private ArrayList<String> listOfJudges;
    private ArrayList<String> segments;
    private ArrayList<String> contestRules;

    public HostContestModel() {
        //
    }

    public boolean isEligibleForContest() { // business logic
        boolean isEligible = true;
        // if (){
        // //
        // } else {
        // //
        // }
        return isEligible;
    }

    public void receiveSubmissions() {
        //
    }

    public void judgeSubmissions() {
        //
        if (isEligibleForContest()) { // application of business logic
            //
        }
    }

    public ArrayList<String> getListOfJudges() {
        return listOfJudges;
    }

    public void setListOfJudges(ArrayList<String> listOfJudges) {
        this.listOfJudges = listOfJudges;
    }

    public ArrayList<String> getSegments() {
        return segments;
    }

    public void setSegments(ArrayList<String> segments) {
        this.segments = segments;
    }

    public ArrayList<String> getContestRules() {
        return contestRules;
    }

    public void setContestRules(ArrayList<String> contestRules) {
        this.contestRules = contestRules;
    }
}
