/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7_btvn;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Student extends Person implements Displayable{

    private int age;
    private int grade;
    private List<Course> courseList;

    public Student() {
        super();
    }

    public Student(int age, int grade, List<Course> course, String name) {
        super(name);
        this.age = age;
        this.grade = grade;
        this.courseList = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> course) {
        this.courseList = course;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("enter name: ");
        super.setName(s.nextLine());
        System.out.print("Enter age: ");
        this.age = s.nextInt();
        System.out.print("Enter grade: ");
        this.grade = s.nextInt();
        s.nextLine();
    }

    public void enroll() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of course: ");
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter course no." + (i + 1));
            Course course = new Course();
            course.input();
            this.courseList.add(course);
        }
    }
    @Override
    public void displayInfor(){
        System.out.printf("%-5d %-25s %-25d %-25d \n",this.getId(),this.getName(),this.age,this.grade);
    }
}
