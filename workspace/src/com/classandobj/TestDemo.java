package com.classandobj;

/**
 * @author flywu
 * @date 2022/11/9 10:26
 */
//class Book {
//    //无参，无返回值的构造方法
//    public Book() {
//        System.out.println("无参构造方法");
//    }
//}

//public class TestDemo {
//    public static void main(String args[]) {
//        Book book = null;//声明对象
////        book = new Book();
//    }
//    /**
//     * 运行结果
//     * 无参构造方法
//     */
//}

class Book {

    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        System.out.println("有俩个参数的构造方法");
    }

    public void getInfo() {
        System.out.println("图书的名称：" + title + " 图书的价格：" + price);
    }
}

public class TestDemo {
    public static void main(String args[]) {
        //匿名对象
        new Book("Java开发", 89.9).getInfo();
    }
    /*
     * 运行结果
     * 有俩个参数的构造方法
     * 图书的名称：Java开发 图书的价格：89.9
     * */
}
