package com.factorypattern;

/**
 * @author flywu
 * @date 2023/1/13 17:03
 */
// A级教练学院
class ACoachFactory implements CoachFactory {

    @Override
    public Coach createCoach() {
        return new ACoach();
    }

}
