package com.classandobj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author flywu
 * @date 2023/1/4 17:26
 */
public class TestPatternMatch {
    /**
     * 使用预编译功能，提高效率
     */
    private static Pattern twopart = Pattern.compile("(.+)\\.(.+)");

    public static void main(String[] args) {
        checkString("沉默王二.一枚有趣的程序员");
        checkString("沉默王二.");
        checkString(".一枚有趣的程序员");
    }

    private static void checkString(String str) {
        Matcher m = twopart.matcher(str);
        if (m.matches()) {
            System.out.println("第一部分：" + m.group(1) + " 第二部分：" + m.group(2));
        } else {
            System.out.println("不匹配");
        }
    }
}

