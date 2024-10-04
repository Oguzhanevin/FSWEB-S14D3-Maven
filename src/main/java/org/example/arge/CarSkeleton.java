package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    // Parametreli constructor
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Parametresiz constructor
    public CarSkeleton() {
        this.name = "Default Car";
        this.description = "Default Description";
    }

    // Getterlar
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Metodlar
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": the engine is starting");
    }

    public void drive() {
        startEngine();
        runEngine();
    }

    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": running engine");
    }
}
