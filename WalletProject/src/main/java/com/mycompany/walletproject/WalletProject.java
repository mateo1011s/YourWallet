/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.walletproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Patricio Safla
 */
public class WalletProject {

    public static void main(String[] args) {
        // Llamar a la función randomNumberForID y almacenar el resultado en una variable
        Scanner scanner = new Scanner(System.in);
        int numerodevecees= scanner.nextInt();
        for (int i=1; i<numerodevecees ; i++){
        int randomID = randomNumberForID(0); // Puedes pasar cualquier valor entero, en este caso paso 0
        
        // Imprimir el resultado
        System.out.println("El ID "+ i +" aleatorio generado es: " + randomID);
    }
    }    

    public static int randomNumberForID(int randomID) {
        Random random = new Random(); 
        int idRandom = 10000 + random.nextInt(90000); 
        return idRandom;
    }
}
