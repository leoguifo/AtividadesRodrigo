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
public class Uri2582 {
    public static void run() {
      SystemofaDownload musica = new SystemofaDownload();
      String musicaEscolhida = "";
      int[] botoes = new int [2];
      StringBuilder builder = new StringBuilder();
      Scanner reader;
      reader = new Scanner (System.in);
      int qntd = musica.lerQuantidade();
      int cont=0;
      for(int l=0; l<qntd; l++){
            for(int j=0;j<2;j++){
            System.out.println("Digite o " + (j+1) + " botão");
            botoes[j] = reader.nextInt();
            musicaEscolhida = musica.verificarMusica(botoes);
            }
        builder.append (musicaEscolhida);
      }
    System.out.println(builder.toString());
    }
}
