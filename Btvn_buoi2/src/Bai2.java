
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[100005];
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        System.out.print("Nhập mảng: ");
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = a[i - 1] + sc.nextLong();
        }
        System.out.print("Nhập số lượng truy vấn: ");
        int q = sc.nextInt();
        int x, y;
        while (q > 0) {
            q--;
            System.out.print("Nhập truy vấn(l, r): ");
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println("Tổng các phần tử từ " + x + " đến " + y + ": " + (a[y] - a[x - 1]));
        }
    }
}
