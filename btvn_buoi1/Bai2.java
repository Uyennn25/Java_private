
package btvn_buoi1;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so tu nhien o he co so 10: ");
        int a=sc.nextInt();
        System.out.printf("Nhap he co so muon chuyen : ");
        int b=sc.nextInt();
        System.out.println("He co so sau khi chuyen : " + Integer.toUnsignedString(a,b));
    }
    
}
