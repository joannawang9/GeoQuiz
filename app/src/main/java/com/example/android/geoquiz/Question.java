package com.example.android.geoquiz;

/**
 * Created by joan on 2/19/18.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;


    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }

    public Question (int textResId, boolean answerTrue){
        mAnswerTrue = answerTrue;
        mTextResId = textResId;
    }

}