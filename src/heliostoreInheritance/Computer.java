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
public abstract class Computer extends Devices{
    
    private String version;
    

    public Computer() {
      

    }

    public Computer(String serialNo, String brand, String color, double screenSize, double weight, int year, double price,
        String version) {
        super(serialNo, brand, color, screenSize, weight, year, price);
        
        this.version = version;
    }
    
    public String toString() {
        return super.toString() + "Version= " + version + "\n";
    }

    public void discount() {
        if (version.equalsIgnoreCase("MacOS-Majove")) {
            price -= price * 0.2;
        }
    }
    
    
    
}
