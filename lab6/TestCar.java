package com.arisa.labbaa;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("Ford", "C-MAX", "Cross", 800000, 2006);
        Car c2 = new Car("Lada", "Vesta", "Long", 1150000, 2014);
        Car c3 = new Car("Toyota", "Camry", "Original", 2160000, 2016);
        c1.println();
        c2.println();
        c3.println();
    }
}


