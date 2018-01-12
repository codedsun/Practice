package com.suneetsrivastava.practice.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.suneetsrivastava.practice.Data.Item;

import java.util.List;

/**
 * Created by suneetsrivastava on 12/01/18.
 */

public class DataViewModel extends ViewModel {
    private LiveData<List<Item>> itemLiveData;

    DataViewModel(){
        itemLiveData = new MutableLiveData<>();
    }

    public LiveData<List<Item>> getItemLiveData() {
        return itemLiveData;
    }
}
