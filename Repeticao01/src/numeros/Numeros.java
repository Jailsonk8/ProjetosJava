/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;



/**
 *
 * @author jailson
 */
public class Numeros {
   
    
    public static void main (String[] args){
        int n, s = 0;
        String response;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("Digite um número: ");
            n = scan.nextInt();
            s +=n;
            System.out.println("Quer continuar? [S/N] ");
            response = scan.next();
            
        }while(response.equals("S"));
        System.out.println("A soma de todos os valores é "+ s);
    }
}
