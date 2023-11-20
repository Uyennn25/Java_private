
package btvn_buoi4;

import java.util.Scanner;


public class TacGia {
    private String tenTacGia;
    private int namSinh;

    public TacGia() {
    }

    public TacGia(String tenTacGia, int namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten tac gia: " );
        tenTacGia = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = sc.nextInt();
    }
    public void output(){
        System.out.printf("%-15s %-15d%n", tenTacGia, namSinh );
    }
}
