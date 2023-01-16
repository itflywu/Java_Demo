package com.one;

/**
 * @author flywu
 * @date 2022/11/2 11:23
 */
public class Alpha {
    public void test()

    {

        this.pub();

        this.pro();

        this.def();

        this.pri();

    }


    public void pub()

    {

        System.out.println( "public");

    }


    protected void pro()

    {

        System.out.println( "protected");

    }


    void def()

    {

        System.out.println( "default");

    }


    private void pri()

    {

        System.out.println( "private");

    }
}

class test {
    public static void main(String[] args) {

        new Alpha().test();

    }
}
