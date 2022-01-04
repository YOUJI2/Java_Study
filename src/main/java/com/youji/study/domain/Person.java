package com.youji.study.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Person {
    int index;
    int age;
    String name;
    String email;

    public Person(int index, int age, String name, String email) {
        this.index = index;
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public static List<Person> dummyPersonList(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,21, "유지훈1", "블라블라@naver.com"));
        personList.add(new Person(2,22, "유지훈2", "블라블라@naver.com"));
        personList.add(new Person(3,23, "유지훈3", "블라블라@naver.com"));
        personList.add(new Person(4,24, "유지훈4", "블라블라@naver.com"));
        personList.add(new Person(5,25, "유지훈5", "블라블라@naver.com"));
        personList.add(new Person(6,26, "유지훈6", "블라블라@naver.com"));
        personList.add(new Person(7,27, "유지훈7", "블라블라@naver.com"));
        return personList;
    }
}
