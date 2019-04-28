package com.us.learning.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FindDuplicatesTest {

    @Test
    public void getIntegers() {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        ArrayList<Integer> actual = FindDuplicates.getIntegers();
        System.out.println(actual);
        System.out.println(arr);
        Assert.assertEquals(arr,actual);

    }
}