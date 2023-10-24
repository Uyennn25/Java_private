
package btvn_buoi1;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        int b = sc.nextInt();
        
        switch (c){
            case '+':
                System.out.println("Tổng 2 số: " + (a+b));
                break;
            case '-':
                System.out.println("Hiệu 2 sô: " + (a-b));
                break;
            case '*':
                System.out.println("Tích 2 số : "+ (a*b));
                break;
            case '/':
                if(b == 0){
                    System.out.println("a khong chia duoc cho 0");
                }else{
                    System.out.println("Thương cua 2 số +: "+ (a*1/b));
                    
                }
                break;
        }
    }
    
}
