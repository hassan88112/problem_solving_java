package com.hassan.ProblemSolvingJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharacter {

    public static void main(String[] args) {

        String str="speed";
        System.out.println( removeDuplicate(str));



    }

    public static String removeDuplicate(String str){

        Set<Character> set =new HashSet<>();
        StringBuffer sf=new StringBuffer();

        for(int i = 0;i < str.length();i++){
            Character cc=str.charAt(i);
            if (!set.contains(cc)){
                set.add(cc);
                sf.append(cc);
            }
        }
        return sf.toString();
    }
}
