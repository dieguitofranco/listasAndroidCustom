package com.df.listviewexample.models;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private String cylinderCapacity;
    private String model;
    private String value;
    private String image;

    public Car(){}

    public Car(String name, String cylinderCapacity, String model, String value, String image) {
        this.name = name;
        this.cylinderCapacity = cylinderCapacity;
        this.model = model;
        this.value = value;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCylinderCapacity() {
        return cylinderCapacity;
    }

    public String getModel() {
        return model;
    }

    public String getValue() {
        return value;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
