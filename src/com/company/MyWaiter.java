package com.company;

public class MyWaiter  implements Runnable{
    private final int period;
    private String message;
    private Thread t = new Thread(this);

    MyWaiter(int period, String message){
        this.period = period;
        this.message = message;
        t.start();
    }

    @Override
    public void run() {
        try {
            while (true)
                synchronized (MyMessage.class) {
                    MyMessage.class.wait();
                    if (MyMessage.count % period == 0)
                        MyMessage.sendMessage(message);
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
