package com.coolcompany.mystore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    @Id //Primary key
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private float cost;
public Item(){
    this.id = -1;
    this.name = "name";
    this.description = "description";
    this.cost = -1;
}
    public Item(int id, String name, String description, float cost) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getCost() {
        return cost;
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
