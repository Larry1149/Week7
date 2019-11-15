package com.example.week_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StudentProfileActivity extends AppCompatActivity {
    private String selfIntro = "Hi, my name is [name]. \n"+
                               "My student ID is [studentID]\n"+
                               "I am a [course] student";

    private String studentName, studentID, studentCourse;
    private TextView tvselfIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);

        studentName = getIntent().getStringExtra("name");
        studentID = getIntent().getStringExtra("id");
        studentCourse = getIntent().getStringExtra("course");

        replaceData();
        tvselfIntro = findViewById(R.id.studentSelfIntro);
        tvselfIntro.setText(selfIntro);

    }

    private void replaceData(){
        selfIntro = selfIntro.replace("[name]",studentName);
        selfIntro = selfIntro.replace("[studentID]",studentID);
        selfIntro = selfIntro.replace("[course]",studentCourse);
    }
}
