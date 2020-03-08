package com.coolcompany.Beshstore.domain;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String desc;
    @Column
    private double price;


    public Product(){
    }
    public Product(String name, String desc, double price){
        this.name = name;
        this.desc = desc;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Type='" + desc + '\'' +
                ", Price='" + price + '\'' +
                '}';
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
} // The End...


