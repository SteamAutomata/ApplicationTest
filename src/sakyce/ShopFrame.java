/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sakyce;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author y.dupont
 */
public class ShopFrame extends javax.swing.JFrame {

    /**
     * Creates new form Shop
     */
    public ShopFrame() {
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

        jScore = new javax.swing.JLabel();
        jTotalCost = new javax.swing.JLabel();
        jItemName = new javax.swing.JLabel();
        jItemDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMultipliers = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListAutoclicks = new javax.swing.JList<>();
        jBuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScore.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScore.setText("Vous avez 000 uwus");
        jScore.setToolTipText("");

        jTotalCost.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTotalCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTotalCost.setText("Coûte 000 uwus");
        jTotalCost.setToolTipText("");

        jItemName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jItemName.setText("Rat Eric Zemmour");

        jItemDescription.setText("N'aime pas trop les draumadaires");
        jItemDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jListMultipliers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListMultipliers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListMultipliers.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jListMultipliersFocusLost(evt);
            }
        });
        jListMultipliers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMultipliersValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListMultipliers);

        jListAutoclicks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListAutoclicks.setToolTipText("");
        jListAutoclicks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListAutoclicks.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jListAutoclicksFocusLost(evt);
            }
        });
        jListAutoclicks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAutoclicksMouseClicked(evt);
            }
        });
        jListAutoclicks.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListAutoclicksValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListAutoclicks);

        jBuy.setText("Acheter!!!");
        jBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jItemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jItemDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScore)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void updateShop() {
        ArrayList<String> autoclickerUpgrades = new ArrayList<>();
        ArrayList<String> multiplierUpgrades = new ArrayList<>();

        CookieClicker.shopUpgrades.forEach(upgrade -> {
            if (upgrade.type == UpgradeType.Autoclicker) {
                autoclickerUpgrades.add(upgrade.name);
            } else if (upgrade.type == UpgradeType.Multiplier) {
                multiplierUpgrades.add(upgrade.name);
            }
        });

        jListAutoclicks.setListData(autoclickerUpgrades.toArray(String[]::new));
        jListMultipliers.setListData(multiplierUpgrades.toArray(String[]::new));
    }

    public void updateDescription(Upgrade item) {
        jItemDescription.setText(item.description);
        jItemName.setText(item.name);
        jTotalCost.setText(String.valueOf(item.cost));
    }

    private void jBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuyActionPerformed
        var a = jListAutoclicks.getSelectedValuesList();
        var b = jListMultipliers.getSelectedValuesList();
        var selectedUpgrade = Stream.concat(a.stream(), b.stream()).collect(Collectors.toList());
        CookieClicker.buyUpgrade(selectedUpgrade.getFirst());
    }//GEN-LAST:event_jBuyActionPerformed

    private void jListAutoclicksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAutoclicksMouseClicked

    }//GEN-LAST:event_jListAutoclicksMouseClicked

    private void jListMultipliersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMultipliersValueChanged
        String selection = null;
        try { selection = jListMultipliers.getSelectedValuesList().get(0); } 
        catch(IndexOutOfBoundsException e) {}  
        finally {
            updateDescription(
                    CookieClicker.shopUpgradesMap.getOrDefault(
                        selection, 
                        new Upgrade(1, 1, UpgradeType.Multiplier)
                    )
            );
        }
    }//GEN-LAST:event_jListMultipliersValueChanged

    private void jListAutoclicksValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListAutoclicksValueChanged
        String selection = null;
        try { selection = jListAutoclicks.getSelectedValuesList().get(0); } 
        catch(IndexOutOfBoundsException e) {}  
        finally {
            updateDescription(
                    CookieClicker.shopUpgradesMap.getOrDefault(
                        selection, 
                        new Upgrade(1, 1, UpgradeType.Autoclicker)
                    )
            );
        }
    }//GEN-LAST:event_jListAutoclicksValueChanged

    private void jListAutoclicksFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jListAutoclicksFocusLost
        
    }//GEN-LAST:event_jListAutoclicksFocusLost

    private void jListMultipliersFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jListMultipliersFocusLost
        
    }//GEN-LAST:event_jListMultipliersFocusLost

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
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuy;
    private javax.swing.JLabel jItemDescription;
    private javax.swing.JLabel jItemName;
    private javax.swing.JList<String> jListAutoclicks;
    private javax.swing.JList<String> jListMultipliers;
    private javax.swing.JLabel jScore;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jTotalCost;
    // End of variables declaration//GEN-END:variables
}
