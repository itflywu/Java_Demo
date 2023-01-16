package com.factorypattern;

/**
 * @author flywu
 * @date 2023/1/13 17:16
 */
class BCoachFactory implements CoachFactory{
    @Override
    public Coach createCoach() {
        return new BCoach();
    }
}
