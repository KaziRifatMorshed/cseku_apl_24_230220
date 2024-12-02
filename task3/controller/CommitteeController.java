package controller;

import model.CommitteeModel;
import model.Member;
import view.CommitteeView;

import java.util.ArrayList;

public class CommitteeController {
    CommitteeModel modelObj;
    CommitteeView viewObj;

    public CommitteeController(CommitteeModel modelObj, CommitteeView viewObj) {
        this.modelObj = modelObj;
        this.viewObj = viewObj;
    }

    public void formCommittee(ArrayList<Member> newMemberList) {
        modelObj.formCommittee(newMemberList);
        viewObj.committeeMember(modelObj.getMembers());
    }

    public void newMemberList(ArrayList<Member> new_committee_Member) {
        modelObj.setMembers(new_committee_Member);
    }

    public void viewCommitteeMembersList() {
        viewObj.committeeMember(modelObj.getMembers());
    }

    public void setCommitteeConstitution(String committeeConstitution) {
        modelObj.setCommitteeConstitution(committeeConstitution);
    }

    public String getCommitteeConstitution() {
        return modelObj.getCommitteeConstitution();
    }

    public void addMember(Member member) {
        modelObj.addMember(member);
    }

    public void suspendMember(Member member) {
        modelObj.suspendMember(member);
    }

    public void removeMember(Member member) {
        modelObj.removeMember(member);
    }

    public int numMembers() {
        return modelObj.getNumMember();
    }

    public void setPolicy(String policy) {
        modelObj.setPolicy(policy);
    }

    public void printPolicy() {
        viewObj.printPolicy(modelObj.getPolicy());
    }

}
