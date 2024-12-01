package controller;

import model.CommitteeModel;
import model.Members;
import view.CommitteeView;

import java.util.ArrayList;

public class CommitteeController {
    CommitteeModel model_obj;
    CommitteeView view_obj;
    ArrayList<Members> members_list;

    public CommitteeController(CommitteeModel model_obj, CommitteeView view_obj) {
        this.model_obj = model_obj;
        this.view_obj = view_obj;
    }

    public void formCommittee() {
        model_obj.formCommittee(members_list);
        view_obj.committeeMembers();
    }

    public void newMemberList(ArrayList<Members> new_committee_members) {
        members_list = new_committee_members;
    }
}
