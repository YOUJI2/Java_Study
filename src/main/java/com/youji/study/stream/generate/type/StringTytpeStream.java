package com.youji.study.stream.generate.type;

import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringTytpeStream {

    public static void main(String[] args) {

        /*
            문자열 스트림
            String을 이용해서 스트림을 생성할 수 있다.
        */
        System.out.println("==========Char -> IntStream Test============");
        IntStream charsStream = "You ji Hoon".chars();
        charsStream.forEach(c-> System.out.println((char)(c)));

        //정규식을 활용해 문자열을 자르고, 스트림으로도 만들 수 있다.\
        System.out.println("==========Pattern Split Test============");
        String str = "hi, my, name, is, mare";
        Stream<String> stringStream = Pattern.compile(", ").splitAsStream(str);
        stringStream.forEach(System.out::println);
    }
}
