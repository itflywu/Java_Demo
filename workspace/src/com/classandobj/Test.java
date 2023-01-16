package com.classandobj;

import java.util.regex.Pattern;

/**
 * @author flywu
 * @date 2023/1/4 17:27
 */
public class Test {
    public static void main(String[] args) {
        String cmower = "沉默王二，一枚有趣的程序员，宠爱他";
        if (cmower.contains("，")) {
            String [] parts = cmower.split("，", 2);
            System.out.println("第一部分：" + parts[0] +" 第二部分：" + parts[1]);
        }

    }
}
