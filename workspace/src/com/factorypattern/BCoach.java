package com.factorypattern;

/**
 * @author flywu
 * @date 2023/1/13 17:12
 */
class BCoach implements Coach {
    @Override
    public void command() {
        System.out.println("我是B级证书教练");
    }
}
