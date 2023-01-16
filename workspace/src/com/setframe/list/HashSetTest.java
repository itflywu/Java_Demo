package com.setframe.list;

import java.util.HashSet;

/**
 * @author flywu
 * @date 2022/11/18 10:27
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new  HashSet<Integer>();
        int size = 10;
        for(int i =0;i<size;i++){
            set.add(i);
        }
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
