package com.youji.study.stream.generate.type;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileTypeStream {

    public static void main(String[] args) throws IOException {

        /*
            자바 NIO files 클래스의 lines 메서드는 해당 파일의 각 라인을
            String 타입의 스트림으로 만들어 준다.
         */
        Stream<String> lineStream = Files
                .lines(Paths.get("C:/text.file"), StandardCharsets.UTF_8);
        lineStream.forEach(System.out::println);
    }
}
