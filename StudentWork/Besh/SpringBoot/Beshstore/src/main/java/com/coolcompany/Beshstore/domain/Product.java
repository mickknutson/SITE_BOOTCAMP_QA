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
    private String type;
    @Column
    private String price;
    public Product(){
    }
    public Product(String name){
        this.name = name;
    }
    @Transient
    public void type() {
        throw new RuntimeException("not yet implemented");
    }

    @Transient
    public void price(String price) {
        throw new RuntimeException("not yet implemented");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Type='" + type + '\'' +
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
} // The End...


