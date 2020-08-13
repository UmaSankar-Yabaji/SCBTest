package com.scb.ratelimit.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.scb.ratelimit.RatelimitDemoApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RatelimitDemoApplication.class)
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
