/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author andre
 */
public class OperadorTernarioOperadoresLogicosEcomparacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*        
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        //if resumido:
        r = (n1 > n2)? 0 : 1;
        
        System.out.println(r);
  */  

/*
        //comparação string
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String nome4 = "Andrei";
        String res;
        res = (nome1.equals(nome4))?"igual" : "diferente";
        
        System.out.println(res);
*/
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        
        r = (x<y ^ y==z) ? true : false;
        
        System.out.println(r);
    }
    
}
