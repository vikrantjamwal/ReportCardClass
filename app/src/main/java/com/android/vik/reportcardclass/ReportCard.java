package com.android.vik.reportcardclass;

public class ReportCard {

    private int mStudentName;
    private int mStudentGrade;
    private int mEnglishMarks;
    private int mScienceMarks;
    private int mMathMarks;
    private int mAggregateMarks;

    public ReportCard(int mStudentName, int mStudentGrade, int mEnglishMarks, int mScienceMarks, int mMathMarks, int mAggregateMarks) {
        this.mStudentName = mStudentName;
        this.mStudentGrade = mStudentGrade;
        this.mEnglishMarks = mEnglishMarks;
        this.mScienceMarks = mScienceMarks;
        this.mMathMarks = mMathMarks;
        this.mAggregateMarks = mAggregateMarks;
    }

    public int getStudentName() {
        return mStudentName;
    }

    public void setStudentName(int mStudentName) {
        this.mStudentName = mStudentName;
    }

    public int getStudentGrade() {
        return mStudentGrade;
    }

    public void setStudentGrade(int mStudentGrade) {
        this.mStudentGrade = mStudentGrade;
    }

    public int getEnglishMarks() {
        return mEnglishMarks;
    }

    public void setEnglishMarks(int mEnglishMarks) {
        this.mEnglishMarks = mEnglishMarks;
    }

    public int getScienceMarks() {
        return mScienceMarks;
    }

    public void setScienceMarks(int mScienceMarks) {
        this.mScienceMarks = mScienceMarks;
    }

    public int getMathMarks() {
        return mMathMarks;
    }

    public void setMathMarks(int mMathMarks) {
        this.mMathMarks = mMathMarks;
    }

    public int getAggregateMarks() {
        return mAggregateMarks;
    }

    public void setAggregateMarks(int mAggregateMarks) {
        this.mAggregateMarks = mAggregateMarks;
    }

    @Override public String toString() {
        return "ReportCard {" +
                "Student Name=" + mStudentName +
                ", Student Grade=" + mStudentGrade +
                ", English Marks=" + mEnglishMarks +
                ", Science Marks=" + mScienceMarks +
                ", Math Marks=" + mMathMarks +
                ", Aggregate Marks=" + mAggregateMarks +
                "}";
    }
}
