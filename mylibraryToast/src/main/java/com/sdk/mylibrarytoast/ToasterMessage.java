package com.sdk.mylibrarytoast;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public void showMessage(Context c,String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
