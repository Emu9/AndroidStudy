package com.example.sample.fourth.model.form;

//データクラス
public class UserForm {
    private String mName;
    private String mContent;
    private String mDone;

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String mContent) {
        this.mContent = mContent;
    }

    public String getDone() {
        return mDone;
    }

    public void setDone(String mDone) {
        this.mDone = mDone;
    }
}
