package HostContest;

// DIP = Dependency Inversion Principle

public class HostContestClass { // High Level Module
    DecisionMakerInterface decisionMaker;
    AnnouncementInterface announcement;
    SubmissionsInterface submission;
    JudgeInterface judge;
    ResultInterface result;
    PrizeInterface prize;

    public HostContestClass(DecisionMakerInterface decisionMaker, AnnouncementInterface announcement, SubmissionsInterface submission, JudgeInterface judge, ResultInterface result, PrizeInterface prize) {
        this.decisionMaker = new DecisionMakerClass();
        this.announcement = new AnnouncementClass();
        this.submission = new SubmissionClass();
        this.judge = new JudgeClass();
        this.result = new ResultClass();
        this.prize = new PrizeClass();
    }
}
