package com.youji.study.stream.manufacture.mapping;

import com.youji.study.domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mapping {

    public static void main(String[] args) {

        /*
            Mapping
            맵(map)은 스트림 내 요소들을 하나씩 특정 값으로 변환해줍니다.
            이 때 값을 변환하기 위한 람다를 인자로 받습니다.

            스트림에 들어가 있는 값이 input 이 되어서 특정 로직을 거친 후
            output 이 되어 (리턴되는) 새로운 스트림에 담기게 됩니다.
            이러한 작업을 맵핑(mapping)이라고 합니다.
        */
        //map
        String[] names = {"abc", "you", "kim", "park"};
        Stream<String> stream = Arrays.stream(names).map(String::toUpperCase);
        stream.forEach(System.out::println);

        /*
        flatMap
        인자로 mapper를 받고 있는데,
        리턴 타입이 Stream 입니다.
        즉, 새로운 스트림을 생성해서 리턴하는 람다를 넘겨야합니다.

        flatMap 은 중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어주는 역할을 합니다.
        이러한 작업을 플래트닝(flattening)이라고 합니다.
        */

        List<Person> personList = Person.dummyPersonList();
        personList.stream()
                .flatMapToInt(person ->
                        IntStream.of(person.getAge(),
                                person.getIndex()))
                .average().ifPresent(avg -> System.out.println(Math.round(avg * 10)/10.0));
    }
}
