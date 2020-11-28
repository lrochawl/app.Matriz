/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.matriz;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class AppMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual numero de linhas da matriz: ");
        int nl = sc.nextInt();
        System.out.println("Qual o numero de colunas na matriz:  *");
        System.out.println("Brasil");
        int nc = sc.nextInt();
        
        int[][] matriz = new int[nl][nc];
        
        for(int i = 0; i < nl; i++){
            
            for(int c = 0; c < nc; c++){
                System.out.printf("Digite o valor da linha %d e coluna %d: ", (i+1), (c + 1));
                matriz[i][c] = sc.nextInt();
            }
            
        }
        
        for(int i = 0; i < matriz[nc].length; i++){
           
                System.out.println("Main principal: " + matriz[i][i]);
           
        }
        
        int negativos = 0;
        for(int i  = 0; i < matriz.length; i++){
            for(int c = 0; c < matriz[nc].length; c++){
                if(matriz[i][c] < 0){
                    negativos++;
                }
            }
        }
        System.out.print("Numeros negativos Vamos descobrir quem são"+negativos);
        sc.close();
    }
    
}
