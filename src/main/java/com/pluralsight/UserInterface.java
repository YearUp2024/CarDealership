package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;


    public UserInterface(){
        this.dealership = DealershipFileManager.getDealership();
    }

    public void display(){
        for(Vehicle vehicle : dealership.getAllVehicles()){
            System.out.println(vehicle);
        }
    }

    public void processGetByPriceRequest(){
        double min = Console.PromptForDouble("Enter mid price: ");
        double max = Console.PromptForDouble("Enter max price: ");

        dealership.getVehiclesByPrice(min, max).forEach(System.out::println);
    }
//
//    public void processGetByMakeModelRequest(){}
//
//    public void processGetByYearRequest(){}
//
//    public void processGetByColorKequest(){}
//
//    public void processGetByMileageRequest(){}
//
//    public void processGetByVehicleTypeRequest(){}
//
//    public void processGetAllVehicleaRequest(){}
//
//    public void processAddVehicleRequest(){}
//
//    public void rocessRemoveVehicleRequest(){}

}