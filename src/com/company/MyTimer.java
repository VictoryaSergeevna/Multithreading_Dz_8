package com.company;

public class MyTimer implements Runnable {

    private final int period;
    private Thread t = new Thread(this);

    MyTimer(int period) {
        this.period = period;
        t.start();
    }

    @Override
    public void run() {
        try {
            while (true){
                Thread.sleep(period * 1000);
                synchronized (MyMessage.class) {
                    MyMessage.sendMessage(Integer.toString(++MyMessage.count));
                    MyMessage.class.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

