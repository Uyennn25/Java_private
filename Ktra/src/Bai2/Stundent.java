/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author ADMIN
 */
public class  Stundent extends Person {
    private double score;

    public Stundent() {
    }

    public Stundent(String name, short age, Address address, double score) {
        super(name, age, address);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String getCapacity() {
        if (score >= 9.0) {
            return "Học lực xuất sắc";
        } else if (score >= 8.0) {
            return "Học lực giỏi";
        } else if (score >= 6.5) {
            return "Học lực khá";
        } else {
            return "Học lực trung bình yếu";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address=" + getAddress() +
                ", score=" + score +
                ", capacity='" + getCapacity() + '\'' +
                '}';
    }
}
