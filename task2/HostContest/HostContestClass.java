package HostContest;

// DIP = Dependency Inversion Principle

public class HostContestClass { // High Level Module
    DecisionMakerClass decisionMaker;
    AnnouncementClass announcement;
    SubmissionClass submission;
    JudgeClass judge;
    ResultClass result;
    PrizeClass prize;

    public HostContestClass(DecisionMakerClass decisionMaker, AnnouncementClass announcement, SubmissionClass submission, JudgeClass judge, ResultClass result, PrizeClass prize) {
        this.decisionMaker = decisionMaker;
        this.announcement = announcement;
        this.submission = submission;
        this.judge = judge;
        this.result = result;
        this.prize = prize;
    }
}
