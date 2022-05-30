package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//        LinkedList
        MyLinkedList<Integer> testList = new MyLinkedList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.printAll();
        System.out.println("\n\n\n");

        testList.remove(1);
        testList.printAll();
        System.out.println("\n\n\n");

        testList.add(4);
        testList.add(5);
        testList.add(6);
        testList.add(7);
        testList.remove(3);
        testList.printAll();
        System.out.println("\n\n\n");

        testList.removeTail();
        testList.printAll();
        System.out.println("\n\n\n");

        testList.removeHead();
        testList.printAll();
        System.out.println("\n\n\n");

        testList.setHead(12);
        testList.setTail(9);
        testList.printAll();


        MyLinkedList<String> testList2 = new MyLinkedList<>();
        testList2.setHead("Hello");
        testList2.printAll();
        testList2.setTail("World");
        testList2.printAll();
    }
}

