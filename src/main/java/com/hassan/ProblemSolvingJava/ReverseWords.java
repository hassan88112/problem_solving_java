package com.hassan.ProblemSolvingJava;

public class ReverseWords {


    public static void main(String[] args) {


        String x = "Welcome to Java World";

        String[] words = x.split(" ");  // split  sentence to word
        for (int i=words.length-1 ;i >= 0 ; i-- ) {
            System.out.print(" "+words[i]);
        }


    }
}
