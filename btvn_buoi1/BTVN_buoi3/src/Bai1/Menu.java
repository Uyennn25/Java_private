package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        List<Vegetable> Vegevetables = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int chon;
        do {
            System.out.println("Menu quản lý rau củ.");
            System.out.println("1. Nhập 1 loại loại rau củ mới.");
            System.out.println("2. Hiển thị danh sách rau củ.");
            System.out.println("3. Sắp xếp rau củ.");
            System.out.println("4. Nhóm các rau củ.");
            System.out.println("5. Tìm kiếm rau củ.");
            System.out.println("6. Thoát menu.");

            System.out.println("chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập id cho loại rau: ");
                    String idMoi = sc.nextLine();

                    boolean idDaTonTai = false;
                    for (Vegetable raucu : Vegevetables) {
                        if (raucu.getId() == idMoi) {
                            idDaTonTai = true;
                            break;
                        }
                    }
                    if (idDaTonTai) {
                        System.out.println("ID này đã tồn tại. vui lòng chọn id khác.");
                    } else {
                        System.out.print("Nhập tên loại rau củ: ");
                        String newName = sc.nextLine();
                        System.out.print("Nhập đơn vị tính: ");
                        String newUnit = sc.nextLine();
                        System.out.print("Nhập số lượng đã bán: ");
                        int newQuatitySold = sc.nextInt();
                        System.out.print("Nhập phần trăm giảm giá: ");
                        int newSale = sc.nextInt();
                        System.out.print("Nhập giá gốc: ");
                        double newPrice = sc.nextDouble();
                        Vegetable rauCuMoi = new Vegetable(idMoi, newName, newUnit, newQuatitySold, newSale, newPrice);
                        Vegevetables.add(rauCuMoi);
                    }
                    break;
                case 2:
                    System.out.println("===========DANH SACH RAU CU===========");
                    //%S là đại diện cho chuỗi %f là cho số thực cái này là dòng tiêu đề nên cần là chuỗi hết
                    System.out.printf("%-12s %-30s %-10s %-15s %-10s %-15s %-15s%n", "ID", "Name", "Unit", "Quantity Sold", "Sale", "Price", "Revenue");
                    if (Vegevetables.size() > 0) {
                        for (Vegetable vegetable : Vegevetables) {
                            vegetable.display();
                            System.out.println("");
                        }
                    }
                    break;
                case 3:
                    Collections.sort(Vegevetables, new Comparator<Vegetable>() {
                        @Override
                        public int compare(Vegetable t, Vegetable t1) {
                            return Double.compare(t.getTotalRevenue(), t1.getTotalRevenue());
                            //Nếu phần tử trước lớn hơn phần tử sau thì sẽ trả về âm 1 và 2 đói tượng gần nhau tự động đổi chỗ cho nhau trong ds
                            //No được cài đặt sẵn nên nó sẽ tự đổi chỗ mà k cần đến mình động vào
                            //Nếu bằng nhau hoặc nhỏ hơn thì giữ nguyên vị trí
                            //Hàm này sẽ thực hiện cho đến khi nào mà không có 2 đối tượng nào gần nhau mà đối tượng trước nó lớn hơn đối tượng sau nó nữa
                        }

                    });
                    break;
                case 4:
                    Collections.sort(Vegevetables, Comparator.comparing(Vegetable::getUnit).thenComparing(Vegetable::getPrice));
                    break;
                case 5:
                    String keyword = sc.nextLine();
                    int dem = 0;
                    for (Vegetable vegetable : Vegevetables) {
                        if (vegetable.getName().contains(keyword)) {
                            dem++;
                            vegetable.display();
                        }
                    }
                    if (dem == 0) {
                        System.out.println("Khong tim thay rau do ạ!");
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (chon != 6);
    }

}
