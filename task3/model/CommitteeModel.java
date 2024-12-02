package model;

import java.util.ArrayList;

public class CommitteeModel {

    /* Data of Committee */
    private ArrayList<Member> members; // Model containing data
    private ArrayList<Member> suspendedMembers = new ArrayList<>();
    private String policy;

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    private int numMember;
    private String committeeConstitution;

    /*Constructor*/
    public CommitteeModel() {
        //
    }

    /* services */
    public void formCommittee(ArrayList<Member> new_committee_members) {
        members = new_committee_members;
        //
    }

    public void addMember(Member newMember) {
        members.add(newMember);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void suspendMember(Member member) {
        suspendedMembers.add(member);
        members.remove(member);
        System.out.println("Member " + member.getName() + " has been suspended.");
    }

    public String getCommitteeConstitution() {
        return committeeConstitution;
    }

    public void setCommitteeConstitution(String committeeConstitution) {
        this.committeeConstitution = committeeConstitution;
    }

    public int updateNumMember() {
        return numMember = members.size();
    }

    public int getNumMember() {
        return updateNumMember();
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

}
