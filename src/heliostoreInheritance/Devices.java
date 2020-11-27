/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heliostoreInheritance;

import java.util.Scanner;

/**
 *
 * @author didem
 */
public abstract class Devices implements Comparable<Devices>{
    protected String serialNo, brand, color;
    protected double screenSize, weight;
    protected int year;
    protected double price;
    protected static int numberOfDevices;
    

    public Devices() {
        numberOfDevices++;
    }

    public Devices(String serialNo, String brand, String color, double screenSize, double weight, int year, double price) {
        this.serialNo = serialNo;
        this.brand = brand;
        this.color = color;
        this.screenSize = screenSize;
        this.weight = weight;
        this.year = year;
        this.price = price;
        numberOfDevices++;
    }

    public String toString() {
        return "Devices Info" + "\nSerial No= " + serialNo + "\nBrand= " + brand + "\nColor= " + color
                + "\nScreen Size= " + screenSize + "\nWeight= " + weight + "\nYear= " + year + "\nPrice= " +price +"\n";
    }

    public boolean findSerialNo(String serialNumber) {
        if (serialNo.equalsIgnoreCase(serialNumber)) {
            return true;
        } else {
            return false;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public double getPrice() {
        return price;
    }
    
    public static int getDeviceCount(){
        return numberOfDevices;
    }
   
    public abstract void discount();

    @Override
    public int compareTo(Devices t) {
        return (int) (price-t.getPrice());
    }
    
}
