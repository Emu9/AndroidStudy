package android.study.prototype_todo.ui.dashboard;

import android.media.Image;

public class RowData {
    private Image mImage;
    private String mTitle;
    private String mContents;

    public Image getImage() {
        return mImage;
    }

    public void setImage(Image image) {
        mImage = image;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getContents() {
        return mContents;
    }

    public void setContents(String contents) {
        mContents = contents;
    }
}
