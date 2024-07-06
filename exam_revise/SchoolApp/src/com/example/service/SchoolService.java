package com.example.service;
import com.example.model.Student;
import com.example.model.Teacher;
import java.util.ArrayList;

public class SchoolService {

    //リストフィールドを定義
    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Teacher> teacherList = new ArrayList<>();

    //コンストラクタ
    public SchoolService() {
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
    }

    //リストに追加するメソッド
    public void addStudent(Student student) {
        if (student.getAge() >= 10) {
            studentList.add(student);
        }else {
            System.out.println(student.getName() + "さんは10歳以下です");
        }
    }

    //リストに追加するメソッド
    public void addTeacher(Teacher teacher) {
        if (teacher.getAge() >= 10) {
            teacherList.add(teacher);
        } else {
            System.out.println(teacher.getName() + "さんは10歳以下です");
        }
    }

    //リストの内容を両方コンソール出力するメソッド
    public void start(){
        for (Student student : this.studentList){
            System.out.println(student.getName() + "," + student.getAge() + "," + student.getSkill() );
        }
        for (Teacher teacher : this.teacherList){
            System.out.println(teacher.getName() + "," + teacher.getAge() + "," + teacher.getSkill() );
        }
    }


    }