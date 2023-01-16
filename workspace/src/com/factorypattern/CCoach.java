package com.factorypattern;

/**
 * @author flywu
 * @date 2023/1/13 17:05
 */
// C级教练
class CCoach implements Coach {

    @Override
    public void command() {
        System.out.println("我是C级证书教练");
    }

}
