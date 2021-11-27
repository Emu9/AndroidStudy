package android.study.prototype_todo.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    /**
     * LiveData<br>
     * 値が変わったら自動的に画面も変更するための変数
     */
    private MutableLiveData<String> mText = new MutableLiveData<>();
    /**
     * LiveData<br>
     * 値が変わったら自動的に画面も変更するための変数
     */
    private MutableLiveData<RowData> mRowData = new MutableLiveData<>();

    public DashboardViewModel() {
        mText.setValue("This is dashboard fragment");
        mRowData.setValue(new RowData());
    }

    public LiveData<String> getText() {
        return mText;
    }

    public MutableLiveData<RowData> getRowData() {
        return mRowData;
    }


    public void createRowData() {
        RowData data = new RowData();
        data.setTitle("HogeTitle!!");
        data.setContents("HogeHogeHogeHogeHogeHogeHogeHogeHogeHogeHoge");

        // postすることでobserveが反応します。
        mRowData.postValue(data);
    }
}

