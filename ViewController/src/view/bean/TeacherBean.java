package view.bean;

import oracle.adf.view.rich.event.DialogEvent;

import view.commons.MyADFUtil;

public class TeacherBean {
    public TeacherBean() {
    }

    public void deleteTeacherDialogListener(DialogEvent dialogEvent) {
        // Add event code here...
        MyADFUtil.executeOperation("Delete");
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("Teacher deleted successfully.");
    }
}
