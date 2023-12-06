
package buoi7_btvn;
import java.util.*;

public class Buoi7_BTVN {

    
    static List<Student> stuList = new ArrayList<>();
    static List<Course> courseList = new ArrayList<>();

    static {
        stuList.add(new Student(18, 1, courseList, "Jude Bellingham"));
        stuList.add(new Student(19, 2, courseList, "Kylian Mbappe"));
        stuList.add(new Student(20, 3, courseList, "Pedri Golcaves"));
        stuList.add(new Student(21, 4, courseList, "Gavi"));
        stuList.add(new Student(19, 2, courseList, "Balde"));
        courseList.add(new Course("IT01","Toan",stuList));
        courseList.add(new Course("IT02","Ly",stuList));
        courseList.add(new Course("IT03","Hoa",stuList));
        courseList.add(new Course("IT04","Sinh",stuList));
        courseList.add(new Course("IT05","Su",stuList));
        courseList.add(new Course("IT06","Dia",stuList));
        courseList.add(new Course("IT07","Hoa",stuList));
        courseList.add(new Course("IT08","GDCD",stuList));
        courseList.add(new Course("IT09","QPAN",stuList));
        courseList.add(new Course("IT10","KTCT",stuList));
    }

    static University uni = new University(stuList, courseList);

    static Scanner s = new Scanner(System.in);

    static void getStudents() {
        for (int i = 0; i < stuList.size(); i++) {
            System.out.printf("%-5s %-25s %-25s %-25s \n", "ID", "Name", "Age", "Grade");
            uni.getStuList().get(i).displayInfor();
            for (int j = 0; j < courseList.size(); j++) {
                System.out.printf("%-10s %-10s \n", "CourseID", "CourseName");
                uni.getCourseList().get(j).displayInfor();
                break;
            }
        }
    }

    static void getCourse() {
        for (int j = 0; j < courseList.size(); j++) {
            uni.getCourseList().get(j).displayInfor();
            for (int i = 0; i < stuList.size(); i++) {
                uni.getStuList().get(i).displayInfor();
                break;
            }
        }
    }

    static void addStudent() {
        Student stu = new Student();
        stu.input();
        stuList.add(stu);
    }

    static void removeStudent(int n) {
        for (int i = 0; i < stuList.size(); i++) {
            if (uni.getStuList().get(i).getId() == n) {
                uni.getStuList().remove(uni.getStuList().get(i));
            }
        }
    }

    static void addCourse() {
        Course course = new Course();
        course.input();
        courseList.add(course);
    }

    static void removeCourse(String s) {
        for (int i = 0; i < courseList.size(); i++) {
            if (uni.getCourseList().get(i).getCourseID().equals(s)) {
                uni.getCourseList().remove(uni.getCourseList().get(i));
            }
        }
    }

    static void enrollStudentInCourse(University university) {
        System.out.print("Course ID enroll: ");
        String courseID = s.next();
        System.out.print("Student ID enroll: ");
        int stuID = s.nextInt();
        s.nextLine();
        for (Student i : stuList) {
            for (Course j : courseList) {
                i.enroll();
                j.addStu();
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("0: Escape");
            System.out.println("1: getStudents()");
            System.out.println("2: getCourse()");
            System.out.println("3: addStudent()");
            System.out.println("4: removeStudent()");
            System.out.println("5: addCourse()");
            System.out.println("6: removeCourse()");
            System.out.println("7: enrollStudentInCourse(University university)");
            System.out.println("");
            System.out.print("Your choice: ");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1: {
                    getStudents();
                    break;
                }
                case 2: {
                    getCourse();
                    break;
                }
                case 3: {
                    System.out.println("Add student");
                    addStudent();
                    break;
                }
                case 4: {
                    System.out.print("Remove Student ID");
                    removeStudent(s.nextInt());
                    break;
                }
                case 5: {
                    System.out.println("Add course");
                    addCourse();
                    break;
                }
                case 6: {
                    System.out.print("Remove course ID");
                    removeCourse(s.nextLine());
                    break;
                }
                case 7: {
                    enrollStudentInCourse(uni);
                    break;
                }
                case 0: {
                    System.out.println("GOODBYTE !!!!!!!!!!!!!!");
                    return;
                }
            }
        }
    }
}
    

