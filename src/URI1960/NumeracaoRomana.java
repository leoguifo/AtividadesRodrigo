/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1960;

/**
 *
 * @author Leonardo
 */
public class NumeracaoRomana {
    public String getRomanos(String numeroS){
        String mm[] = {"","M","MM","MMM"};
        String cc[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String dd[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String uu[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String resposta="";
        
        char num[] = numeroS.toCharArray();
        if(num.length==4){
            int num0=num[0]-48;
            int num1=num[1]-48;
            int num2=num[2]-48;
            int num3=num[3]-48;
            
            resposta=resposta+mm[num0];
            resposta=resposta+cc[num1];
            resposta=resposta+dd[num2];
            resposta=resposta+uu[num3];
        }
        if(num.length==3){
            int num0=num[0]-48;
            int num1=num[1]-48;
            int num2=num[2]-48;
            
            resposta=resposta+cc[num0];
            resposta=resposta+dd[num1];
            resposta=resposta+uu[num2];
        }
        if(num.length==2){
            int num0=num[0]-48;
            int num1=num[1]-48;
            
            resposta=resposta+dd[num0];
            resposta=resposta+uu[num1];
        }
        if(num.length==1){
            int num0=num[0]-48;
            resposta=resposta+uu[num0];
        }
        
        return resposta;
    }
}
