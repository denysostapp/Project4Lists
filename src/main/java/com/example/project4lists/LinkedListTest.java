package com.example.project4lists;

import javafx.application.Application;
import javafx.stage.Stage;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Test add operation
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("After adding elements: " + list.toString());

        // Test add at index operation
        list.add(7, 77);
        System.out.println("After adding 77 at index 7: " + list.toString());

        // Test get operation
        System.out.println("Element at index 7: " + list.get(7));


        // Test remove at index operation
        list.remove(1);
        System.out.println("After removing element at index 1: " + list.toString());

        // Test addFirst operation
        list.addFirst(211);
        System.out.println("After adding 211 at the beginning: " + list.toString());

        // Test getSize operation
        System.out.println("Size of list: " + list.getSize());

        // Test removeAll operation
        list.removeAll(2);
        System.out.println("After removing all occurrences of 2: " + list.toString());
    }
}
