package controller;

import model.CommitteeModel;
import model.Member;
import view.CommitteeView;

import java.util.ArrayList;

public class CommitteeController {
    CommitteeModel model_obj;
    CommitteeView view_obj;
    ArrayList<Member> Member_list;

    public CommitteeController(CommitteeModel model_obj, CommitteeView view_obj) {
        this.model_obj = model_obj;
        this.view_obj = view_obj;
    }

    public void formCommittee() {
        model_obj.formCommittee(Member_list);
        view_obj.committeeMember();
    }

    public void newMemberList(ArrayList<Member> new_committee_Member) {
        Member_list = new_committee_Member;
    }
}
