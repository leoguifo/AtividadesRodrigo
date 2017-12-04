/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI2582;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class SystemofaDownload {
    public int lerQuantidade() {
        Scanner reader;
        reader = new Scanner(System.in);
        System.out.println("Digite a quantidade de testes");
        int qntd = reader.nextInt();
        return qntd;
    }
    public String verificarMusica (int[] botoes){
        StringBuilder builder = new StringBuilder();
        int soma = botoes[0] + botoes[1];
        if (soma == 0){
            builder.append("PROXYCITY");
            builder.append("\n");
        }
        if(soma == 1){
            builder.append("P.Y.N.G.");
            builder.append("\n");
        }
        if(soma == 2){
            builder.append("DNSUEY!");
            builder.append("\n");
        }    
        if(soma == 3){
            builder.append("SERVERS");
            builder.append("\n");
        }
        if(soma == 4){
            builder.append("HOST!");
            builder.append("\n");
        }
        if(soma == 5){
            builder.append("CRIPTONIZE");
            builder.append("\n");
        }    
        if(soma == 6){
            builder.append("OFFLINE DAY");
            builder.append("\n");
        }
        if(soma == 7){
            builder.append("SALT");
            builder.append("\n");
        }
        if(soma == 8){
            builder.append("ANSWER!");
            builder.append("\n");
        }    
        if(soma == 9){
            builder.append("RAR?");
            builder.append("\n");
        }
        if(soma == 10){
            builder.append("WIFI ANTENNAS");
            builder.append("\n");
        }

        return builder.toString();
    }
}
