package com.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dress")
@Scope("singleton")
public class Dress implements Outfit {
    @Override
    public void wear() {
        System.out.println(1234);
    }
}
