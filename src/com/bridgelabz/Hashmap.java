package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap {
    static HashMap<String, Integer> hashMap = new HashMap<>();

    public static void add(String key, int data) {
        hashMap.put(key, data);
    }

    public static void update(String key, int data) {
        if (hashMap.containsKey(key)) {
            hashMap.put(key, data);
        } else {
            System.out.println("Cannot update. Key doesnot exist");
        }
    }

    public static void delete(String key) {
        if (hashMap.containsKey(key)) {
            hashMap.remove(key);
        } else {
            System.out.println("Cannot delete. Key doesnot exist");
        }
    }

    public static void main(String[] args) {
        add("Sai", 1);
        add("Pavan", 2);
        System.out.println(hashMap);
        update("Sai", 2);
        System.out.println(hashMap);
        update("Ganesh", 2);
        delete("bridgelabz");
        delete("Sai");
        System.out.println(hashMap);

    }
}
