/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7_btvn;

/**
 *
 * @author ADMIN
 */
public abstract class Person implements Displayable{

    private int id;
    private String name;
    private static int nextID = 0;

    public Person() {
    }

    
    public Person(String name) {
        this.id = ++nextID;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract void displayInfor();
}