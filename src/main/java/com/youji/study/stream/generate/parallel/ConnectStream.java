package com.youji.study.stream.generate.parallel;

import com.youji.study.domain.Person;

import java.util.List;
import java.util.stream.Stream;

public class ConnectStream {

    public static void main(String[] args) {

        /*
            스트림 연결하기
            tream.concat 메소드를 이용해 두 개의 스트림을 연결해서 새로운 스트림을 만들어낼 수 있습니다.
        */
        List<Person> list = Person.dummyPersonList().subList(0, 3);  // 0, 1, 2
        List<Person> list2 = Person.dummyPersonList().subList(3, 7); // 3, 4, 5, 6

        Stream<Person> stream1 = list.stream();
        Stream<Person> stream2 = list2.stream();

        //스트림 연결
        Stream<Person> concatStream = Stream.concat(stream1, stream2);
        concatStream.forEach(person -> System.out.println(person.getIndex()));
    }
}
