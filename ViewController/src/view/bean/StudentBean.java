package view.bean;

import oracle.adf.view.rich.event.DialogEvent;

import view.commons.MyADFUtil;

public class StudentBean {
    public StudentBean() {
    }

    public void deleteStudentDialogListener(DialogEvent dialogEvent) {
        // Add event code here...
        MyADFUtil.executeOperation("Delete");
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("Student deleted successfully.");
    }
}
