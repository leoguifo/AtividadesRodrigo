/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1114;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Uri1114 {
    public static void run() {
        SenhaFixa verifica = new SenhaFixa();
        Scanner reader;       
        reader = new Scanner (System.in);
        int senhalida = reader.nextInt();
        int senha = verifica.Senha(senhalida);
        if(senha==1){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Senha invalida");
        }
    }
}
