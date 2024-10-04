package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // Constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;  // Default motor durumu
        this.wheels = 4;     // Default tekerlek sayısı
    }

    // Getterlar
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    // toString metodunu override et
    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + ", engine=" + engine + ", wheels=" + wheels + "}";
    }

    // equals metodunu override et
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    // Diğer metotlar
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": the car's engine is starting");
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": the car is accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName() + ": the car is braking");
        return "the car is braking";
    }
}
