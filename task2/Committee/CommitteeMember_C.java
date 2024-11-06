package Committee;

import java.util.ArrayList;

public class CommitteeMember_C extends KU_Student_C {
    private String designation; // position in the club committee

    public CommitteeMember_C(String name, String designation, String discipline, int year, ArrayList<String> interests, ArrayList<String> expertise) {
        super(name, discipline, year, interests, expertise);
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
