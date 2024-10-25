package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max){
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for(Vehicle vehicle : inventory){
            if(vehicle.getPrice() > min && vehicle.getPrice() < max){
                vehicles.add(vehicle);
            }
        }
        return vehicles;
    }

    public List<Vehicle> getVehiclesByModel(String  make, String model){
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for(Vehicle vehicle : inventory){
            if(vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                vehicles.add(vehicle);
            }
        }
        return vehicles;
    }

    public List<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for(Vehicle vehicle : inventory){
            if(vehicle.getColor().equalsIgnoreCase(color)){
                vehicles.add(vehicle);
            }
        }
        return vehicles;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max){
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for(Vehicle vehicle : inventory){
            if(vehicle.getOdometor() > min && vehicle.getOdometor() < max){
                vehicles.add(vehicle);
            }
        }
        return vehicles;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType){
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for(Vehicle vehicle : inventory){
            if(vehicle.getVehicleType().equalsIgnoreCase(vehicleType)){
                vehicles.add(vehicle);
            }
        }
        return vehicles;
    }

    public List getAllVehicles(){
        return inventory;
    }

    public boolean addVehicle(Vehicle vehicle){
        if(inventory == null){
            return false;
        }

        boolean add = inventory.add(vehicle);
        return add;
    }

    public boolean removeVehicle(Vehicle vehicle){
        if(inventory == null){
            return false;
        }

        boolean remove = inventory.add(vehicle);
        return remove;
    }
}
