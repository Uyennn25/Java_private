
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = new int[1000010];
        for (int i = 0; i <= 1000006; i++) {
            c[i] = 0;
        }
        int[] a = new int[10010];
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập mảng: ");
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            c[a[i]]++;
        }
        int ans = 0;
        int res = 0;
        for (int i = 1; i <= 1000006; i++) {
            if (ans < c[i]) {
                ans = c[i];
                res = i;
            }
        }
        System.out.println("số có số lần xuất hiện nhiều nhất và số lần xuất hiện của nó: " + res + " " + ans);
    }
}
