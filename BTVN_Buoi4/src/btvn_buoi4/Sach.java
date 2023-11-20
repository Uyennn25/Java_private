

package btvn_buoi4;

import java.util.Scanner;

public class Sach {
    private static int ID = 1;
    private int id;
    private String tenSach;
    private int namXuatBan;
    private String theLoai;
    private TacGia x;
    
    public Sach() {
    }

    public Sach(int id, String tenSach, int namXuatBan, String theLoai, TacGia x) {
        this.id = ID++;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.x = x;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public TacGia getX() {
        return x;
    }

    public void setX(TacGia x) {
        this.x = x;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        namXuatBan = sc.nextInt();
        System.out.println("Nhap the loai sach: ");
        theLoai = sc.nextLine();
        x = new TacGia();
        x.input();
    }
   
    public void output(){
        System.out.printf("%-10d %-15s %-15d %-15%s ", id , tenSach , namXuatBan, theLoai );
        x.output();
    }
}
