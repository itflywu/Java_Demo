package com.classandobj;

/**
 * @author flywu
 * @date 2022/11/23 16:03
 */

import java.util.Date;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {

        Vector v = new Vector(4);
        System.out.println(" this v capacity is " + v.capacity());

        v.addElement(new Integer(1));

        v.addElement("hello");
        v.addElement(new Float(2.45));
//        v.setElementAt("hi",2 );
        v.insertElementAt(2.45,1);
        v.removeElement(2.45);
//        v.removeAllElements();
//        v.remove(1);
//        System.out.println(v.indexOf("hi"));
//        System.out.println(v.indexOf(1,1));
//        System.out.println(v.lastIndexOf(new Float(2.45)));
//        System.out.println(v.lastIndexOf("hello",2));
        System.out.println(" this v capacity is " + v.capacity() + ",the size is " + v.size());
        for(int i=0;i<v.size();i++){
            System.out.println(v.elementAt(i));
        }
        v.addElement(new Date());
        System.out.println("the first Element is " + (Integer) v.firstElement());
        System.out.println(" the last Element is " + ((Date) v.lastElement()).toString());

        if (v.contains(new Float(2.45))) {
            System.out.println("this Vector v contains 2.45");

        }
    }
}