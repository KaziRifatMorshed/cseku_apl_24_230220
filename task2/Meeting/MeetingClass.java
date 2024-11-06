package Meeting;

// ISP = Interface Segregation Principle

public class MeetingClass {
    NotifyCommitteeClass notifyCommittee;
    StartMeetingClass startMeeting;

    public MeetingClass() {
        notifyCommittee = new NotifyCommitteeClass();
        startMeeting = new StartMeetingClass();
    }
}
