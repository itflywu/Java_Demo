package com.setframe.list;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author flywu
 * @date 2022/11/17 10:09
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list);
        //把单个取出来
        System.out.println(list.get(1));
        //遍历数据
        //增强for循环
        for (String string : list) {
            System.out.println(string);
        }
        //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //迭代器进行遍历
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
