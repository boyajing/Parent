package com.nantian.service;

import com.nantian.model.Demo;

/**
 * Created by nantian on 2017/8/16.
 */
public class DemoService {

    public Demo getDemo(){
        Demo demo=new Demo();
        demo.setName("demo1");
        demo.setPassword("123");
        return demo;
    }
}
