/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author jailson
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, cont = 0, contP = 0 , contI= 0, contM = 0;
        double media;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Informe um número:<br> <em>[Sair = 0]</em> </html>"));
            s +=n; 
            cont++; // total dos valores
            
            if(n%2 == 0)
                contP++;// é Par
            else
                contI++;// é Impar
             
            if(n > 100)
                contM++; // é maior que 100
            
            
        }while(n != 0);
        
        media = s/cont; // media dos valores
        
        JOptionPane.showMessageDialog(null, "<html>Resultado<br> <hr> <br>"
                +"Total de Valores: "+cont+"<br>"
                +"Total de Pares: "+contP+"<br>"
                +"Total de Impares: "+contI+"<br>"
                +"Acima de 100: "+contM+"<br>"
                +"Media dos valores: "+media+"<br>"
                +"<html>");
    }
    
}
