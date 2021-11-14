package com.example.mc_toast_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DialogTest extends AppCompatActivity implements View.OnClickListener {

    Button showDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_test);

        showDialog = findViewById(R.id.showDialog);
        showDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.showDialog:
                AlertDialog.Builder dialog = new AlertDialog.Builder(DialogTest.this) ;
                dialog.setMessage("This is Message");
                dialog.setTitle("This is Title");
                dialog.setPositiveButton("Postive", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                dialog.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog.show();
                break;
        }
    }
}