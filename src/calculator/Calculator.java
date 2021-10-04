/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 * TD B 
 * @author KAEPPELIN Mayeul
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n  Entrer le nombre :\n 1) add: \n 2) substract: \n 3) multiply: \n 4) divide: \n 5) modulo:" );
        operateur=sc.nextInt(); // On demande a sc de donner le prochain entier
        int operande1;
        System.out.println("entrer une première valeur");
        operande1 = sc.nextInt();
        //System.out.println(operande1);
        int operande2;
        System.out.println("entrer une deuxième valeur");
        operande2 = sc.nextInt();
        

    }
    
}
