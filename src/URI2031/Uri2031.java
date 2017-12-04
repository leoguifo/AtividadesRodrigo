/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI2031;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Uri2031 {
    public static void run() {
        int i,j, vencedor;
        PedraPapelAtaqueAereo jokenpo = new PedraPapelAtaqueAereo();
        Scanner reader;
        reader = new Scanner (System.in);
        String[] sinal = new String[2];
        System.out.println("Quantidade de Partidas: ");
        String qntd = reader.nextLine();
        int qtd = Integer.parseInt(qntd);
        
        System.out.println("Os movimentos pode ser: pedra, papel e ataque");
        
        for (i=0;i<qtd;i++){
            for(j=0;j<2;j++){
                System.out.println("Movimento Jogador "+(j+1)+": ");
                sinal[j] = reader.nextLine();
            }
        vencedor = jokenpo.verificarVencedor(sinal);
        jokenpo.imprimirVencedor(vencedor);
        System.out.println();
        }
    }
}
