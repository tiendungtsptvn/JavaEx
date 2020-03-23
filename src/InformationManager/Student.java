package InformationManager;

public class Student {
    private String mName ;
    private String mYearOfBirth ;
    private String mGender ;
    private String mPersonalCode ;
    private String mClassCode ;

    public Student() {
    }

    public Student(String mName, String mYearOfBirth,
                   String mGender, String mPersonalCode, String mClassCode) {
        this.mName = mName;
        this.mYearOfBirth = mYearOfBirth;
        this.mGender = mGender;
        this.mPersonalCode = mPersonalCode;
        this.mClassCode = mClassCode;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmYearOfBirth() {
        return mYearOfBirth;
    }

    public void setmYearOfBirth(String mYearOfBirth) {
        this.mYearOfBirth = mYearOfBirth;
    }

    public String getmGender() {
        return mGender;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }

    public String getmPersonalCode() {
        return mPersonalCode;
    }

    public void setmPersonalCode(String mStudentCode) {
        this.mPersonalCode = mStudentCode;
    }

    public String getmClassCode() {
        return mClassCode;
    }

    public void setmClassCode(String mClassCode) {
        this.mClassCode = mClassCode;
    }
}
