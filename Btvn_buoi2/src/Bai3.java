
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập xâu: ");
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int v = 0, y = 0, z = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = (int) c[i];
            if ((x >= 65 && x <= 90) || (x >= 97 && x <= 122)) {
                v++;
            } else if (x >= 48 && x <= 57) {
                y++;
            } else {
                z++;
            }
        }
        System.out.println("Số lượng chữ cái: " + v);
        System.out.println("Số lượng kí tự số: " + y);
        System.out.println("Số lượng kí tự đặc biệt: " + z);
    }
}
