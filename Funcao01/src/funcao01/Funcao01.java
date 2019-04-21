/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

/**
 *
 * @author jailson
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fatorial f = new Fatorial();
        f.setValor(5);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
        
        int x , y;
        double z;
        
        x = 5;
        y = 2;
        z = x / y;
        
        System.out.println(z);
        
        for (int i = 1; i < 5; i++) {
            if (i==2) continue;
                System.out.print(" i = " + i); 
        }
        
        System.out.println("");
        
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        
        System.out.println(v0 +","+v1+","+v2);
        
        Object[] str = {"a", "ab", "abc"};
        
        System.out.println(str[1]);
        
        int total = 0;
        int c[] = new int[13];
        for (int i = 0; i < c.length; i++){
             c[i] += i;
            total += c[i] * 2;
        }
        
        System.out.println(total);
    }
    
}
