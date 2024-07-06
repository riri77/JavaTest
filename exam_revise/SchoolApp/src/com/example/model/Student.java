package com.example.model;


public class Student extends Person {

    //親クラスのコンストラクタの呼び出し
    public Student(String name ,int age ,String skill){
        super(name, age, skill);
    }
    
    //ゲッターを定義
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


}