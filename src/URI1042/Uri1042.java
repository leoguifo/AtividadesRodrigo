package URI1042;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo
 */
public class Uri1042 {
    public static void run() {
        
        int[] numeros = new int[3];
        int[] numerosOrdenados = new int[3];
        SortSimples SS = new SortSimples();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Didite o 1º número");
        numeros[0]=sc.nextInt();
        System.out.println("Didite o 2º número");
        numeros[1]=sc.nextInt();
        System.out.println("Didite o 3º número");
        numeros[2]=sc.nextInt();
        
        numerosOrdenados=SS.ordenarValores(numeros);
        
        System.out.println("A Ordem é :"+numerosOrdenados[0]+" "+numerosOrdenados[1]+" "+numerosOrdenados[2]+" \nA Ordem era: "+numeros[0]+" "+numeros[1]+" "+numeros[2]);
        
    }
    
}
