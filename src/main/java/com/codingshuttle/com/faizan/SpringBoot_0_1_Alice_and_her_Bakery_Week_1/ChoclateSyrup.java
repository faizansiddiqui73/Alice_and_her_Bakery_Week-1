package com.codingshuttle.com.faizan.SpringBoot_0_1_Alice_and_her_Bakery_Week_1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.type",havingValue = "choclate")
public class ChoclateSyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "Choclate Syrup";
    }
}