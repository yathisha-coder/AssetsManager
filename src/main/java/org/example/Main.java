package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Asset> assets = new ArrayList<>();
        assets.addAll(List.of(new House("My house","2015-06-15",
                250000,"123 Lake View Dr", 1,2400,12000),
                new House("Vacation home","2018-08-01",180000,"88 Beach Blvd",
                        2, 1800,9000),
                 new Vehicle("Tom's truck","2020-05-10",35000,
                         "Ford F-150",2020,120000),
                new Vehicle("My driver","2023-11-20",25000,
                        "Toyota Camry",2023,15000)
        ));
        for (Asset asset : assets){
            System.out.println("\u001B[36m--------------------------\u001B[0m");
            System.out.println("\u001B[32m Description: " + asset.getDescription() +"\u001B[0m");
            System.out.println("\u001B[33m Date Acquired: " + asset.getDateAcquired()+"\u001B[0m");
            System.out.println("\u001B[34m Original Cost: " + asset.getOriginalCost() + "\u001B[0m");
            System.out.println("\u001B[35m Current Value: " + asset.getValue() + "\u001B[0m");
            //instance and downCasting
            if(asset instanceof House){
                House house = (House) asset;
                System.out.println("\u001B[38;5;217m House Address: " + house.getAddress() + "\u001B[0m");
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("\u001B[38;5;205mVehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel() + "\u001B[0m");
                
            }
        }

    }
}