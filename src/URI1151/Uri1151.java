/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1151;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Uri1151 {
    public static void run() {
        FibonacciFacil fibonacci = new FibonacciFacil();
        
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        if(numero < 46 && numero > 0){
            System.out.println(fibonacci.gerarFibonacci(numero));
        }else{
            System.out.println("Número inválido (deve ser menor que 46)");
        }
    }
}
