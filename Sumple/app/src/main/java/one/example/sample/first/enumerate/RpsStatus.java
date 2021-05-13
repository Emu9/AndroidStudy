package one.example.sample.first.enumerate;

/**
 * じゃんけん<br>
 * -1:後だし強制負け
 * 0:✊<br>
 * 1:✌<br>
 * 2:✋
 */
public enum RpsStatus {

    ROCK("✊", 0),
    PAPER("✋", 2),
    SCISSORS("✌", 1),
    CHEAT("後出し負け！！！", -1);

    private final String mLabel;

    // コミット時の状態との差分が見れます！
    private final int mId;


    RpsStatus(String label, int id) {
        mLabel = label;
        mId = id;
    }

    public String getLabel() {
        return mLabel;
    }

    public int getId() {
        return mId;
    }


    public static RpsStatus getById(int id) {
        for (RpsStatus rps : RpsStatus.values()) {
            if (rps.getId() == id) return rps;
        }
        return CHEAT;
    }

}
