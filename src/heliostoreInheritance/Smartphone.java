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
public class Smartphone extends Devices{
     private String generation;

    public Smartphone() {
    }

    public Smartphone(String serialNo, String brand, String color, double screenSize, double weight, int year, double price, String generation) {
        super(serialNo, brand, color, screenSize, weight, year, price);
        this.generation = generation;
    }

    @Override
    public String toString() {
        return super.toString() + "Smartphone\n" + "Generation=" + generation + "\n" + howtoCharge() +"\n\n";
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void discount() {
        if (generation.equalsIgnoreCase("GalaxyS10")) {
            price -= price * 0.1;
        }
    }

    public String howtoCharge() {
        return "Charge this device by plugging in the adapter.";
    }
}
