
package javaapplication5;


import java.util.Scanner;



public class JavaApplication5 {
    
    

    public static void main(String[] args) {
        int x,y;
        
        Scanner sc = new Scanner(System.in);
        prueba obj = new prueba();
        System.out.print("ingrese el primer valor: ");
        x = sc.nextInt();
        System.out.print("ingrese el segundo valor: ");
        y = sc.nextInt();
        obj.setX(x);
        obj.setY(y);
        System.out.print("Suma: "+obj.suma()+"\n");
        System.out.print("Valor de Primer Numero: "+obj.getX()+"\n");
        System.out.print("Valor de Segundo Numero:"+obj.getY()+"\n");
    }
    
}


class prueba{

    private int x,y;
    public int suma(){
          return x+y;
    }
    
    public void setX(int x){
        
        this.x = x;
    }
    public void setY(int y){
        
        this.y = y;
    }
    
    public int getX(){
       return x;
    }
     public int getY(){
       return y;
    }

}