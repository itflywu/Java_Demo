package com.setframe.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author flywu
 * @date 2022/11/16 17:20
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("jack");
        //实际上是List.add(new Integer(10))
        collection.add(10);
        collection.add(true);
        System.out.println(collection);
    }
    /*
     * 运行结果
     *[jack, 10, true]
     *  */
}
