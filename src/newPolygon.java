/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
/**
 *
 * @author c3
 */
public class newPolygon extends javax.swing.JFrame {

    /**
     * Creates new form newPolygon
     */
    private int radius = 200;
    private int xCenter = 300;
    private int yCenter = 220;
    int[] xCords;
    int[] yCords;
    private int sliderValue;
    public newPolygon() {
        initComponents();
        jRadioButton1.setActionCommand("PolyDot");
        jRadioButton2.setActionCommand("PolyGon");
        jRadioButton3.setActionCommand("PolyMesh");
        jRadioButton4.setActionCommand("PolyWheel");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSlider1 = new javax.swing.JSlider();
        canvas1 = new java.awt.Canvas();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(30);
        jSlider1.setMinimum(3);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(4);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 426, 68));

        canvas1.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 680, 470));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("PolyDot");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 30, 130, 40));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("PolyGon");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 100, 30));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("PolyMesh");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 110, 30));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("PolyWheel");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        String radio = buttonGroup1.getSelection().getActionCommand();
        display(radio);
//        sliderValue = jSlider1.getValue();
//        xCords = new int[sliderValue];
//        yCords = new int[sliderValue];
//        for (int i = 0; i < sliderValue; i++) {
//            xCords[i] = (int) ((int)radius * Math.cos(2 * Math.PI * i / sliderValue) + xCenter);
//            yCords[i] = (int) (radius * Math.sin(2 * Math.PI * i / sliderValue) + yCenter);
//        }
//        Graphics g = canvas1.getGraphics();
//        canvas1.update(g);
//        String radio = buttonGroup1.getSelection().getActionCommand();
//       string radio = buttonGroup1.g
//        jRadioButton2.setSelected(true);
//        g.drawPolygon(xCords, yCords, sliderValue);
//        int[] y = new int[200];

    }//GEN-LAST:event_jSlider1StateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        display(jRadioButton1.getText());
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        display(jRadioButton2.getText());
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        display(jRadioButton3.getText());
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        display(jRadioButton4.getText());
    }//GEN-LAST:event_jRadioButton4ActionPerformed
    public void display(String radio) {
        sliderValue = jSlider1.getValue();
        xCords = new int[sliderValue];
        yCords = new int[sliderValue];
        for (int i = 0; i < sliderValue; i++) {
            xCords[i] = (int) ((int)radius * Math.cos(2 * Math.PI * i / sliderValue) + xCenter);
            yCords[i] = (int) (radius * Math.sin(2 * Math.PI * i / sliderValue) + yCenter);
        }
        Graphics g = canvas1.getGraphics();
        canvas1.update(g);
        switch(radio) {
            case "PolyWheel": {
                g.setColor(Color.red);
                for (int i = 0; i < xCords.length; i++) {
                    g.drawLine(xCords[i], yCords[i], xCenter, yCenter);
                }
            }
            case "PolyGon": {
                g.drawPolygon(xCords, yCords, sliderValue);
                break;
            }
            case "PolyDot": {
                g.setColor(Color.red);
                for (int i = 0; i < xCords.length; i++) {
                    g.fillOval(xCords[i], yCords[i], 15, 15);
                }
                break;
            }
            case "PolyMesh": {
                g.setColor(Color.red);
                for (int i = 0; i < xCords.length; i++) {
                    for (int j = 0; j < yCords.length; j++) {
                        g.drawLine(xCords[i], yCords[i], xCords[j], yCords[j]);
                    }
                }
                break;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newPolygon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newPolygon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newPolygon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newPolygon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newPolygon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Canvas canvas1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
