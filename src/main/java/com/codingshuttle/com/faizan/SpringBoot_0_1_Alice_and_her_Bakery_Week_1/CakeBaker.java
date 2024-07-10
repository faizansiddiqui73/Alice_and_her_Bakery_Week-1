package com.codingshuttle.com.faizan.SpringBoot_0_1_Alice_and_her_Bakery_Week_1;

import org.springframework.stereotype.Service;

import java.lang.reflect.Constructor;

@Service
public class CakeBaker {

    //Constructor Injection
    private Frosting frosting;
    private Syrup syrup;

    public CakeBaker(Frosting frosting,Syrup syrup){
        this.frosting=frosting;
        this.syrup=syrup;
    }
    public String bakeCake(){
        return "Baking a cake with "+ frosting.getFrostingType() +"and "+syrup.getSyrupType();
    }
}
