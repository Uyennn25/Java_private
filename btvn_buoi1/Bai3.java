
package btvn_buoi1;

import java.util.Scanner;

public class Bai3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
       do{
         n = sc.nextInt();
       }while(n<=0);
       int tich = 1;
       while(n > 0){
           int digit = n % 10;
           tich *= digit;
           n /= 10;
       }
        System.out.println(tich);
    }
    
}
