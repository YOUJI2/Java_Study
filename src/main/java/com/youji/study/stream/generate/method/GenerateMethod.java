package com.youji.study.stream.generate.method;

import com.youji.study.domain.Person;

import java.util.stream.Stream;

public class GenerateMethod {

    public static void main(String[] args) {

        /*
            Stream.generate();
            generate메소드를 쓰면 Supplier<T>에 해당하는 값을 "람다"로 넣을 수 있다.
            -> Supplier<T>는 인자가 없고 리턴값만 있는 함수형 인터페이스
            -> 람다에서 리턴하는 값을 넣어준다.

            생성되는 스트림은 크기가 정해져있지 않고 무한(infinite)하기 때문에 특정 사이즈로 최대 크기를 제한해야 한다.
            -> 제한하지 않으면 무한 루프 발생
         */
        System.out.println("===============Stream.generate()===============");
        Stream<Person> generatedPersonStream =
                Stream.generate(()-> new Person(1,21, "유지훈1", "블라블라@naver.com"))
                        .limit(10);

        generatedPersonStream.forEach(p -> System.out.println(p.getIndex()+"번 , 이름 " + p.getName()));
    }
}
