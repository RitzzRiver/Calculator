/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Ops.Operations;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 * @author Kris
 */
public class App extends javax.swing.JFrame {

    int num1;
    int num2;

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainContainer = new javax.swing.JPanel();
        ButtonsContainer = new javax.swing.JPanel();
        btn_addition = new javax.swing.JButton();
        btn_substract = new javax.swing.JButton();
        btn_multiply = new javax.swing.JButton();
        btn_divide = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        ControlsContainer = new javax.swing.JPanel();
        lbl_num1 = new javax.swing.JLabel();
        txt_num1 = new javax.swing.JTextField();
        lbl_num2 = new javax.swing.JLabel();
        txt_num2 = new javax.swing.JTextField();
        lbl_result = new javax.swing.JLabel();
        txt_result = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_addition.setText("Sumar");
        btn_addition.setPreferredSize(new java.awt.Dimension(87, 23));
        btn_addition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_additionMouseClicked(evt);
            }
        });

        btn_substract.setText("Restar");
        btn_substract.setPreferredSize(new java.awt.Dimension(87, 23));
        btn_substract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_substractMouseClicked(evt);
            }
        });

        btn_multiply.setText("Multiplicar");
        btn_multiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_multiplyMouseClicked(evt);
            }
        });

        btn_divide.setText("Dividir");
        btn_divide.setPreferredSize(new java.awt.Dimension(87, 23));
        btn_divide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_divideMouseClicked(evt);
            }
        });

        btn_delete.setText("Borrar");
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deleteMouseClicked(evt);
            }
        });

        btn_close.setText("Cerrar");
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ButtonsContainerLayout = new javax.swing.GroupLayout(ButtonsContainer);
        ButtonsContainer.setLayout(ButtonsContainerLayout);
        ButtonsContainerLayout.setHorizontalGroup(
            ButtonsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ButtonsContainerLayout.createSequentialGroup()
                        .addGroup(ButtonsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_addition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_multiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ButtonsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_substract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonsContainerLayout.setVerticalGroup(
            ButtonsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_addition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_substract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close)
                .addContainerGap())
        );

        lbl_num1.setText("Numero 1:");

        lbl_num2.setText("Numero 2:");

        lbl_result.setText("Resultado:");

        txt_result.setEnabled(false);

        javax.swing.GroupLayout ControlsContainerLayout = new javax.swing.GroupLayout(ControlsContainer);
        ControlsContainer.setLayout(ControlsContainerLayout);
        ControlsContainerLayout.setHorizontalGroup(
            ControlsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlsContainerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ControlsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_num1)
                    .addComponent(lbl_num2)
                    .addComponent(lbl_result))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(ControlsContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_result)
                    .addComponent(txt_num1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_num2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        ControlsContainerLayout.setVerticalGroup(
            ControlsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlsContainerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_num1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lbl_num2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(lbl_result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainContainerLayout = new javax.swing.GroupLayout(MainContainer);
        MainContainer.setLayout(MainContainerLayout);
        MainContainerLayout.setHorizontalGroup(
            MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainContainerLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(ControlsContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(ButtonsContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        MainContainerLayout.setVerticalGroup(
            MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainContainerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ControlsContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonsContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(MainContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_additionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_additionMouseClicked
        num1 = Integer.parseInt(txt_num1.getText());
        num2 = Integer.parseInt(txt_num2.getText());

        txt_result.setText(String.valueOf(Operations.Addition(num1, num2)));
    }//GEN-LAST:event_btn_additionMouseClicked

    private void btn_substractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_substractMouseClicked
        num1 = Integer.parseInt(txt_num1.getText());
        num2 = Integer.parseInt(txt_num2.getText());

        txt_result.setText(String.valueOf(Operations.Substract(num1, num2)));
    }//GEN-LAST:event_btn_substractMouseClicked

    private void btn_multiplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_multiplyMouseClicked
        num1 = Integer.parseInt(txt_num1.getText());
        num2 = Integer.parseInt(txt_num2.getText());

        txt_result.setText(String.valueOf(Operations.Multiply(num1, num2)));
    }//GEN-LAST:event_btn_multiplyMouseClicked

    private void btn_divideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_divideMouseClicked
        num1 = Integer.parseInt(txt_num1.getText());
        num2 = Integer.parseInt(txt_num2.getText());

        if (num2 == 0){
            Toolkit.getDefaultToolkit().beep();
            txt_result.setText("ERROR");
        }
        else{
            txt_result.setText(String.valueOf(Operations.Divide(num1, num2)));
            
            JOptionPane.showMessageDialog(this, String.valueOf(Operations.Divide(num1, num2)));
        }
    }//GEN-LAST:event_btn_divideMouseClicked

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked
        txt_num1.setText("");
        txt_num2.setText("");
        txt_result.setText("");
    }//GEN-LAST:event_btn_deleteMouseClicked

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsContainer;
    private javax.swing.JPanel ControlsContainer;
    private javax.swing.JPanel MainContainer;
    private javax.swing.JButton btn_addition;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_multiply;
    private javax.swing.JButton btn_substract;
    private javax.swing.JLabel lbl_num1;
    private javax.swing.JLabel lbl_num2;
    private javax.swing.JLabel lbl_result;
    private javax.swing.JTextField txt_num1;
    private javax.swing.JTextField txt_num2;
    private javax.swing.JTextField txt_result;
    // End of variables declaration//GEN-END:variables
}
