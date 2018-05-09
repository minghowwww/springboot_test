package com.nio.boottest.controller;

import com.nio.boottest.service.NioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class NioController {
    @Autowired
    private NioService nioService;

    @ResponseBody
    @GetMapping("/nio/get")
    public ArrayList<String> controller1(){
        return nioService.service1();
    }

    @ResponseBody
    @GetMapping("/nio/get2")
    public ArrayList<String> controller2(){
        return nioService.service2();
    }
}
