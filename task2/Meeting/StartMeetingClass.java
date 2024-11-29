package Meeting;

public class StartMeetingClass implements OnlineMeetingInterface, OfflineMeetingInterface {

    public StartMeetingClass(String medium) { // constructor
        if (medium.equals("offline")) {
            offlineMeeting();
        } else {
            onlineMeeting();
        }
    }

    @Override
    public void offlineMeeting() {
//
    }

    @Override
    public void onlineMeeting() {
//
    }

}
