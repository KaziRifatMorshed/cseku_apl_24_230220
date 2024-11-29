package model;

import java.util.ArrayList;

public class Committee_Model {
    ArrayList<Members> members; // Model containing data

    public Committee_Model() {
        //
    }

    public void formCommittee(ArrayList<Members> new_committee_members) {
        members = new_committee_members;
        //
    }
}
