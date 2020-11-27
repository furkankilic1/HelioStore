/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heliostoreInheritance;

import devicehasA.Mouse;
import java.util.Scanner;

/**
 *
 * @author didem
 */
public class Desktop extends Computer {
    private String towerType;
    private Mouse mouse = new Mouse();

    public Desktop() {
    }

    public Desktop(String serialNo, String brand, double screenSize, double weight, 
                    int year, String color, double price, String version,String towerType, Mouse mouse) {
        super(serialNo, brand, color, screenSize, weight, year, price, version);
        this.towerType = towerType;
        this.mouse = mouse;
    }
  
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Desktop\n" + "Tower Type=" + towerType + "\nMouse" + mouse + "\n\n";
    }
}
