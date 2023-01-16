package com;//package com;

import java.sql.Date;

/**
 * @author flywu
 * @date 2022/10/19 16:45
 */
public class StaticTest {
    private static String name = "李四";
    private String address = "中国";

    public StaticTest() {
    }

    public void test1() {
        System.out.println(name);
        System.out.println(address);
        test2();
    }

    public static void test2() {
        System.out.println(name);
//        System.out.println(address);  //静态方法test2()中调用非静态成员变量address，编译失败。这是因为，在编译期并没有对象生成，address变量根本就不存在。
//        test1();  //静态方法test2()中调用非静态方法test1()，编译失败。这是因为，编译器无法预知在非静态成员方法test1()中是否访问了非静态成员变量，所以也禁止在静态方法中调用非静态成员方法
    }
}

//class Person {
//    private Date birthDate;
//
//    public Person(Date birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    boolean isBornBoomer() {
//        Date startDate = Date.valueOf("1946");
//        Date endDate = Date.valueOf("1964");
//        return birthDate.compareTo(startDate) >= 0 && birthDate.compareTo(endDate) < 0;
//    }
//}

//class Person {
//
//    public String name = "李四";
//
//    private static String address = "中国";
//}
//
//class PersonTest{
//    public static void main(String[] args){
//        Person person = new Person();
//        System.out.println(person.name);
//        System.out.println(person.address);
//    }
//
//}
//class Main {
//    static int value = 33;
//
//    public static void main(String[] args) throws Exception {
//        new Main().printValue();
//    }
//
//    private void printValue() {
//        int value = 3;
//        System.out.println(this.value);
//    }
//}

//class Test extends Base {
//
//    static {
//        System.out.println("test static");
//    }
//
//    public Test() {
//        System.out.println("test constructor");
//    }
//
//    public static void main(String[] args) {
//        new Test();
//    }
//}
//
//class Base {
//
//    static {
//        System.out.println("base static");
//    }
//
//    public Base() {
//        System.out.println("base constructor");
//    }
//}
//class Test {
//    Person person = new Person("Test");
//
//    static {
//        System.out.println("test static");
//    }
//
//    public Test() {
//        System.out.println("test constructor");
//    }
//
//    public static void main(String[] args) {
//        new MyClass();
//    }
//}
//
//class Person {
//    static {
//        System.out.println("person static");
//    }
//
//    public Person(String str) {
//        System.out.println("person " + str);
//    }
//}
//
//
//class MyClass extends Test {
//    Person person = new Person("MyClass");
//
//    static {
//        System.out.println("myclass static");
//    }
//
//    public MyClass() {
//        System.out.println("myclass constructor");
//    }
//}

class Test {

    static {
        System.out.println("test static 1");
    }

    public static void main(String[] args) {

    }

    static {
        System.out.println("test static 2");
    }
}
class StaticCode {
    public static int count = 0;
    {
        count++;
        System.out.println("非静态代码块 count=" + count);
    }
    static {
        count++;
        System.out.println("静态代码块1 count=" + count);
    }
    static {
        count++;
        System.out.println("静态代码块2 count=" + count);
    }

    public static void main(String[] args) {
        System.out.println("*************** StaticCode1 执行 ***************");
        StaticCode sct1 = new StaticCode();
        System.out.println("*************** StaticCode2 执行 ***************");
        StaticCode sct2 = new StaticCode();
    }
}