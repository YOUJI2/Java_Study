package com.youji.study.stream.generate.type;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveTypeStream {

    /*
        기본 타입형 스트림
        Primitive(int, long, double)의 경우 직접 제네릭을 사용하지 않고
        직접적으로 해당 타입의 스트림을 다룰 수도 있다.
        range       : 종료 범위를 포함하지 않는다.
        rangeClosed : 종료 범위를 포함한다.
     */
    public static void main(String[] args) {

        //기본 range 값으로 출력
        IntStream intStream = IntStream.range(1, 10);
        LongStream longStream = LongStream.rangeClosed(1, 10);

        intStream.forEach(System.out::println);
        System.out.println("======================");
        longStream.forEach(System.out::println);

        /*
            제네릭을 사용하지 않으면 오토박싱(auto-boxing)이 일어나지 않는다.
            오토박싱 : wrapper class 로 자동 변환 시켜 주는 것

            boxed()를 통해 Wrapper Class로 만들 수 있다.
         */
        System.out.println("==========boxed Test============");
        Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
        boxedIntStream.forEach(System.out::println);

        /*
            Random으로 난수를 생성해서 (IntStream LongStream, DoubleStream)을 만들 수 있다.
         */
        System.out.println("==========Random() Test============");
        DoubleStream doubleStream = new Random().doubles(4);
        doubleStream.forEach(System.out::println);

    }
}
