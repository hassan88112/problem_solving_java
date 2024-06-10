package com.hassan.ProblemSolvingJava;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

        String x = "hello";
        String y = "olhel";
        char[] xx =x.toCharArray();
        char[] yy =y.toCharArray();
        Arrays.sort(xx);
        Arrays.sort(yy);

        if (Arrays.equals(xx, yy)){
            System.out.println("Anagrams");
        }else {
            System.out.println("Not Anagrams");
        }


    }
}
