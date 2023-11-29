
package Bai1;

import java.util.ArrayList;
import java.util.Scanner;


public class ClassRoom {
    static ArrayList<Student> li = new ArrayList<>();
    
    public static void inputList(){
        while(true){
        Student x = new Student();
        System.out.println("");
        x.input();
        if(x.getId() == 555)
            break;
        if(!checkStudent(x.getId()))
            li.add(x);
        else
            System.out.println("Sinh viên đã tồn tại");
        }
    } 
    public static boolean checkStudent(int check){
        if(li != null)
            for (Student x: li){
                if(x.getId() == check)
                    return true;
            }
        return false;
    }
    public static void output(){
        System.out.println("\n=====================DANH SÁCH SINH VIÊN==================");
        Student.title();
        for(Student x: li)
            x.output();
    }
    public static void sortByGpa(){
        for(int i= 0; i < li.size() -1; i++)
            for(int j= i+1; j < li.size(); j++){
                if(li.get(i).getGpa() > li.get(j).getGpa()){
                    Student tmp = li.get(i);
                    li.set(i, li.get(j));
                    li.set(j, tmp);
                }
            }
                
    }
    public static boolean xoa(int id){
        for (Student x: li){
            if(x.getId() == id){
                li.remove(x);
                return true;
            }
        }
       return false;
    }
    public static void main(String[] args) {
        int chon =0;
        do{
            System.out.println("<======Menu======>");
            System.out.println("1.Nhập thông tin sinh viên");
            System.out.println("2.In ra thông tin các sinh viên ");
            System.out.println("3. sắp xếp danh sách các sinh viên theo dạng bảng");
            System.out.println("4. xóa sinh viên theo id");
            System.out.println("5. thoát");
            System.out.println("chon = ");
            chon = (new Scanner(System.in).nextInt());
            switch (chon){
                case 1:
                    inputList();
                    break;
                case 2: 
                    output();
                    break;
                case 3:
                    sortByGpa();
                    break;
                case 4:
                    System.out.println("nhập id cần xóa: ");
                    int id = (new Scanner(System.in).nextInt());
                    if(xoa(id))
                        System.out.println("xóa thành công !");
                    else
                        System.out.println("Không tồn tại id trên !");
                    break;
                case 5:
                    System.out.println("Thoat");
                    break;
            }
        }while(chon != 5);
    }
}
   