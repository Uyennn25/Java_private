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
public class Address {
    private String district;
    private String city;

    public Address() {
    }

    public Address(String district, String city) {
        this.district = district;
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "district='" + district + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
}
