package com.lambda;

/**
 * @author flywu
 * @date 2022/11/8 17:07
 */
interface myInter{              //函数接口
    double compute(double x, double y);     //唯一的抽象方法
}

class myInple1 implements myInter{
    public double compute(double x,double y){//抽象方法的第1种实现
        return x+y;
    }
}

class myInple2 implements myInter{
    public double compute(double x,double y){//抽象方法的第2种实现
        return x-y;
    }
}

class myInple3 implements myInter{
    public double compute(double x,double y){//抽象方法的第3种实现
        return x*y;
    }
}

class myInple4 implements myInter{
    public double compute(double x,double y){//抽象方法的第4种实现
        return x/y;
    }
}

public class nolambdaTest {
    public static void main(String[] args){
        myInple1 add = new myInple1();
        System.out.println("90.0和5.0两个数求和，结果为："+add.compute(90.0,5.0));

        myInple2 sub = new myInple2();
        System.out.println("90.0和5.0两个数求差，结果为："+sub.compute(90.0,5.0));

        myInple3 mul = new myInple3();
        System.out.println("90.0和5.0两个数求积，结果为："+mul.compute(90.0,5.0));

        myInple4 div = new myInple4();
        System.out.println("90.0和5.0两个数求商，结果为："+div.compute(90.0,5.0));
    }
}
