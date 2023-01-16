package com.setframe.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author flywu
 * @date 2022/11/16 17:39
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("三国演义", "罗贯中", 34.6));

        for (Object book : col) {
            System.out.println(book);
        }

    }
}
