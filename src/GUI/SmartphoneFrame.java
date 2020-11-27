/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import SystemAndMain.HelioStoreSystem;
import heliostoreInheritance.Smartphone;

/**
 *
 * @author didem
 */
public class SmartphoneFrame extends javax.swing.JFrame {

    /**
     * Creates new form Smartphone
     */
    public SmartphoneFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(350, 500);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ssizetxt = new javax.swing.JTextField();
        brandtxt = new javax.swing.JTextField();
        snotxt = new javax.swing.JTextField();
        weighttxt = new javax.swing.JTextField();
        yeartxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        colortxt = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        generationtxt = new javax.swing.JTextField();
        closebtn = new javax.swing.JButton();
        elabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Serial No:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setText("Brand:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setText("Screen Size:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setText("Weight:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setText("Year:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel6.setText("Price:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel7.setText("Color:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        getContentPane().add(ssizetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 180, -1));
        getContentPane().add(brandtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 180, -1));

        snotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snotxtActionPerformed(evt);
            }
        });
        getContentPane().add(snotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 180, -1));
        getContentPane().add(weighttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 180, -1));
        getContentPane().add(yeartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, -1));

        pricetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetxtActionPerformed(evt);
            }
        });
        getContentPane().add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 180, -1));
        getContentPane().add(colortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 180, -1));

        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, -1));

        jLabel8.setText("Generation:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        getContentPane().add(generationtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 180, -1));

        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        elabel.setText(" ");
        getContentPane().add(elabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 270, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pricetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetxtActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:

        String sno = "";
        if (brandtxt.getText().equals("") || colortxt.getText().equals("") || pricetxt.getText().equals("")
                || snotxt.getText().equals("") || ssizetxt.getText().equals("")
                || yeartxt.getText().equals("") || weighttxt.getText().equals("") || generationtxt.getText().equals("")) {
            elabel.setText("Please fill the necessary fields!!");
        } else {

            sno = snotxt.getText();
            if (!HelioStoreSystem.checkSerialNo(sno)) {
                String brand = brandtxt.getText();
                double ssize = Double.parseDouble(ssizetxt.getText());
                double weight = Double.parseDouble(weighttxt.getText());
                int year = Integer.parseInt(yeartxt.getText());
                double price = Double.parseDouble(pricetxt.getText());
                String color = colortxt.getText();
                String generation = generationtxt.getText();

                Smartphone sm = new Smartphone(sno, brand, color, ssize, weight, year, price, generation);
                HelioStoreSystem.list.add(sm);
                elabel.setText("Added");
            } else {
                elabel.setText("This serialno already exist!");
            }
        }

    }//GEN-LAST:event_addbtnActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void snotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snotxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField brandtxt;
    private javax.swing.JButton closebtn;
    private javax.swing.JTextField colortxt;
    private javax.swing.JLabel elabel;
    private javax.swing.JTextField generationtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField snotxt;
    private javax.swing.JTextField ssizetxt;
    private javax.swing.JTextField weighttxt;
    private javax.swing.JTextField yeartxt;
    // End of variables declaration//GEN-END:variables
}
