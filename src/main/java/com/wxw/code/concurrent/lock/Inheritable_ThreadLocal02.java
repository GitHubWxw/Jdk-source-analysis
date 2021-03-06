package com.wxw.code.concurrent.lock;

/**
 * ThreadLocal 不支持继承性
 * 但是它的子类 inheritableThreadLocals
 * @Author: com.wxw.wxw
 * @create: 2020-07-18-15:47
 */
public class Inheritable_ThreadLocal02 {

    // 创建线程变量
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();  // 不支持继承
    private static InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>(); // 通过重写父类方法实现继承

    public static void main(String[] args) {
        // main线程设置变量
        threadLocal.set("Hello World");
        inheritableThreadLocal.set("Hello World");
        //启动子线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 子线程输出线程变量的值
                System.out.println("thread1: = " + threadLocal.get());
                System.out.println("thread2 支持继承: = " + inheritableThreadLocal.get());
            }
        });

        thread.start();

        // 主线程输出线程变量值
        System.out.println("main1(): = " + threadLocal.get());
        System.out.println("main2() 支持继承: = " + inheritableThreadLocal.get());
    }
}
