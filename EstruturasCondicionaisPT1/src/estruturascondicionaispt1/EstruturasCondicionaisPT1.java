/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturascondicionaispt1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class EstruturasCondicionaisPT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();


        System.out.print("Digite seu ano de nascimento: ");
        int nascimento = teclado.nextInt();
        int ano_atual = cal.get(Calendar.YEAR);
        
        int idade = ano_atual - nascimento;
        
        if (idade >= 18) {
            System.out.println("Você já tem " + idade + " anos, pode comprar bebida hehe");
        } else {
            
            System.out.println("Você tem " + idade +" anos. Falta " + (18 - idade) + " anos para ser de maior");
        }
        
        
        /*
        System.out.print("Primeira Nota: ");;
        float n1 = teclado.nextFloat();
        System.out.print("Segunda Nota: ");
        float n2 = teclado.nextFloat();
        
        
        
        float media = (n1 + n2) / 2;
        System.out.println("Sua média foi de " + media);
        if (media > 9) {
            System.out.println("Parabéns");
        }
        
     */
        
        
    }
    
}
