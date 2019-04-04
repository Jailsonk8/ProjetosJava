/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author jailson
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 1;
        
        while(cc <= 20){
            cc++;
            
            if (cc == 5 || cc == 7)
                continue; //interrompe para cima do laço
            
            if (cc == 12)
                break; // interrompe para fora do laço
            
            System.out.println("Cambalhota " + cc);
            
        }
    }
    
}
