package com.factorypattern;

/**
 * @author flywu
 * @date 2023/1/13 17:06
 */
// C级教练学院
class CCoachFactory implements CoachFactory {

    @Override
    public Coach createCoach() {
        return new CCoach();
    }

}

