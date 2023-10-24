package com.bean;

import org.springframework.stereotype.Component;

@Component("shoes")
public class Shoes implements Outfit{
    @Override
    public void wear() {
        System.out.println(5678);
    }
}
