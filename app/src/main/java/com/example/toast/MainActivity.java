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
                ToastMessage.setError(MainActivity.this, "Error Toast", ToastMessage.LENGTH_SHORT, true).show();
            }
        });

        findViewById(R.id.button_i_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastMessage.setInfo(MainActivity.this, "Info Toast", ToastMessage.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_w_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastMessage.setWarning(MainActivity.this, "Warning Toast", ToastMessage.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_s_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastMessage.setNormal(MainActivity.this, "Normal Toast", ToastMessage.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.button_n_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastMessage.setSuccess(MainActivity.this,"Success Toast", ToastMessage.LENGTH_LONG, true).show();
            }
        });
    }
}
