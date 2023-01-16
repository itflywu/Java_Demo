package com;

/**
 * @author flywu
 * @date 2022/10/20 17:16
 */
//public class FinalTest {
//    //    private final int a;
////    private final int a = 5;
//    private final int a;
//
//    //    {
////        a = 5;
////    }
//    public FinalTest(int b) {
//        this.a = b;
//    }
//}
public class FinalTest<s> {
    public static void main(String[] args) {
//
//    }
//
//    public void test() {
//        //test方法中定义了一个被final修饰的局部变量，该变量的作用域是test方法体内
//        final int a;
//        System.out.println(a);
//    }
//    final int MAX = 5;
//    //被final修饰的变量，其值不能改变，只能被赋值一次
//    MAX = 6;

        final int[] s = {5, 6, 7};
        //引用数据类型变量的地址值不能被改变，但地址上存储的内容可以更改
        s[0] = 7;
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    class Test1 {
        //在父类中定义一个被final修饰的方法，这个方法不能被子类重写，但是可以被继承
        public final void test() {
        }
    }

    class Test2 extends Test1 {
//        public void test() {
            
//        }
    }
}
