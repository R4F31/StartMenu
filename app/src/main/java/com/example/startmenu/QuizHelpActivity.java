package com.example.startmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class QuizHelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_help);
        Toast.makeText(this, "Quiz Help Activity", Toast.LENGTH_SHORT).show();
    }
}