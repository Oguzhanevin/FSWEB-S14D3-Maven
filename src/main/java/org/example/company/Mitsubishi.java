package org.example.company;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": the Mitsubishi engine is starting");
        return "the Mitsubishi engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": the Mitsubishi is accelerating");
        return "the Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": the Mitsubishi is braking");
        return "the Mitsubishi is braking";
    }
}
