package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class developer_profile extends AppCompatActivity {

    Button backBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_profile);

        setupHyperlink();

    }

    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.textView5);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}