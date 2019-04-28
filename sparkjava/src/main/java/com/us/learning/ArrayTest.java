package com.us.learning;

import java.util.ArrayList;

import static com.us.learning.util.FindDuplicates.getIntegers;


public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("application Started");

        // ArrayList with duplicate elements
        ArrayList<Integer> listWithoutDuplicates = getIntegers();
        System.out.println(listWithoutDuplicates);
    }



}
