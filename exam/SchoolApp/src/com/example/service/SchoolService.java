package com.example.service;
import com.example.model.Student;
import com.example.model.Teacher;
import java.util.ArrayList;

public class SchoolService {
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Teacher> teacherList = new ArrayList<>();

    public SchoolService() {
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student.getAge() >= 10) {
            studentList.add(student);
        } else {
            System.out.println(student.getName() + "さんは10歳以下です");
        }
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.getAge() >= 10) {
            teacherList.add(teacher);
        } else {
            System.out.println(teacher.getName() + "さんは10歳以下です");
        }
    }

    public void displayAll() {
        System.out.println("学生");
        for (Student student : studentList) {
            System.out.println(student.getName() + "," + student.getAge() + "," + student.getStudentId() + ",生徒");
        }

        System.out.println("教師");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getName() + "," + teacher.getAge() + "," + teacher.getTeacherId() + ",教師");
        }
    }
}