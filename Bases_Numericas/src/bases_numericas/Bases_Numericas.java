/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases_numericas;

public class Bases_Numericas {

   
    public static void main(String[] args) {
       
        bases n1 = new bases();
        bases c = new bases();
        System.out.println("Binario = "+n1.bin(22));
        System.out.println("octal = "+n1.oct(22));
        System.out.println("Hexadecimal = "+c.hex(12));
        
        
    }
    
}

class bases{
    
    public String bin(int n){
    
        String n1 = "";
        while (n>0){
            
            n1 = Integer.toString(n%2)+n1; //toString: convierte numeros en cadenas
            n/=2;
        }
        return n1;
    }
    
    public String oct(int n){
        
        String n1 = "";
        while (n>0){
            
         n1= Integer.toString(n%8)+n1;
         n/=8;
        }
        return n1;
    
    }

    public String hex(int n){
        
        String c = "";
  
        
        while(n>0){
            
            c = Integer.toString(n%16)+c;
        switch(c){
        
            case "10":
                c = "A";
                break;
            case "11":
                c = "B";
                break;
            case "12":
                c = "C";
                break;
            case "13":
                c = "D";
                break;
            case "14":
                c = "E";
                break;
            case "15":
                c = "D";
                break;
              
        }
       
        
        }
         return c;
    }
    
}