/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1151;

/**
 *
 * @author Leonardo
 */
public class FibonacciFacil {
    public String gerarFibonacci(int numero){
        int n1 = 1, n2 = 0;
        String fibo="";
        fibo=n2+" "+n1+" ";
            for(int j = 0; j < (numero-2); j++){
                n1 = n1 + n2;
                n2 = n1 - n2;
                fibo=fibo+n1+" ";
            }
            
        return fibo;
    }
}
