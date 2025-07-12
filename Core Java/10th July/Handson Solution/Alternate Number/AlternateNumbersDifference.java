package com.hcl.bon;
import java.util.Scanner;

public class AlternateNumbersDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        
        if (n < 5 || n > 10) {
            System.out.println("Invalid array size");
            return;
        }
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxDiff = -1;
        int indexOfSmallest = -1;
        
        for (int i = 0; i < n - 2; i++) {
            int diff = Math.abs(arr[i] - arr[i + 2]);
            if (diff > maxDiff) {
                maxDiff = diff;
                if (arr[i] < arr[i + 2]) {
                    indexOfSmallest = i;
                } else {
                    indexOfSmallest = i + 2;
                }
            }
        }
        
        System.out.println(indexOfSmallest);
    }
}
