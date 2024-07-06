package com.example.model;

public class Person {
    
    //フィールドを宣言
    int age;
    String name;
    String skill;

    //コンストラクタ
    Person(String name ,int age ,String skill){
        this.name = name;
        this.skill = skill;
        this.age = age;
    }

    //ゲッターを定義
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSkill() {
        return skill;
    }
}