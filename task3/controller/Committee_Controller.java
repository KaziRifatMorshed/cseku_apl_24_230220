package controller;

import model.Committee_Model;
import model.Members;
import view.Committee_View;

import java.util.ArrayList;

public class Committee_Controller {
    Committee_Model model_obj;
    Committee_View view_obj;
    ArrayList<Members> members_list;

    public Committee_Controller(Committee_Model model_obj, Committee_View view_obj) {
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
