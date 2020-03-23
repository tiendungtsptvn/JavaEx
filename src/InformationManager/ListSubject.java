package InformationManager;

import java.util.ArrayList;

public class ListSubject {
    private String mPersonalCode ;
    private int mNumberOfSubject ;
    ArrayList<Subject> subjectArrayList =new ArrayList<>() ;

    public ListSubject() {
    }

    public ListSubject(String mPersonalCode,int mNumberOfSubject ,ArrayList<Subject> subjectArrayList) {
        this.mPersonalCode = mPersonalCode;
        this.mNumberOfSubject=mNumberOfSubject ;
        this.subjectArrayList = subjectArrayList;

    }

    public String getmPersonalCode() {
        return mPersonalCode;
    }

    public void setmPersonalCode(String mPersonalCode) {
        this.mPersonalCode = mPersonalCode;
    }

    public int getmNumberOfSubject() {
        return mNumberOfSubject;
    }

    public void setmNumberOfSubject(int mNumberOfSubject) {
        this.mNumberOfSubject = mNumberOfSubject;
    }
}
