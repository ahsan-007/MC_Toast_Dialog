package com.example.mc_toast_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastTest extends AppCompatActivity implements View.OnClickListener{

    Button displayToast;
    Button customToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        displayToast = findViewById(R.id.displayToast);
        displayToast.setOnClickListener(this);

        customToast = findViewById(R.id.customToast);
        customToast.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.displayToast:
                Toast toast = Toast.makeText(this, "This is a toast", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.customToast:
                LayoutInflater layoutInflater = getLayoutInflater();
                View myLayout = layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.customToastLayout));
                Toast toast1 = new Toast(this);
                toast1.setDuration(Toast.LENGTH_SHORT);
                toast1.setView(myLayout);
                toast1.show();
                break;
        }

    }
}