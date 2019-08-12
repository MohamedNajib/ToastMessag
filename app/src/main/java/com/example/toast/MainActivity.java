package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.toastmessag.ToastMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_error_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastMessage.setError(MainActivity.this, getResources().getString(R.string.app_name), ToastMessage.LENGTH_SHORT, true).show();
            }
        });

        findViewById(R.id.button_i_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastMessage.setInfo(MainActivity.this, getResources().getString(R.string.app_name), ToastMessage.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_w_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastMessage.setWarning(MainActivity.this, getResources().getString(R.string.app_name), ToastMessage.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_s_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastMessage.setNormal(MainActivity.this,getResources().getString(R.string.app_name), ToastMessage.LENGTH_LONG).show();
            }
        });
    }
}
