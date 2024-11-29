package Committee;

public class CommitteeActivity_C {

    public static void main(String[] args) {
        BudgetCommittee_C budgeCommittee = new BudgetCommittee_C();
        DesignCommittee_C designCommittee = new DesignCommittee_C();
        EventManagementCommittee_C eventManagementCommittee = new EventManagementCommittee_C();
        HumanResourceCommittee_C humanResourceCommittee = new HumanResourceCommittee_C();

        budgeCommittee.budgetManagement();
        designCommittee.designBanner();
        eventManagementCommittee.manageEvent();
        humanResourceCommittee.memberRecruitment();
    }
}
