/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraswing;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class CalculadoraSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite outro valor: ");
        int n2 = leitor.nextInt();
        
        System.out.print("Escolha se quer [+, -, /, *]: ");
        String calc = leitor.next();
        
        
        switch (calc) {
            case "+":
                System.out.println("resultado:" + (n1+n2));
                break;
            case "-":
                System.out.println("resultado: " + (n1 - n2));
                break;
            case "*":
                System.out.println("resultado: " + (n1 * n2));
                break;
            case "/":
                System.out.println("resulado "+ (n1 / n2));
                break;
            default:
                System.out.println("ERRO");
                break;
        }
        
    }
    
}
