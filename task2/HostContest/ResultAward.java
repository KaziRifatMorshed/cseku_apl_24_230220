package HostContest;

import Activity.PublishPost;

public class ResultAward {

    public ResultAward() {
        publishResult();
        giveAward();
    }

    void publishResult() {
        new PublishPost();
    }

    void giveAward() {
        //
    }
}
