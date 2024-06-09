package com.hassan.ProblemSolvingJava;

import javax.swing.*;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String x ="hsh";
        String reverse="";

        for (int i = x.length() -1 ; i >= 0 ; i-- ) {
            reverse=reverse + x.charAt(i);
        }
        System.out.println(reverse);
        if (x.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("NOT Palindrome");
        }



    }
}
