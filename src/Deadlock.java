package com.company;



class Deadlock implements Runnable {
    A a = new A();
    В b = new В();

    Deadlock() {
        Thread.currentThread().setName("Глaвный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();

        a.foo(b); // получить блокировку для объекта а
                    // в этом потоке исполнения
        System.out.println("Haзaд в главный поток");
    }

    public void run() {
        b.bar(a); // получить блокировку для объекта b
                    // в другом потоке исполнения
        System.out.println("Haзaд в другой поток");
    }

    public static void main(String args[]) {
        new Deadlock();
    }
}



