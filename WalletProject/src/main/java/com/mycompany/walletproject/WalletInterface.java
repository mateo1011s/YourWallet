package com.mycompany.walletproject;

import static com.mycompany.walletproject.WalletProject.randomNumberForID;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WalletInterface extends javax.swing.JFrame {
  
    DefaultTableModel mt = new DefaultTableModel();
      
    public WalletInterface() {
        initComponents();
        String idsOfColumns[]={"ID","Type","Date","Amount"};
        mt.setColumnIdentifiers(idsOfColumns);
        tablaOfTransactions.setModel(mt);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        purchaseButton = new javax.swing.JButton();
        saleButton = new javax.swing.JButton();
        InputOfAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaOfTransactions = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        purchaseButton.setText("Purchase");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        saleButton.setText("Sale");
        saleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleButtonActionPerformed(evt);
            }
        });

        InputOfAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputOfAmountActionPerformed(evt);
            }
        });

        jLabel1.setText("Please enter the amount:");

        jLabel2.setText("Welcome to you WALLET");

        jLabel3.setText("Total:");

        tablaOfTransactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaOfTransactions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(179, 179, 179))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(purchaseButton)
                        .addGap(70, 70, 70)
                        .addComponent(saleButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(InputOfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputOfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseButton)
                    .addComponent(saleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        //Creacion del Id random
        int randomID = randomNumberForID();
        //tipo de transaccion en el caso de pulsar purchase
        String typeOfTransaction = "Purchase";
        // sacar hora y fehca de mi sistema hora y fecha
        String momentOfTransaction = dateAndHourOfTransaction();
         //variable para obetener costo del prudcto
        double amountOfTransaction=amountOfMoneyForTransaction();
         //añadir a la tabla lo creado 
        mt.addRow(new Object[]{randomID,typeOfTransaction,momentOfTransaction,amountOfTransaction});
         // esto hace que el lugar para ingresar el monto quede vacio 
        InputOfAmount.setText("");
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void InputOfAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputOfAmountActionPerformed
     
    }//GEN-LAST:event_InputOfAmountActionPerformed

    private void saleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleButtonActionPerformed
           //Creacion del Id random
        int randomID = randomNumberForID();
        //tipo de transaccion en el caso de pulsar purchase
        String typeOfTransaction = "Sale";
        // sacar hora y fehca de mi sistema hora y fecha
        String momentOfTransaction = dateAndHourOfTransaction();
         //variable para obetener costo del prudcto
        double amountOfTransaction=amountOfMoneyForTransaction();
        //añadir a la tabla lo creado 
        mt.addRow(new Object[]{randomID,typeOfTransaction,momentOfTransaction,amountOfTransaction});
        // esto hace que el lugar para ingresar el monto quede vacio 
        InputOfAmount.setText("");
    }//GEN-LAST:event_saleButtonActionPerformed
    //Cree esta funcion para los numeros random
    public static int randomNumberForID() {
        
        Random random = new Random(); 
        int idRandom = 10000 + random.nextInt(90000); 
        return idRandom;
    }
    //Funcion para obetener laa hora y fecha en el formato indicado
    public static String dateAndHourOfTransaction(){
        LocalDateTime rightNow = LocalDateTime.now();
        DateTimeFormatter dateAndTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        String currentDateAndTime= rightNow.format(dateAndTime);
        return currentDateAndTime;
    }
    //funcion para obenter el monto ingresado en el input
    public double amountOfMoneyForTransaction(){
        double amountOfMoney = Double.valueOf(InputOfAmount.getText());
        return amountOfMoney;
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
            java.util.logging.Logger.getLogger(WalletInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WalletInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WalletInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WalletInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WalletInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputOfAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JButton saleButton;
    private javax.swing.JTable tablaOfTransactions;
    // End of variables declaration//GEN-END:variables
}
