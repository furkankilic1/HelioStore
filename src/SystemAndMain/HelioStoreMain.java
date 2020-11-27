/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemAndMain;

import GUI.MainFrame;
import static SystemAndMain.HelioStoreSystem.list;
import static SystemAndMain.HelioStoreSystem.ts;
import java.util.Scanner;

/**
 *
 * @author cemku
 */
public class HelioStoreMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MainFrame m = new MainFrame();
        HelioStoreSystem.readFile();
        m.setVisible(true);

    }

}
