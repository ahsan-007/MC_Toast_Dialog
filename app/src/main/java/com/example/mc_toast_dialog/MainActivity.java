package com.example.mc_toast_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button toastBtn;
    Button dialogBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastBtn=findViewById(R.id.toast);
        toastBtn.setOnClickListener(this);

        dialogBtn=findViewById(R.id.dialog);
        dialogBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.toast:
                Intent intent = new Intent(MainActivity.this, ToastTest.class);
                startActivity(intent);
                break;
            case R.id.dialog:
                Intent intent1 = new Intent(MainActivity.this, DialogTest.class);
                startActivity(intent1);
                break;
        }
    }
}