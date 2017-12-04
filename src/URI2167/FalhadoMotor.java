/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI2167;

/**
 *
 * @author Leonardo
 */
public class FalhadoMotor {
    public int falha(int[]rotacoesMinutos){
        int i,c=1, caso=0;
        for(i=1;i<rotacoesMinutos.length;i++){
            if(rotacoesMinutos[i]<rotacoesMinutos[i-1]) {
                caso = i;
                c++;
               break;
            } 
        } 
       
        if (c>=2){
            return caso+1;
        } else {
            return caso;
        }    
    }
}
