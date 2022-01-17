package com.youji.study.stream.generate.parallel;

import com.youji.study.domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {

     /*
        스트림 생성 시 사용하는 stream 대신 parallelStream 메소드를 사용해서 병렬 스트림을 쉽게 생성할 수 있다.
        내부적으로는 쓰레드를 처리하기 위해 자바 7부터 도입된 Fork/Join framework 를 사용합니다.
     */
        //병렬 스트림 생성
        List<Person> list = Person.dummyPersonList();
        Stream<Person> parallelStream = list.parallelStream();

        //병렬 여부 확인
        boolean isParallel = parallelStream.isParallel();
        System.out.println("isParallel : " + isParallel);

        boolean isMany = parallelStream
                .map(person -> person.getAge() * 30)
                .allMatch(amount -> amount > 100);
        System.out.println("isMany : " + isMany);

        //배열을 이용한 병렬 스트림 생성
        IntStream parallelIntStream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7}).parallel();

        // - 병렬
        //컬렉션과 배열이 아닌 경우는 다음과 같이 parallel메소드를 활용한다.
        IntStream intStream = IntStream.range(1, 100).parallel();
        isParallel = intStream.isParallel();
        System.out.println("isParallel : " + isParallel);

        // - 시퀀스 [항상 병렬이 좋은 것만은 아니다.]
        intStream = intStream.sequential();
        isParallel = intStream.isParallel();
        System.out.println("isParallel : " + isParallel);
    }
}
