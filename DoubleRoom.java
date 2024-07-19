package com.amdocs.hotel;

public class DoubleRoom extends SingleRoom {
    String name2;
    String contact2;
    String gender2;

    DoubleRoom(String name,String contact,String gender,String name2,String contact2,String gender2,Boolean haveVehicle)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        this.name2=name2;
        this.contact2=contact2;
        this.gender2=gender2;
        this.haveVehicle = haveVehicle;
    }
}
