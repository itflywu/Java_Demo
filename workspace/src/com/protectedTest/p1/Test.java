package com.protectedTest.p1;

/**
 * @author flywu
 * @date 2022/11/2 15:47
 */
public class Test {
    }

    class MyObject extends Test {
        public static void main(String[] args) {
            Test test = new Test();
//            test.clone(); // Compile Error   ----- (1)
        }
    }

