package com.youji.study.stream.generate;

import com.youji.study.domain.Person;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmptyStream {

    public static void main(String[] args) {
        List<Person> list = Person.dummyPersonList();
        List<Person> list2 = null;

        Stream<Person> stream = (list2 == null) || list2.isEmpty()
                ? Stream.empty()
                : list.stream();
        System.out.println(stream.collect(Collectors.toList())); //빈배열 출력

        Stream<Person> stream2 = (list == null) || list.isEmpty()
                ? Stream.empty()
                : list.stream();
        System.out.println(stream2.collect(Collectors.toList()));


    }
}
