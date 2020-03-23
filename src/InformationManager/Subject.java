package InformationManager;

public class Subject {
    private String mIdSubject ;
    private String mNameSubject ;
    private int mPartNumSubject ;
    private float mScores ;

    public Subject() {
    }

    public Subject(String mIdSubject,
                   String mNameSubject, int mPartNumSubject, float mScores) {
        this.mIdSubject = mIdSubject;
        this.mNameSubject = mNameSubject;
        this.mPartNumSubject = mPartNumSubject;
        this.mScores = mScores;
    }

    public String getmIdSubject() {
        return mIdSubject;
    }

    public void setmIdSubject(String mIdSubject) {
        this.mIdSubject = mIdSubject;
    }

    public String getmNameSubject() {
        return mNameSubject;
    }

    public void setmNameSubject(String mNameSubject) {
        this.mNameSubject = mNameSubject;
    }

    public int getmPartNumSubject() {
        return mPartNumSubject;
    }

    public void setmPartNumSubject(int mPartNumSubject) {
        this.mPartNumSubject = mPartNumSubject;
    }

    public float getmScores() {
        return mScores;
    }

    public void setmScores(float mScores) {
        this.mScores = mScores;
    }

}
