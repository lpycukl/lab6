package com.company;

class В {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод B.bar()");

        try {
            Thread.sleep(1000);
        } catch (Exception е) {
            System.out.println("Клacc В прерван");
        }
        System.out.println(name + " пытается вызвать метод A. last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("B методе A.last ( ) ");
    }
}

