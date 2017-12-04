/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI2167;

import java.util.Scanner;

/**
 *
 * @author Leonardo
 */
public class Uri2167 {
    public static void run() {
        int i, caso=0;
        FalhadoMotor motor = new FalhadoMotor();
        Scanner reader;
        reader = new Scanner (System.in);
        int medidasVelocidade; //1<N<=100
        boolean continuar = true;
        
        do{
            medidasVelocidade = reader.nextInt();
            int[] rotacoesMinutos = new int[medidasVelocidade];
            if ((medidasVelocidade>1) && (medidasVelocidade<=101)){
                for(i=0;i<rotacoesMinutos.length;i++){
                    rotacoesMinutos[i] = reader.nextInt();
                    continuar = false;             
                }
                caso = motor.falha(rotacoesMinutos);
            } else {
                System.out.println("Digite um número maior de 1 e menor de 100.");
            }
        }while(continuar);  
        System.out.println(caso);
    }
}
