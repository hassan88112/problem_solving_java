package com.hassan.ProblemSolvingJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProblemSolvingJavaApplication {

	public static void main(String[] args) {
        SpringApplication.run(ProblemSolvingJavaApplication.class, args);
        System.out.println("started");
        int[] arr = {3, -3, 45, 2, -19, -7, 56, 45};
        int n = arr.length;
        getNegativeElementsLast(arr,n);
        for (int i : arr){
            System.out.println(i+" ");
        }

    }

    private static void getNegativeElementsLast(int[] arr,int n){
        int j = 0;
        int[] allElements = new int[n];

        for ( int i= 0 ;i < n ; i++){
            if (arr[i] >= 0){
                allElements[j++] = arr[i];
            }
        }
        if (j == n || j == 0){
            return;
        }

        for ( int i= 0 ;i < n ; i++){
            if (arr[i] < 0){
                allElements[j++] = arr[i];
            }
        }

        for ( int i= 0 ;i < allElements.length ; i++){
            arr[i] = allElements[i];
        }



    }

}
