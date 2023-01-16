package com;

/**
 * @author flywu
 * @date 2022/11/2 10:39
 */
//public class PublicTest {
//      class A {
//        public void display() {
//            System.out.println("test public in a package");
//        }
//    }
//
//    class test1 {
//        public static void main(String[] args) {
//            A a = new A();
//            a.display();  // 直接调用 display 方法
//        }
//    }
//}
//class A {
//
//    public void msg() {
//        System.out.println("Try it");
//    }
//
//}
//
//
//class PublicExample extends A {
//
//    public void msg() {
//        System.out.println("Try to access the overridden method");
//    }
//
//    public static void main(String[] args) {
//        PublicExample p = new PublicExample();
//        p.msg();
//    }
//
//}

//class A {
//    public void a() {
//        System.out.println("a test public in multi-class");
//    }
//}
//
//class B {
//    public void b() {
//        System.out.println("b test public in multi-class");
//    }
//}
//
//class test {  // 主类
//    public static void main(String[] args) {  // 主方法
//        A classA = new A();
//        B classB = new B();
//        classA.a();
//        classB.b();
//    }
//}
    import com.one.Alpha;
class test {
    public static void main(String[] args)

    {

        new Alpha().test();

    }


}