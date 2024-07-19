package com.amdocs.hotel;
import java.util.ArrayList;

public class SingleRoom {
    String name;
    String contact;
    String gender;
    Boolean haveVehicle;
    ArrayList<Vehicle> vehicleDetails = new ArrayList<>();
    ArrayList<Food> food =new ArrayList<>();


    SingleRoom()
    {
        this.name="";
        this.contact = "";
        this.gender = "";
        this.haveVehicle = false;
    }
    SingleRoom(String name,String contact,String gender,Boolean haveVehicle)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        this.haveVehicle = haveVehicle;
    }
}
