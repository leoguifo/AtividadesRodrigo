/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1045;

/**
 *
 * @author Leonardo
 */
public class TiposdeTriangulos {
    public String verifica(double a, double b , double c){
       double[] numeros = {a, b,c}; 
       for (int i = 1; i < numeros.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numeros[i] > numeros[j]) {
                    double aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        String texto = "";
        if(numeros[0] >= (numeros[1]+numeros[2])){
            texto+="NAO FORMA UM TRIANGULO";
        }else{
            if((numeros[0]*numeros[0]) == ( (numeros[1]*numeros[1])+(numeros[2]*numeros[2]))){
                texto+="TRIANGULO RETANGULO";   
            }
            if((numeros[0]*numeros[0]) > (( numeros[1]*numeros[1])+(numeros[2]*numeros[2]))){
                texto+="TRIANGULO OBTUSANGULO";   
            }
            if((numeros[0]*numeros[0]) < (( numeros[1]*numeros[1])+(numeros[2]*numeros[2]))){
                texto+="TRIANGULO ACUTANGULO";   
            }
            if((numeros[0] == numeros[1])&&(numeros[0] == numeros[2]) && (numeros[1] == numeros[2])){
                texto+="TRIANGULO EQUILATERO";  
            }else{
                if((numeros[0] == numeros[1]) || (numeros[0] == numeros[2]) || (numeros[1] == numeros[2])){
                    texto+="TRIANGULO ISOSCELES";
                }
            }
        }
        return texto;
       
    }
}
