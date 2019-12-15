package com.arisa.laba;

public class Tarelka extends Dish {
    private String size;
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public Tarelka(String material, String color, String size) {
        super(material, color);
        this.size = size;
    }
    @Override
    public String toString() {
        return "Tarelka{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
