package com.example.week_7.dataModel;

public class Student {
    private String studentName;
    private String studentID;
    private String studentCourse;

    public Student(){

    }

    public Student(String Name, String ID, String Course) {
        this.studentName = Name;
        this.studentID = ID;
        this.studentCourse = Course;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentName(String Name) {
        this.studentName = Name;
    }

    public void setStudentID(String ID) {
        this.studentID = ID;
    }

    public void setStudentCourse(String Course) {
        this.studentCourse = Course;
    }
}
