/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1142;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Uri1142 {
    public static void run() {
        PUM pum = new PUM();
    
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        System.out.println(pum.gerarSequencia(numero));
    }
}
