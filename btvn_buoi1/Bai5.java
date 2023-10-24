
package btvn_buoi1;

import java.util.Scanner;
import java.util.Arrays;


public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = 5;
         int[] arr = new int [n];
        for(int i =0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
    
}
