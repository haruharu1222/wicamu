package com.example.wicamu_main.ui.wicamu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WicamuViewModel extends ViewModel{

    private MutableLiveData<String> mText;

    public WicamuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("aaaaaaaaaaaaaaaat");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
