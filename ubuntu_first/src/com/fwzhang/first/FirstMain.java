package com.fwzhang.first;

import java.util.Arrays;
import java.util.List;

public class FirstMain {

    public static void main(String[] args) {
        System.out.println("ubuntu first start");
        List<String> nameList = Arrays.asList("张三", "李四", "王五");
        nameList.parallelStream().forEach(System.out::println);
        nameList.parallelStream().map(data -> data.substring(1)).forEach(System.out::println);
    }
}
