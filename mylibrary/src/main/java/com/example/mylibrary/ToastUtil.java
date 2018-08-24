package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static void toastMy(Context context){
        Toast.makeText(context,"测试成功",Toast.LENGTH_LONG).show();
    }
}
