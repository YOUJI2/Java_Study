package com.youji.study.stream.generate;

import com.youji.study.domain.Person;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStream {

    /*
        컬렉션 스트림
        컬렉션 타입(Collection, List, Set)의 경우 인터페이스에 추가된
        디폴트 메소드 (Stream)을 이용해서 스트림을 만들 수 있다.

        parallelStream()을 쓰면 병렬처리로 빠르게 작업이 가능하다.
     */

    public static void main(String[] args) {

        List<Person> list = Person.dummyPersonList();

        //List의 stream 메소드로 쉽게 만들 수 있다
        Stream<Person> personStream = list.stream();

        //parallelStream으로 병렬 처리를 할 수 있다.
        Stream<Person> parallelPersonStream = list.parallelStream();

        long beforeTime = System.currentTimeMillis();
        personStream.forEach(p->{
            System.out.println("index="+p.getIndex()+" "+Thread.currentThread().getName() + new Date());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){

            }
        });
        long afterTime = System.currentTimeMillis();
        System.out.println("Stream 시간차이(ms) : "+ (afterTime-beforeTime));


        beforeTime = System.currentTimeMillis();
        parallelPersonStream.forEach(p->{
            System.out.println("index="+p.getIndex()+" "+Thread.currentThread().getName() + new Date());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){

            }
        });
        afterTime = System.currentTimeMillis();
        System.out.println("parallelStream 시간차이(ms) : "+ (afterTime-beforeTime));

    }
}
