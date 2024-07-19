package com.amdocs.hotel;

public class Vehicle {
    private String typeOf;
    private String regNo;

    public Vehicle() {
    }

    public Vehicle(String typeOf, String regNo){
        this.typeOf=typeOf;
        this.regNo=regNo;
    }

    public String getTypeOf() {
        return typeOf;
    }

    public String getRegNo() {
        return regNo;
    }
}
