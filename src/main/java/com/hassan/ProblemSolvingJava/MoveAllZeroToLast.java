package com.hassan.ProblemSolvingJava;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZeroToLast {

    public static void main(String[] args) {

        int[] arr = {3, 15, 0, 20, 0, 0, 56, 45 ,0 ,33};
        int n = arr.length;

        List<Integer> allNumbers= new ArrayList<>();
        List<Integer> zeroNumbers= new ArrayList<>();

        for (int i = 0 ;i < arr.length;i++){
            if (arr[i] == 0){
                zeroNumbers.add(arr[i]);
            }else {
                allNumbers.add(arr[i]);
            }
        }
        allNumbers.addAll(zeroNumbers);
        System.out.println(allNumbers);
    }
}
