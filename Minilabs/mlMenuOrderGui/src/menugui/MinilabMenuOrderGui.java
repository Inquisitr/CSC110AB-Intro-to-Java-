/* Name: Austin Newton	.	........
 * Date: 03/02/21
 * Purpose: The programs purpose is to allow custoimers to place an online order with Austin's Creamery.
 */
package menugui;

import javax.swing.*;


public class MinilabMenuOrderGui extends javax.swing.JFrame {

    /**
     * Creates new form MinilabOrderMenuGui
     */
    
    
    
    
    public MinilabMenuOrderGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupBeverage = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblOrder = new javax.swing.JLabel();
        lblFlavor = new javax.swing.JLabel();
        cbxFlavor = new javax.swing.JComboBox<>();
        lblTopping = new javax.swing.JLabel();
        chkSprinkles = new javax.swing.JCheckBox();
        chkMMS = new javax.swing.JCheckBox();
        chkGummyWorms = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        rdoChocolate = new javax.swing.JRadioButton();
        rdoCarmel = new javax.swing.JRadioButton();
        rdoStrawberry = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order Menu");
        setMaximumSize(new java.awt.Dimension(600, 535));
        setMinimumSize(new java.awt.Dimension(600, 535));
        setPreferredSize(new java.awt.Dimension(600, 535));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Magneto", 3, 24)); // NOI18N
        lblTitle.setText("Austin's Creamery");

        btnSubmit.setText("Submit Order");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });

        lblOrder.setFont(new java.awt.Font("Magneto", 0, 18)); // NOI18N
        lblOrder.setText("Place Your Order");

        lblFlavor.setFont(new java.awt.Font("Magneto", 0, 18)); // NOI18N
        lblFlavor.setText("Flavor:");

        cbxFlavor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Choose Flavor>", "Vanilla", "Chocolate", "Strawberry" }));

        lblTopping.setFont(new java.awt.Font("Magneto", 0, 18)); // NOI18N
        lblTopping.setText("Toppings:");

        chkSprinkles.setText("Sprinkles");
        chkSprinkles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSprinklesActionPerformed(evt);
            }
        });

        chkMMS.setText("M&Ms");

        chkGummyWorms.setText("Gummy Worms");

        jLabel1.setFont(new java.awt.Font("Magneto", 0, 18)); // NOI18N
        jLabel1.setText("Syrup:");

        buttonGroupBeverage.add(rdoChocolate);
        rdoChocolate.setText("Chocolate");

        buttonGroupBeverage.add(rdoCarmel);
        rdoCarmel.setText("Carmel");

        buttonGroupBeverage.add(rdoStrawberry);
        rdoStrawberry.setText("Strawberry");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTopping))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkSprinkles, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrder)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFlavor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxFlavor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkMMS, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rdoCarmel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdoStrawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(chkGummyWorms))))))))
                .addContainerGap(513, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOrder)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFlavor)
                    .addComponent(cbxFlavor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkGummyWorms)
                    .addComponent(chkMMS)
                    .addComponent(chkSprinkles)
                    .addComponent(lblTopping))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rdoChocolate)
                    .addComponent(rdoCarmel)
                    .addComponent(rdoStrawberry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkSprinklesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSprinklesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSprinklesActionPerformed

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
        String order = "Your Order: \n\n";

        switch(cbxFlavor.getSelectedIndex()) {
            case 1:
            order += "Flavor: Vanilla \n";
            break;

            case 2:
            order += "Flavor: Chocolate \n";
            break;

            case 3:
            order += "Flavor: Strawberry \n";
            break;
        }

        if (chkSprinkles.isSelected()) {
            order += "Topping: Sprinkles \n";
        }

        if (chkMMS.isSelected()) {
            order += "Topping: M&Ms \n";
        }

        if (chkGummyWorms.isSelected()) {
            order += "Topping: Gummy Worms \n";
        }

        if (rdoCarmel.isSelected()) {
            order += "Syrup: Carmel \n";
        }

        if (rdoChocolate.isSelected()) {
            order += "Syrup: Chocolate \n";
        }

        if (rdoStrawberry.isSelected()) {
            order += "Syrup: Strawberry \n";
        }

        JOptionPane.showMessageDialog(null, order);
    }//GEN-LAST:event_btnSubmitMouseClicked

    
    
    
    
    
    

    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MinilabMenuOrderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinilabMenuOrderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinilabMenuOrderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinilabMenuOrderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MinilabMenuOrderGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroupBeverage;
    private javax.swing.JComboBox<String> cbxFlavor;
    private javax.swing.JCheckBox chkGummyWorms;
    private javax.swing.JCheckBox chkMMS;
    private javax.swing.JCheckBox chkSprinkles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFlavor;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTopping;
    private javax.swing.JRadioButton rdoCarmel;
    private javax.swing.JRadioButton rdoChocolate;
    private javax.swing.JRadioButton rdoStrawberry;
    // End of variables declaration//GEN-END:variables
}
