package com.nio.boottest.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NioService {

    public ArrayList<String> service1 (){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello world");
        list.add("hello world");
        list.add("hello world");
        list.add("hello world");
        list.add("hello world");
        list.forEach((str) -> System.out.println(str));
        return list;
    }

    public ArrayList<String> service2 (){
        ArrayList<String> list = new ArrayList<>();
        list.add("666");
        list.add("888");
        list.forEach((str) -> System.out.println(str));
        return list;
    }
}
