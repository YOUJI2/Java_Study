package com.youji.study.stream.generate.method;

import com.youji.study.domain.Person;

import java.util.stream.Stream;

public class BuilderMethod {

    public static void main(String[] args) {

        /*
            Stream.builder();
            빌더(Builder)를 사용하면 스트림에 직접적으로 원하는 값을 넣어서 리턴할 수 있다.
            마지막에 build 메소드로 스트림을 리턴합니다.
        */
        System.out.println("===============Stream.builder()===============");
        Stream<Person> builderPersonStream =
            Stream.<Person>builder()
                .add(new Person(1,21, "유지훈1", "블라블라@naver.com"))
                .add(new Person(2,22, "유지훈2", "블라블라@naver.com"))
                .add(new Person(3,23, "유지훈3", "블라블라@naver.com"))
                .add(new Person(4,24, "유지훈4", "블라블라@naver.com"))
                .build();
        System.out.println();

        builderPersonStream.forEach(p -> System.out.println(p.getIndex()+"번 , 이름 " + p.getName()));
    }
}
