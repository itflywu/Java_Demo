package com;

import java.util.concurrent.TimeUnit;

/**
 * @author flywu
 * @date 2022/10/31 11:36
 */
//public class VolatileTest {
//    public static void main(String[] args) {
//        MyData myData = new MyData();
//
//        // 启动一个线程修改myData的number，将number的值加10
//        new Thread(
//                () -> {
//                    System.out.println("线程" + Thread.currentThread().getName() + "\t 正在执行");
//                    try {
//                        TimeUnit.SECONDS.sleep(3);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                    myData.add10();
//                    System.out.println("线程" + Thread.currentThread().getName() + "\t 更新后，number的值为" + myData.number);
//                }
//        ).start();
//
//        // 看一下主线程能否保持可见性
//        while (myData.number == 0) {
//            // 当上面的线程将number加10后，如果有可见性的话，那么就会跳出循环；
//            // 如果没有可见性的话，就会一直在循环里执行
//        }
//
//        System.out.println("具有可见性！");
//    }
//}
//

import java.util.concurrent.atomic.AtomicInteger;

class MyData {
    volatile int number = 0;

    volatile AtomicInteger num = new AtomicInteger();

    public void add() {
        // 在n++上面可能还有n行代码进行逻辑处理
        number++;
        num.getAndIncrement();
    }
}

public class VolatileTest {
    public static void main(String[] args) {
        MyData myData = new MyData();

        // 启动20个线程，每个线程将myData的number值加1000次，那么理论上number值最终是20000
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    myData.add();
                }
            }).start();
        }

        // 程序运行时，模型会有主线程和守护线程。如果超过２个，那就说明上面的２０个线程还有没执行完的，就需要等待
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }

        System.out.println("number值加了20000次，此时number的实际值是：" + myData.number);
        System.out.println("num值加了20000次，此时number的实际值是：" + myData.num);

    }
}

//class SingletonDemo {
//    private static SingletonDemo instance = null;
//
//    private SingletonDemo() {
//        System.out.println(Thread.currentThread().getName() + "\t 执行构造方法SingletonDemo()");
//    }
//
//    public static SingletonDemo getInstance() {
//        if (instance == null) {
//            instance = new SingletonDemo();
//        }
//        return instance;
//    }
//
//    public static void main(String[] args) {
//        // 单线程测试
//        System.out.println("单线程的情况测试开始");
//        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
//        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
//        System.out.println("单线程的情况测试结束\n");
//    }
//}

//class SingletonDemo {
//    private static SingletonDemo instance = null;
//
//    private SingletonDemo() {
//        System.out.println(Thread.currentThread().getName() + "\t 执行构造方法SingletonDemo()");
//    }
//
//    public static SingletonDemo getInstance() {
//        if (instance == null) {
//            instance = new SingletonDemo();
//        }
//
//        // DCL(Double Check Lock双端检索机制)
////        if (instance == null) {
////            synchronized (SingletonDemo.class) {
////                if (instance == null) {
////                    instance = new SingletonDemo();
////                }
////            }
////        }
//        return instance;
//    }
//
//    public static void main(String[] args) {
//        // 单线程测试
////        System.out.println("单线程的情况测试开始");
////        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
////        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
////        System.out.println("单线程的情况测试结束\n");
//
//        // 多线程测试
//        System.out.println("多线程的情况测试开始");
//        for (int i=1; i<=10; i++) {
//            new Thread(() -> {
//                SingletonDemo.getInstance();
//            }, String.valueOf(i)).start();
//        }
//    }
//}
//class SingletonDemo {
//    private static SingletonDemo instance = null;
//
//    private SingletonDemo() {
//        System.out.println(Thread.currentThread().getName() + "\t 执行构造方法SingletonDemo()");
//    }
//
//    public static SingletonDemo getInstance() {
////        if (instance == null) {
////            instance = new SingletonDemo();
////        }
//
//        // DCL(Double Check Lock双端检锁机制)
//        if (instance == null) {  // a行
//            synchronized (SingletonDemo.class) {
//                if (instance == null) {  // b行
//                    instance = new SingletonDemo();  // c行
//                }
//            }
//        }
//        return instance;
//    }
//
//    public static void main(String[] args) {
//        // 单线程测试
////        System.out.println("单线程的情况测试开始");
////        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
////        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
////        System.out.println("单线程的情况测试结束\n");
//
//        // 多线程测试
//        System.out.println("多线程的情况测试开始");
//        for (int i=1; i<=10; i++) {
//            new Thread(() -> {
//                SingletonDemo.getInstance();
//            }, String.valueOf(i)).start();
//        }
//    }
//}
// class volatileDemo1 {
//    static volatile boolean flag = true;
//
//    public static void main(String[] args) {
//        new Thread(()->{
//            System.out.println(Thread.currentThread().getName()+"\t -----come in");
//            try {
//                TimeUnit.SECONDS.sleep(2);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            flag = false;
//        },"t1").start();
//
//        new Thread(()->{
//            System.out.println(Thread.currentThread().getName()+"\t -----come in");
//            while (flag) {
//
//            }
//            System.out.println(Thread.currentThread().getName()+"\t -----flag被设置为false，程序停止");
//        },"t2").start();
//    }
//}

class volatileDemo1 {
    static boolean flag = true;

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t -----come in");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = false;
        }, "t1").start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t -----come in");
            while (flag) {

            }
            System.out.println(Thread.currentThread().getName() + "\t -----flag被设置为false，程序停止");
        }, "t2").start();
    }
}

class MyNumber {
    int number;

    public synchronized void addPlusPlus() {
        number++;
    }
}

class volatileDemo2 {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int i1 = 0; i1 < 1000; i1++) {
                    myNumber.addPlusPlus();
                }
            }).start();
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(myNumber.number);
    }
}

class volatileDemo3 {
    int i = 0;
    volatile boolean flag = false;

    public void write() {
        if (flag) {
            System.out.println("---i=" + i);
        }
    }
}

