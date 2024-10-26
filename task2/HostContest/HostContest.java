package HostContest;

import Committee.Meeting.Meeting;

public class HostContest {
    public HostContest() {
        new Meeting("online", "zoom", 2100);
        new Decide();
        new AnnounceContest();
        new JudgeSubmissions();

    }
}
