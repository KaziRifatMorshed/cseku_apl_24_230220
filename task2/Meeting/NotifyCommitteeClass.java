package Meeting;

public class NotifyCommitteeClass implements EmailNotificationInterface, GroupAnnouncementInterface {
    @Override
    public void sendEmailNotification() {
        //
    }

    @Override
    public void announcement() {
        //
    }
    public NotifyCommitteeClass(){
        announcement();
        sendEmailNotification();
    }
}
