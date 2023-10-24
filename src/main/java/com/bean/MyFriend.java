package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyFriend {
    @Autowired
    @Qualifier("shoes")
    private Outfit outfit;
    public MyFriend(){}

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public void showOutfit(){
        this.outfit.wear();
    }
}
