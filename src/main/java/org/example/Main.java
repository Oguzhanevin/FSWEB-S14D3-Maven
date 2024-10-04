package org.example;

import org.example.arge.GasPoweredCar;
import org.example.arge.ElectricCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {
        // GasPoweredCar objesinin oluşturulması
        GasPoweredCar gasPoweredCar = new GasPoweredCar("Gas Powered Car", "Gas description", 15.0, 6);  // Doğru parametreler

        // ElectricCar objesinin oluşturulması
        ElectricCar electricCar = new ElectricCar("Electric Car", "Electric description", 10.0, 5);  // Doğru parametreler

        // HybridCar objesinin oluşturulması
        HybridCar hybridCar = new HybridCar("Hybrid Car", "Hybrid description", 12.0, 8, 4);  // Doğru parametreler

        // Diğer kodlar
        gasPoweredCar.startEngine();
        gasPoweredCar.drive();

        electricCar.startEngine();
        electricCar.drive();

        hybridCar.startEngine();
        hybridCar.drive();
    }
}
