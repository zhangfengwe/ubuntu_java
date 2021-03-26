package com.fwzhang.second.composite.natived;

import java.util.List;

public abstract class AbstractIndustry {

    protected String industryName;
    protected String industryCode;
    protected List<AbstractIndustry> subIndustryList;

    public abstract void add(AbstractIndustry industry);

}
