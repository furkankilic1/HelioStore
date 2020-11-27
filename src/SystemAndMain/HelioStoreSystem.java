/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemAndMain;

import devicehasA.Mouse;
import heliostoreInheritance.Desktop;
import heliostoreInheritance.Devices;
import heliostoreInheritance.Notebook;
import heliostoreInheritance.Smartphone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cemku
 */
public class HelioStoreSystem {

    public static TreeSet<Devices> ts = new TreeSet();
    public static ArrayList<Devices> list = new ArrayList();

    public static boolean checkSerialNo(String serialNo) {

        for (int i = 0; i < list.size(); i++) {
            Devices get = list.get(i);
            if (get.findSerialNo(serialNo)) {
                return true;
            }
        }
        return false;
    }

    public static String displayDevice() {
        String res = "";
        ts.addAll(list);
        for (Devices d : ts) {
            res += d.toString();
        }
        res+="Total number of devices= " + Devices.getDeviceCount();
        return res;
    }
    
    public static TreeSet<Devices> getStoreSet(){
        return ts;
    }

    public static String searchDevice(String brand) {
        String res = "";

        if (brand.equalsIgnoreCase("Apple")) {
            for (Devices dev : list) {
                if (dev.getBrand().equalsIgnoreCase("Apple")) {
                    res += dev.toString();
                }
            }
        } else if (brand.equalsIgnoreCase("Samsung")) {
            for (Devices dev : list) {
                if (dev.getBrand().equalsIgnoreCase("Samsung")) {
                    res += dev.toString();
                }
            }
        } else if (brand.equalsIgnoreCase("Casper")) {
            for (Devices dev : list) {
                if (dev.getBrand().equalsIgnoreCase("Casper")) {
                    res += dev.toString();
                }
            }
        } else if (brand.equalsIgnoreCase("Hp")) {
            for (Devices dev : list) {
                if (dev.getBrand().equalsIgnoreCase("Hp")) {
                    res += dev.toString();
                }
            }
        } else if (brand.equalsIgnoreCase("Dell")) {
            for (Devices dev : list) {
                if (dev.getBrand().equalsIgnoreCase("Dell")) {
                    res += dev.toString();
                }
            }
        } else {
            res = "There are no devices with " + brand + " brand.";
        }

        return res;
    }
    
     public static void readFile(){
        
        try {
            File f = new File("helio.txt");
            Scanner sc = new Scanner(f);
            
            while(sc.hasNext()){
                String device = sc.next();
                String serialNo = sc.next();
                String brand = sc.next();
                String color = sc.next();
                double screenSize = Double.parseDouble(sc.next());
                double weight =   Double.parseDouble(sc.next());
                int year =  sc.nextInt();
                double price  =  Double.parseDouble(sc.next());
                
                if(device.equalsIgnoreCase("smartphone")){
                    String generation = sc.next();
                    Smartphone s = new Smartphone(serialNo, brand, color, screenSize, weight, year, price, generation);
                    s.discount();
                    list.add(s);
                }else if(device.equalsIgnoreCase("desktop")){
                    Mouse mo = new Mouse();
                    String version = sc.next();
                    String tower = sc.next();
                    boolean mouse =sc.nextBoolean();
                    
                    mo.setWire(mouse);
                    
                    Desktop d = new Desktop(serialNo, brand, screenSize, weight, year, color, price, version, tower, mo);
                    d.discount();
                    list.add(d);
                }else if(device.equalsIgnoreCase("notebook")){
                    boolean touch = sc.nextBoolean();
                    Notebook n = new Notebook(serialNo, brand, color, screenSize, weight, year, price, serialNo, touch);
                    n.discount();
                    list.add(n);
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HelioStoreSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean removeDevice(String serialno) {
        Devices device = null;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSerialNo().equalsIgnoreCase(serialno)) {
                device = list.remove(i);
                return true;
            }
        }
        return false;
    }

}
