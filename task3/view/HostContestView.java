package view;

import java.util.ArrayList;

public class HostContestView {
    public HostContestView() {
        //
    }

    public void contestAnnouncement() {
        System.out.println("We are hosting a contest");
        //
    }

    public void viewContestSubmissions() {
        System.out.println("Viewing all contest submissions");
        //
    }

    public void publishResult() {
        System.out.println("Contest Winners : ...");
    }

    public void printContestRules(ArrayList<String> rules){
        for (int i = 0; i < rules.size(); i++){
            System.out.println("Rule 1 : " + rules.get(i));
        }
    }
}
