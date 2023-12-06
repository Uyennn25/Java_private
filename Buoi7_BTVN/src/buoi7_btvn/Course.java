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
public class Course {

    private String courseID;
    private String courseName;
    private List<Student> stuList;

    public Course(String courseID, String courseName, List<Student> stuList) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.stuList = stuList;
    }

    public Course() {
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter course ID: ");
        this.courseID = s.next();
        s.nextLine();
        System.out.print("Enter course name: ");
        this.courseName = s.nextLine();
    }

    public void addStu() {
        for (int i = 0; i < stuList.size(); i++) {
            if (this.courseID.equals(this.stuList.get(i).getCourseList().get(i).courseID) && this.courseName.equals(this.stuList.get(i).getCourseList().get(i).courseName)) {
                stuList.add(this.stuList.get(i));
            }
        }
    }
    
    public void displayInfor(){
        System.out.printf("%-10s %-10s \n",this.courseID,this.courseName);
    }
}
