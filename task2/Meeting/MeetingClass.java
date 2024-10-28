package Meeting;

// ISP = Interface Segregation Principle

public class MeetingClass {
    NotifyCommitteeClass notifyCommittee;
    StartMeeting startMeeting;

    public MeetingClass() {
        notifyCommittee = new NotifyCommitteeClass();
        startMeeting = new StartMeeting();
    }
}
