package Meeting;

// ISP = Interface Segregation Principle

public class Meeting_C {
    NotifyCommitteeClass notifyCommittee;
    StartMeetingClass startMeeting;

    public Meeting_C(String medium) {
        notifyCommittee = new NotifyCommitteeClass();
        startMeeting = new StartMeetingClass(medium);
    }

    public static void main(String[] args) {
        Meeting_C meeting = new Meeting_C("offline");
    }
}
