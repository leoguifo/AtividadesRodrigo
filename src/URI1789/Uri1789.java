/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1789;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class Uri1789 {
    public static void run() {
        int quantidade=0,veloz;
        Scanner sc = new Scanner(System.in);
        CorridadeLesmas CL = new CorridadeLesmas();
        System.out.println("Digite o número de lesmas nesse grupo:");
        quantidade=sc.nextInt();
        int[] lesmas = new int[quantidade];
        lesmas=CL.cadastrarLesmas(quantidade);
        
        System.out.println("A lesmas mais veloz do grupo é nível: "+CL.verificarVelocidades(lesmas));
    }
}
