/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1142;

/**
 *
 * @author Leonardo
 */
public class PUM {
    public String gerarSequencia(int numero){
        int cont = 0;
        String pum="";
            for(int j = 1; j <= (numero * 4); j++){
                pum=pum+j+" ";
                cont++;
                if(cont == 3){
                    j++;
                    pum=pum+"PUM\n";
                    cont = 0;
                }
            }
        return pum;
        }
}
