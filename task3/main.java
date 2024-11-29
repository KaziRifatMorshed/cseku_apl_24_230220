import controller.controller;
import model.model;
import view.view;

class main {
    public static void main(String[] args) {
        model modelObj = new model();
        view viewObj = new view();

        controller controllerObj = new controller(modelObj, viewObj);

        controllerObj.postInSocialMedia();
        controllerObj.hostContest();
        controllerObj.formCommittee();
        controllerObj.meeting();
    }

}
