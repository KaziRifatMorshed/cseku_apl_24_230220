package model;

import java.util.ArrayList;

public class CommitteeModel {

    /* Data of Committee */
    ArrayList<Member> members; // Model containing data
    ArrayList<Member> suspendedMembers = new ArrayList<>();
    private int numMember = members.size();
    private String committeeConstitution;

    public CommitteeModel() {
        //
    }

    public void formCommittee(ArrayList<Member> new_committee_members) {
        members = new_committee_members;
        //
    }

    public void addMember(Member newMember) {
        //
    }

    public void removeMember(Member member) {
        //
    }

    public void suspendMember(Member member) {
        suspendedMembers.add(member);
        members.remove(member);
    }

    public String getCommitteeConstitution() {
        return committeeConstitution;
    }

    public void setCommitteeConstitution() {
        //
    }
}
