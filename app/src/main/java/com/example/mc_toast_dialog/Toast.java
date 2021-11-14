package com.example.mc_toast_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
public class Toast extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.displayToast){
            Toast toast= new Toast();
            toast.setDuration();
            toast.show();
        }
    }
}