package com.setframe.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flywu
 * @date 2022/11/17 9:47
 */
public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(13);
        list.add(13);
        list.add(1, 20);
        System.out.println(list);
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list.addAll(1, list1);
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list.set(0, 30));
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.indexOf(13));
        System.out.println(list.lastIndexOf(13));
        System.out.println(list.subList(0,2));
    }
}
