package com.example.week_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.week_7.dataModel.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewStudent;
    private ArrayList<Student> arrayListStudent = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewStudent = findViewById(R.id.listViewStudent);

        arrayListStudent.add(new Student("Larry","1850423","Computer Science"));
        arrayListStudent.add(new Student("Nicholas","1850613","CyberSecurity"));
        arrayListStudent.add(new Student("John","1850169","E-sport"));
        arrayListStudent.add(new Student("Kar Chun","1850696","Veterinary"));

        StudentAdapter adapter = new StudentAdapter(arrayListStudent, this);

        listViewStudent.setAdapter(adapter);

        listViewStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = (Student) parent.getAdapter().getItem(position);

                Intent i =new Intent(MainActivity.this,StudentProfileActivity.class);
                i.putExtra("name",student.getStudentName());
                i.putExtra("id",student.getStudentID());
                i.putExtra("course",student.getStudentCourse());
                startActivity(i);
            }
        });
    }

}
