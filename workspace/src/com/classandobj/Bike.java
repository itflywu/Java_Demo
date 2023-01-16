package com.classandobj;

import sun.rmi.runtime.NewThreadAction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flywu
 * @date 2023/1/13 15:43
 */
public class Bike {
    List<String> list;

    {
        list = new ArrayList<>();
        list.add("沉默王二");
        list.add("沉默王三");
    }

    public static void main(String[] args) {
        System.out.println(new Bike().list);
    }
}
