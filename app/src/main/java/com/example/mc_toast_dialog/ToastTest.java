package com.example.mc_toast_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastTest extends AppCompatActivity implements View.OnClickListener{

    Button displayToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        displayToast = findViewById(R.id.displayToast);
        displayToast.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.displayToast){
            Toast toast = Toast.makeText(this,"This is a toast",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}