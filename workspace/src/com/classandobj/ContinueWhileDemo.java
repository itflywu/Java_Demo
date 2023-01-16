package com.classandobj;

/**
 * @author flywu
 * @date 2023/1/12 11:20
 */
public class ContinueWhileDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
