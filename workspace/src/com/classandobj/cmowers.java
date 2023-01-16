package com.classandobj;

import sun.java2d.cmm.PCMM;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author flywu
 * @date 2023/1/12 14:19
 */
public class cmowers {

    public static void main(String[] args) {
        String [] cmowers = {"沉默","王二","一枚有趣的程序员"};
//        Arrays.asList(cmowers).stream().forEach(s -> System.out.println(s));
//        Stream.of(cmowers).forEach(System.out::println);
//        Arrays.stream(cmowers).forEach(System.out::println);
        String cmowersList = Arrays.toString(cmowers);
//        System.out.println(cmowersList);
//        System.out.println(Arrays.toString(cmowers));
//        String s1 = new String("二哥三妹");
//        String s2 = s1.intern();
//        System.out.println(s1 == s2);
//        String s1 = new String("二哥") + new String("三妹");
//        String s2 = s1.intern();
//        System.out.println(s1 == s2);
        String alita = new String("小萝莉");
        String luolita = new String("小萝莉");

        System.out.println(alita.equals(luolita)); // true
        System.out.println(alita == luolita); // false


    }
}

