package com.setframe.list;

        import java.util.ArrayList;
        import java.util.Iterator;

/**
 * @author flywu
 * @date 2022/11/17 10:26
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        /**
         * 创建一个ArrayList对象，
         * 定义元素个数，
         * 初始化ArrayList中的元素
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = 10;
        for (int i = 1; i < size; i++) {
            arrayList.add(i);
        }
//        调用有参构造传入ArrayList作为参数
        ArrayList<Integer> otherList = new ArrayList<>(arrayList);
        System.out.println("arrayList的第0个位置元素：" + arrayList.get(0));
        System.out.println("arrayList元素5所在位置：" + arrayList.indexOf(5));
        System.out.println("arrayList是否包含元素10：" + arrayList.contains(10));
        System.out.println("arrayList删除第0个位置元素：" + arrayList.remove(0));

        /**
         * 获取ArrayList的迭代器
         */
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println("iterator()迭代器输出ArrayList元素：" + element);
            if (element == 5) {
                iterator.remove();
                System.out.println("iterator()迭代器删除ArrayList元素：" + element);
                break;
            }
        }
        iterator.forEachRemaining(integer -> System.out.println("forEachRemaining()输出元素" + integer));
//        删除与ArrayList交集部分
        otherList.removeAll(arrayList);
        otherList.forEach(integer -> System.out.println("forEach()输出otherList元素：" + integer));
    }
    /*
    * 运行结果
    * arrayList的第0个位置元素：1
    arrayList元素5所在位置：4
    arrayList是否包含元素10：false
    arrayList删除第0个位置元素：1
    iterator()迭代器输出ArrayList元素：2
    iterator()迭代器输出ArrayList元素：3
    iterator()迭代器输出ArrayList元素：4
    iterator()迭代器输出ArrayList元素：5
    iterator()迭代器删除ArrayList元素：5
    forEachRemaining()输出元素6
    forEachRemaining()输出元素7
    forEachRemaining()输出元素8
    forEachRemaining()输出元素9
    forEach()输出otherList元素：1
    forEach()输出otherList元素：5*/
}
