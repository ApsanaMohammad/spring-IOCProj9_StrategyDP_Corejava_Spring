package com.nt.test;

import com.nt.comp.FlipKart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // Create ApplicationContext
        ApplicationContext context = new FileSystemXmlApplicationContext("src/com/nt/cfg/applicationContext.xml");
        
        //get target class object
        FlipKart fpkt=context.getBean("f",FlipKart.class);
        String res=fpkt.shopping(new String[] {"shirt", "jeans","watch"},new float[] {4000,5000,2000});
        System.out.println(res);
        ((AbstractApplicationContext) context).close();
    }
}
