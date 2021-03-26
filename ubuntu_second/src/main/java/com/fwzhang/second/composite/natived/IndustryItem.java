package com.fwzhang.second.composite.natived;

import java.util.ArrayList;

public class IndustryItem extends AbstractIndustry {

    public IndustryItem(String name, String code) {
        this.industryName = name;
        this.industryCode = code;
        this.subIndustryList = new ArrayList<>();
    }

    @Override
    public void add(AbstractIndustry industry) {
        this.subIndustryList.add(industry);
    }


}
