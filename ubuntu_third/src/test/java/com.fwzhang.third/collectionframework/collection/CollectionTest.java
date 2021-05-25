package com.fwzhang.third.collectionframework.collection;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

    @Test
    public void foreachTest() {
        List<String> stringList = new ArrayList<>();
        stringList.forEach(System.out::println);
    }

}
