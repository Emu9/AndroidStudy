package android.study.todo.model.data;


/**
 * Todoに設定するカラム
 */
public class TodoData {
    /**
     * Title
     */
    private String mTitle;
    /**
     * Text
     */
    private String mText;
    /**
     * 期日
     */
    private String mDeadlineTime;
    /**
     * 完了済み判定フラグ<br>
     * True : 完了済み<br>
     * False : 未完了
     */
    private boolean isFinish;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getDeadlineTime() {
        return mDeadlineTime;
    }

    public void setDeadlineTime(String deadlineTime) {
        mDeadlineTime = deadlineTime;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }
}
