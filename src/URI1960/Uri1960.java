/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1960;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Uri1960 {
    public static void run() {
        NumeracaoRomana NR = new NumeracaoRomana();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digit um número: ");
        String num = sc.next();
        
        System.out.println(NR.getRomanos(num));
    }
}
