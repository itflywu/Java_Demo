package com.javatpoint;

import com.java.A;

/**
 * @author flywu
 * @date 2022/11/2 10:49
 */
public class PublicExample {
    public static void main(String[] args) {
        A a = new A();  // 直接实例 com.java 包中的 A 类
        a.display();    // 直接调用 A 类中的 display 方法
    }
}
