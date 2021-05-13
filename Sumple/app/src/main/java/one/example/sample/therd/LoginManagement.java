package one.example.sample.therd;

import java.time.LocalDateTime;

/**
 * ログイン管理クラス(データクラス)
 */
public class LoginManagement {
    /**
     * ログインユーザー
     */
    private String mUser;

    /**
     * ログイン時間
     */
    private LocalDateTime mLocalDateTime;

    public String getUser() {
        return mUser;
    }

    public void setUser(String user) {
        mUser = user;
    }

    public LocalDateTime getLocalDateTime() {
        return mLocalDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        mLocalDateTime = localDateTime;
    }
}
