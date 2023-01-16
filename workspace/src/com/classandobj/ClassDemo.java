package com.classandobj;

/**
 * @author flywu
 * @date 2022/11/9 9:22
 */
//class Person {
//    String name ;
//    int age ;
//    public void get() {
//        System.out.println("姓名：" + name + "，年龄：" + age);
//    }
//}
//
//public class ClassDemo {
//    public static void main(String args[]) {
//        Person per = null;//声明对象
////        per = new Person() ;//实例化对象
//        per.name = "张三" ;//操作属性内容
//        per.age = 30 ;//操作属性内容
//        per.get() ;//调用类中的get()方法
//    }
//    /*
//    * 运行结果
//    * Exception in thread "main" java.lang.NullPointerException
//	    at com.classandobj.ClassDemo.main(ClassDemo.java:19)
//    * */
//
//}

//public class ClassDemo {
//    public static void main(String args[]) {
//        Person per = new Person() ;// 声明并实例化对象
//        per.name = "张三" ;//操作属性内容
//        per.age = 30 ;//操作属性内容
//        per.get() ;//调用类中的get()方法
//    }
//    /*
//    * 运行结果
//    * 姓名：张三，年龄：30
//    * */
//}


//class Book {
//
//    private String title;
//    private double price;
//
//    public Book(String title, double price) {
//        this.title = title;
//        this.price = price;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void getInfo() {
//        System.out.println("图书的名称：" + title + " 图书的价格：" + price);
//    }
//}
//
//public class ClassDemo {
//    public static void main(String args[]) {
//        Book book = new Book("Java开发", 89.9);//设置属性的初始化内容
//        book.getInfo();
//        /*
//        * 运行结果
//        * 图书的名称：Java开发 图书的价格：89.9
//        * */
//    }
//}

//class Book {
//    //    private String title;
//    //    private double price;
//    private String title = "Android开发";
//    private double price = 199.9;
//
//    public Book() {
//        System.out.println("无参的构造方法");
//    }
//
//
//    public Book(String title) {
//        this.title = title;
//        System.out.println("有一个参数的构造方法");
//    }
//
//
//    public Book(String title, double price) {
//        this.title = title;
//        this.price = price;
//        System.out.println("有俩个参数的构造方法");
//    }
//
//    public void getInfo() {
//        System.out.println("图书的名称：" + title + " 图书的价格：" + price);
//    }
//}

//public class ClassDemo {
//    public static void main(String args[]) {
//        Book book1 = new Book();
//        book1.getInfo();
//
//        Book book2 = new Book("Java开发");
//        book2.getInfo();
//
//        Book book3 = new Book("Java开发", 89.9);
//        book3.getInfo();
//
//    }
//    /**
//     * 运行结果
//     * 无参的构造方法
//     * 图书的名称：Android开发 图书的价格：199.9
//     * 有一个参数的构造方法
//     * 图书的名称：Java开发 图书的价格：199.9
//     * 有俩个参数的构造方法
//     * 图书的名称：Java开发 图书的价格：89.9
//     */
//}
public class ClassDemo {
    public static void main(String[] args) {
        int value_int = 1;
        System.out.println(getType(value_int));
        char value_char = Integer.toString(value_int).charAt(0);
        System.out.println(getType(value_char));
    }
    public static String getType(Object o){
        return o.getClass().toString(); //使用int类型的getClass()方法
    }

}
