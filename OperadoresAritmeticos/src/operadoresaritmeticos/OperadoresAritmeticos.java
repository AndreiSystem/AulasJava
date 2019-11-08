/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println(m);
        
        int numero = 5;
        numero--;
        System.out.println(numero);
        
        int x = 4;
        x+= 2; // x = x + 2 = 6
        System.out.println(x);
        
        float v = 5.6f;
        int ar = (int) Math.abs(v);        
        System.out.println(ar);
        
        double aleatorio = Math.random();
        int n = (int)(0 + aleatorio * (10-0));
        System.out.println(n);
*/
    Scanner ler = new Scanner(System.in);
       Random r = new Random();
       int ale = r.nextInt(10);
         
       int n = 0;
       
       
       while (n != ale) {
            System.out.printf("Digite um número de 0 a 10: ");
            n = ler.nextInt();
           System.out.println("Opa tente de novo.");
       }
      
        System.out.println("Você acertou!");
        
    }  
    
}
