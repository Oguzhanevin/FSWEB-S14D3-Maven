package org.example.company;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": the Ford engine is starting");
        return "the Ford engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": the Ford is accelerating");
        return "the Ford is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": the Ford is braking");
        return "the Ford is braking";
    }
}
