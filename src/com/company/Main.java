package com.company;

public class Main {

    public static void main(String[] args)  {

        new MyTimer(1);
        new MyWaiter(5, "Поток #1!");
        new MyWaiter(7, "Поток #2!");

    }
}
