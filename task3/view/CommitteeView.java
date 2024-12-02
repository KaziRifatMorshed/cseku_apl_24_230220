package view;

import model.Member;

import java.util.ArrayList;

public class CommitteeView {
    public CommitteeView() {
        //
    }

    public void committeeMember(ArrayList<Member> memberList) {
        System.out.println("List of all committee Member: ");
        for (int i = 0; i < memberList.size(); i++) {
            System.out.println(memberList.get(i));
        }
    }
    public void printPolicy(String policy) {
        System.out.println(policy);
    }
}
