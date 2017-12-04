/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1042;

import java.util.Arrays;

/**
 *
 * @author Leonardo
 */
public class SortSimples {
    
    public int[] ordenarValores(int[] numeros){
        int[] numerosOrdenados = Arrays.copyOf(numeros, numeros.length);
        
        Arrays.sort(numerosOrdenados);
        
        return numerosOrdenados;
    }
    
}
