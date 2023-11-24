
package btvn_buoi4;

import java.util.Scanner;

public class Main_bai1 {
    private static Sach[] danhSachSach = new Sach[1000];
     
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
        int chon;
        do{
            System.out.println("=======MENU=======");
            System.out.println("1. Nhap thong tin sach ");
            System.out.println("2. In thong tin sach ");
            System.out.println("3. Tim kiem sach theo ten ");
            System.out.println("4. Sap xep sach theo ten tac gia");
            System.out.println("5. Thoat chuong trinh");
            System.out.println("Nhap lua chon cua ban: ");
            
            chon = sc.nextInt();
            
            switch (chon){
                case 1: 
                    nhapThongTinSach();
                    break;
                case 2: 
                    inThongTinSach();
                    break;
                case 3: 
                    timKiemSachTheoTen();
                    break;
                case 4:
                    sapXepTheoTenTG();
                    break;
                case 5:
                    System.out.println("Chuong trinh ket thuc.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. vui long chon lai");
            }
        }while(chon != 5);
    }
    public static void nhapThongTinSach(){
        int n;
        
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach can theo vao: ");
        n = sc.nextInt();
       
        
        for(int i =0 ; i< n ; i++){
            System.out.println("Nhap tt sach thu " + (i+1) +": ");
            danhSachSach[i] = new Sach();
            danhSachSach[i].input();
        }
    }
    public static void inThongTinSach(){
        System.out.println("=====Danh sách sách=======");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s%n ", "id" , "ten Sach" , "nam Xuat Ban", "the Loai" ,"ten tac gia","nam sinh");
        for(int i = 0;i < 1;i++ )
            danhSachSach[i].output();
    }
    public static void timKiemSachTheoTen(){
        System.out.print("Nhap vao ten sach can tim: ");
        String tenCanTim = (new Scanner(System.in)).nextLine();

        boolean timThay = false;
        for (int i = 0; i <= danhSachSach.length; i++) {
            if (danhSachSach[i].getTenSach().contains(tenCanTim)) {
                danhSachSach[i].output();
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay quyen sach \"" + tenCanTim + "\"");
        }
    }
    public static void sapXepTheoTenTG(){
         for (int i = 0; i <= danhSachSach.length - 1; i++) {
            for (int j = i + 1; j  <= danhSachSach.length; j++) {
                if (danhSachSach[i].getX().getTenTacGia().compareToIgnoreCase(danhSachSach[j].getX().getTenTacGia()) > 0) {
                    Sach temp = danhSachSach[i];
                    danhSachSach[i] = danhSachSach[j];
                    danhSachSach[j] = temp;
                }
            }
        }

        System.out.println("Done!");
    }
   
}
