package com.example.code;

import android.app.Activity;
import android.widget.Toast;

public class BackKey {
    private long BackKeyPressedTime = 0;
    private Toast toast;
    private final Activity activity;

    public BackKey(Activity activity) {
        this.activity = activity;
    }

    public void showMessage(){
        toast = Toast.makeText(activity,"\"뒤로가기\" 버튼을 한번 더 누르시면 종료 됩니다.",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onBackPressed(){
        if(System.currentTimeMillis() <= BackKeyPressedTime + 2000){
            activity.finish();
            toast.cancel();
        }

        if(System.currentTimeMillis() >= BackKeyPressedTime + 2000){
            showMessage();
            BackKeyPressedTime = System.currentTimeMillis();
        }
    }



}
