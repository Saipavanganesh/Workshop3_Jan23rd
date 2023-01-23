package com.bridgelabz;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,2,6,7,33,45,32,45,89,102,117,8,10,11,18);
        List<Integer> stream = integerList.stream().filter(x -> x%2==0).collect(Collectors.toList());
        System.out.println(stream);
        stream.stream().sorted().forEach(n -> System.out.println(n));
    }
}
