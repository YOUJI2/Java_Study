package com.youji.study.stream.generate;

import com.youji.study.domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayStream {

    /*
      스트림 인터페이스는 컬렉션을 파이프 식으로 처리하도록 하면서
       고차함수로 그 구조를 추상화 한다..

      배열 스트림
      Arrays.stream(배열) 메소드로 변환할 수 있다.
     */
    public static void main(String[] args) {

        List<Person> list = Person.dummyPersonList();
        Person[] personList = list.toArray(new Person[0]); // 배열로 변환

        //Stream으로 변환
        Stream<Person> personStream = Arrays.stream(personList, 1, 7);

        //출력
        personStream.forEach(p->{
            System.out.println(p.getAge()+" "+p.getName()+" "+p.getEmail());
        });

    }
}
