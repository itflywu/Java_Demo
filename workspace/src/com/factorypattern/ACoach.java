package com.factorypattern;

/**
 * @author flywu
 * @date 2023/1/13 17:01
 */
// A级教练
class ACoach implements Coach{
    @Override
    public void command() {
        System.out.println("我是A级证书教练");
    }
}
