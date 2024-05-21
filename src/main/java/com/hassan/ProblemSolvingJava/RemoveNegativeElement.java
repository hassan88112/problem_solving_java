package com.hassan.ProblemSolvingJava;

import java.util.ArrayList;
import java.util.List;

public class RemoveNegativeElement {



    public static void main(String[] args) {
        int[] arr = {3, -3, 45, 2, -19, -7, 56, 45};
        int n = arr.length;

        List<Integer> allNumbers=new ArrayList<>();
        List<Integer> negativeNumbers=new ArrayList<>();

        for (int i = 0 ;i < n; i++){
            if (arr[i] > 0){
                allNumbers.add(arr[i]);
            }else {
                negativeNumbers.add(arr[i]);
            }
        }
        allNumbers.addAll(negativeNumbers);
        System.out.println(allNumbers);
    }
}
