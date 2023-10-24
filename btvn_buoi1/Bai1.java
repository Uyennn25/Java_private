package btvn_buoi1;

import java.util.Scanner;

public class Bai1 {

    public static int UcChungln1(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int UcChungln2(int a, int b) {
        if (b == 0) {
            return a;
        }
        return UcChungln2(b, a % b);
    }

    public static int Bcnn(int a, int b) {
        return a / UcChungln1(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so a = ");
        int a = sc.nextInt();
        System.out.printf("Nhap so b = ");
        int b = sc.nextInt();
        System.out.printf("Nhap so c = ");
        int c = sc.nextInt();
        int d = UcChungln1(a, b);
        int e = Bcnn(a, b);
        System.out.println("uoc chung nho nhat cua 3 so la " + Bcnn(c, e));
        System.out.println("uoc chung lon nhat cua 3 so la " + UcChungln1(c, d));

    }

}
