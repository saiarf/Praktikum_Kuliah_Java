package com.tutorial;
import java.util.*;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> stringQueue;
        stringQueue = new PriorityQueue<String>();
        stringQueue.add("Arif");
        stringQueue.add("Banu");
        stringQueue.add("Cindy");
        stringQueue.add("Doni");

        while (stringQueue.size() > 0) {
            System.out.println(stringQueue.remove());
        }
    }
}