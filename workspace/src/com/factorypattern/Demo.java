package com.factorypattern;

/**
 * @author flywu
 * @date 2023/1/13 16:58
 */
public class Demo {
    public static void create(CoachFactory factory) {
        factory.createCoach().command();
    }

    public static void main(String[] args) {
        // 对于一支球队来说，需要什么样的教练就去找什么样的学院
        // 学院会介绍球队对应水平的教练。
        create(new ACoachFactory());
        create(new CCoachFactory());
        create(new BCoachFactory());
    }
}
