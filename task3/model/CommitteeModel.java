package model;

import java.util.ArrayList;

public class CommitteeModel {
    ArrayList<Members> members; // Model containing data

    public CommitteeModel() {
        //
    }

    public void formCommittee(ArrayList<Members> new_committee_members) {
        members = new_committee_members;
        //
    }

    public void addMember(Members newMember) {
        //
    }

    public void removeMember(Members member) {
        //
    }
}
