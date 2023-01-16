package com.privateTest;

/**
 * @author flywu
 * @date 2022/11/2 17:34
 */
public class Class001_Private {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("杨聪");
        //s.age = -18;
        s.setAge(28);

        s.show();
        System.out.println(s.getAge());
    }
}

class Student {
    private String name;
    private int age;

    //设置器 : 为age设置值
    public void setAge(int age) {
        if (age < 0 || age > 40) {
            System.out.println(age + "年龄不合法");
            return;
        }
        this.age = age;
    }

    //访问器 : 获取age的值
    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student() {
    }

    public void show() {
        System.out.println(name + "--->" + age);
    }
}
