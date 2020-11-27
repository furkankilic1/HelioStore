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
public class Notebook extends Computer{
    
     private boolean touchScreen;

    public Notebook() {
    }

    public Notebook(String serialNo, String brand, String color, double screenSize, double weight,
        int year, double price, String version, boolean touchScreen) {
        super(serialNo, brand, color, screenSize, weight, year, price, version);
        this.touchScreen = touchScreen;
        
    }
    

    @Override
    public String toString() {
        return super.toString() + "Notebook" + "\nTouch Screen=" + touchScreen + "\n" + howToCharge() +"\n\n";
    }
  
    public String howToCharge(){
        return "Charge this device by putting it on the wireless charger.";
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    
    
}
