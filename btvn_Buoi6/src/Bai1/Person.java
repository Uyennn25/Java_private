
package Bai1;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected Address address = new Address();

    public Person() {
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        setName(sc.nextLine());
        System.out.println("Age: ");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Address: ");
        getAddress().input();
        
    }
    public void output(){
        System.out.printf("%-20s %-15d %-20s", getName(), getAge(), getAddress()," ");
    }
    public static void title(){
        System.out.printf("%-20s %-15s %-20s", "Name" , "Age", "Address");
    }
}
