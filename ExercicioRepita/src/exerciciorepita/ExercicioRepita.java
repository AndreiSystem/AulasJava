/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author andrei
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variáveis propostas:
        //numero digitado
        int n;
        //soma
        int s = 0;
        //par
        int p = 0;
        //impar
        int i = 0;
        //acima de 100 (n>100)
        int aC = 0;
        //media
        float m = 0;
        //contador
        int c = 0;
        //laço de repetição
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um valor <br><em>(0 interrompe)</em> </html>"));
            s += n;
            if (n % 2 == 0 && n != 0) {
                p++;
            } else {
                i++; 
            }
            if (n > 100) {
                aC++;
            }
            if (n != 0) {
                c++;
            }
            
        } while (n != 0);
        m = s / c;
        JOptionPane.showMessageDialog(null, "<html>Resulado final <hr>" +
                "<br> Total de valores: " + c +
                "<br>Somatorio vale " + s + 
                "<br> Total de Pares: " + p +
                "<br>Total de Ímpares: " + i + 
                "<br>Acima de 100: " + aC +
                "<br> Média de valores: " + m);
        
    }
    
}
