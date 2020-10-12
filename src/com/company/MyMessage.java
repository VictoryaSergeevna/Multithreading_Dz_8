package com.company;

public class MyMessage {
//    public int count = 0;
//
//    public MyMessage(int count) {
//        this.count = count;
//    }
//    synchronized void useMessage(int count) throws InterruptedException {
//        while (!Thread.currentThread().isInterrupted()) {
//            if ((count % 5 == 0) && (count / 5 > 0)) {
//                System.out.println("Test message!");
//                System.out.println(count++);
//                MyTimer.IsStartStop = true;
//                this.notify();
//            }
//            this.wait();
//
//        }
//    }
//    @Override
//    public void run() {
//        try {
//            useMessage(count);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
volatile static int count = 0;

    synchronized static void sendMessage(String s){
        System.out.println(s);
    }
    }
