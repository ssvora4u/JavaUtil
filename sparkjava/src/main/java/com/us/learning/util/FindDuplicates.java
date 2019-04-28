package com.us.learning.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class FindDuplicates {
    public static ArrayList<Integer> getIntegers() {
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        System.out.println(numbersList);
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList);
        return new ArrayList<>(hashSet);
    }
}
