
package com.mycompany.walletproject;


public class WalletProject {
    
    public double result;
    double total=100;
    
    public void purchaseOption (double amountOfTransaction){

        result=total-amountOfTransaction;
        total=result;
    }
    public void saleOption (double amountOfTransaction){
       
        result=total+amountOfTransaction;
        total=result;
    }     
      
}
