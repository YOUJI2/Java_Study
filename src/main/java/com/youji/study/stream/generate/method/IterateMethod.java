package com.youji.study.stream.generate.method;

import com.youji.study.domain.Person;

import java.util.stream.Stream;

public class IterateMethod {

    public static void main(String[] args) {

        /*
            Stream.Iterate();
            초기값과 해당 값을 다루는 람다를 이용해서 스트림에 들어갈 요소를 만든다.

            Iterate에는 1.초기값, 2.해당값 조건식 을 인자로 받아서 설정하고 반드시 제한값을 명시해야한다.
            -> generate 처럼 무한루프에 빠질 수 있다.
         */
        System.out.println("===============Stream.generate()===============");
        Person person = new Person(1,21, "유지훈1", "블라블라@naver.com");
        Stream<Person> iteratedPersonStream =
                Stream.iterate(person, p -> {
                    p.setIndex(p.getIndex()+3);
                            return p;
                    }
                ).limit(10);

        iteratedPersonStream.forEach(p -> System.out.println(p.getIndex()+"번 , 이름 " + p.getName()));
    }
}
