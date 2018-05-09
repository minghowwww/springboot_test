package com.nio.boottest;

import com.nio.boottest.service.NioService;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootTestApplication.class)
@Slf4j
public class NioServiceTest {

    @Autowired
    private NioService nioService;

    @Before
    public void setup(){

    }

    @After
    public void cleanup(){

    }

    @Test
    public void testService(){
        ArrayList<String> list = nioService.service1();
        log.error("666");
        log.debug("元素:{}", list.get(0));
    }
}
