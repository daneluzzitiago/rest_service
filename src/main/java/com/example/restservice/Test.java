package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

public class Test {
    public static void main(String[] args) {
        String onion = "Cebola %s";
        String kind = "frita";
        System.out.println(String.format(onion, kind));

        AtomicLong atom = new AtomicLong(1);
        System.out.println(atom.getAndIncrement());
        System.out.println(atom.getAndDecrement());
        System.out.println(atom.getAndDecrement());
        System.out.println(atom.getAndDecrement());
    }
}
