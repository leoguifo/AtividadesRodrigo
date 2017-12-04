/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI2031;

/**
 *
 * @author Leonardo
 */
public class PedraPapelAtaqueAereo {
    public int verificarVencedor(String[] sinal) {
        String[] forma = {"pedra", "papel", "ataque"};
        int jogador1, jogador2;
        if (sinal[0].equals(forma[0])) {
            jogador1 = 1;
        } else if (sinal[0].equals(forma[1])) {
            jogador1 = 2;
        } else {
            jogador1 = 3;
        } 
        
         if (sinal[1].equals(forma[0])) {
            jogador2 = 1;
        } else if (sinal[1].equals(forma[1])) {
            jogador2 = 2;
        } else {
            jogador2 = 3;
        } 
        
        if(jogador1 == 3 && jogador2 != 3){
            return 1;
        } else if(jogador2 == 3 && jogador1 != 3){
            return 2;
        } else if(jogador2 == 3 && jogador1 == 3){
            return 5;
        } else if(jogador1 == 1 && jogador2 == 1){
            return 3;
        } else if(jogador1 == 2 && jogador2 == 2){
            return 4;
        } else if(jogador1 == 1 && jogador2 == 2){
            return 1;
        } else {
        return 2;
        }  
    }
    
    public void imprimirVencedor(int vencedor){
        
        switch (vencedor) {
            case 1:
                System.out.print("Jogador 1 venceu");
                break;
            case 2:
                System.out.print("Jogador 2 venceu");
                break;
            case 3:
                System.out.print("Sem ganhador");
                break;
            case 4:
                System.out.print("Ambos venceram");
                break;
            case 5:
                System.out.print("Aniquilação Mútua");
                break;
           }
       }
}
