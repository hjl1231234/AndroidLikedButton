package com.example.test1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    public int number=0;
    private MutableLiveData<Integer> likedNum;




    public MutableLiveData<Integer> getLikedNum() {
        if(likedNum==null){
            likedNum=new MutableLiveData<>();
            likedNum.setValue(0);
        }

        return likedNum;
    }
    public void addLikedNum(int num){
        likedNum.setValue(likedNum.getValue()+num);



    }
}
