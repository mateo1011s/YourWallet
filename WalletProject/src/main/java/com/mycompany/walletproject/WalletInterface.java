package com.mycompany.walletproject;

import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class WalletInterface extends javax.swing.JFrame {
  
    DefaultTableModel mt = new DefaultTableModel();
    WalletProject operation = new WalletProject();  
    
    public WalletInterface() {
        initComponents();
        String idsOfColumns[]={"ID","Type","Date","Amount"};
        mt.setColumnIdentifiers(idsOfColumns);
        tablaOfTransactions.setModel(mt);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        InputOfAmount = new javax.swing.JTextField();
        purchaseButton = new javax.swing.JButton();
        saleButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaOfTransactions = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        totalOfMoney = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome ");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please enter the amount:");

        InputOfAmount.setBackground(new java.awt.Color(255, 255, 255));
        InputOfAmount.setForeground(new java.awt.Color(0, 0, 0));
        InputOfAmount.setSelectionColor(new java.awt.Color(0, 0, 0));
        InputOfAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputOfAmountActionPerformed(evt);
            }
        });

        purchaseButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        purchaseButton.setText("Purchase");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        saleButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        saleButton.setText("Sale");
        saleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleButtonActionPerformed(evt);
            }
        });

        tablaOfTransactions.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaOfTransactions.getTableHeader().setResizingAllowed(false);
        tablaOfTransactions.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaOfTransactions);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total:");

        totalOfMoney.setBackground(new java.awt.Color(255, 255, 255));
        totalOfMoney.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        totalOfMoney.setForeground(new java.awt.Color(255, 255, 255));
        totalOfMoney.setText("100$");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("YOUR WALLET");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(purchaseButton)
                                .addGap(94, 94, 94)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputOfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(saleButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalOfMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(InputOfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseButton)
                    .addComponent(saleButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalOfMoney))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        //verificar si hay fondos
        if(operation.result>=amountOfTransaction){
        //añadir a la tabla lo creado 
        mt.addRow(new Object[]{randomID,typeOfTransaction,momentOfTransaction,amountOfTransaction});
         // esto hace que el lugar para ingresar el monto quede vacio 
        InputOfAmount.setText("");
         //operar el total
        operation.purchaseOption(amountOfTransaction);
        totalOfMoney.setText(String.valueOf(operation.result)+"$");
        //hacer que el cursor vuela al input automaticamente
        }else{
        JOptionPane.showMessageDialog(null,"Oops, you don't have enough funds, you can't carry out this transaction,");
        }
        InputOfAmount.requestFocus();
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
        //operar el total
        operation.saleOption(amountOfTransaction);
        totalOfMoney.setText(String.valueOf(operation.result)+"$");
        //hacer que el cursor vuela al input automaticamente
        InputOfAmount.requestFocus();
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JButton saleButton;
    private javax.swing.JTable tablaOfTransactions;
    private javax.swing.JLabel totalOfMoney;
    // End of variables declaration//GEN-END:variables
}
