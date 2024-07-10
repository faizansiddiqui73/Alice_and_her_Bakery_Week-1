package com.codingshuttle.com.faizan.SpringBoot_0_1_Alice_and_her_Bakery_Week_1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting.type",havingValue = "choclate")
public class ChoclateFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Choclate Frosting";
    }
}
