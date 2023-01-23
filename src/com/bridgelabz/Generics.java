package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Generics<T> {
    T a1,a2,a3;
    Generics(T a1, T a2, T a3 ){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
    public static <T> void addinArray(T a1, T a2, T a3){
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(a3);
        System.out.println(arrayList);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //For integer elements
        System.out.println("Enter integer elements you want to add");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        Generics genericsInt = new Generics(a1,a2,a3);
        addinArray(a1,a2,a3);
        //For String elements
        System.out.println("Enter String elements you want to add");
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        Generics genericsString = new Generics(s1,s2,s3);
        addinArray(s1,s2,s3);
    }
}
