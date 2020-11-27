/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devicehasA;

import java.util.Scanner;

/**
 *
 * @author didem
 */
public class Mouse {
     private boolean wire;

    public Mouse() {
    }

    public Mouse(boolean wire) {
        this.wire = wire;
    }

    @Override
    public String toString() {
        return "-Wire=" + wire;
    }

    public void setWire(boolean wire) {
        this.wire = wire;
    }
    
    
    
    public void getInput() {
        Scanner sc = new Scanner(System.in);
        String ans;
        System.out.println("Wired or not?");
        ans = sc.next();
        if(ans.equalsIgnoreCase("yes")) {
            wire = true;
        }
        wire = false;
    }
}
