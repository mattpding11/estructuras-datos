
package inf_post_pila;
import java.util.*;



class Nodo{

Object elem;
Nodo sig;
public Nodo(Object o){

    elem = o;
    sig = null;
}
    

}
class Pila{

    Nodo fin;
    int size;
    public Pila(){
    
        fin = null;
        size = 0;
    }
    public void aplicar(Object o){ // es Apilar
    
       Nodo nuevonodo = new Nodo(o);
       
       if(fin == null)
           fin = nuevonodo;
       else
       {
           nuevonodo.sig = fin;
           fin = nuevonodo;
       
       }
       size++;
    
    }
    public Object desapilar(){
    
        if(fin == null)
            return null; // no lee lo que este por debajo en caso de ejecutarse, se sale de una vez.
        Object o = fin.elem;
        fin = fin.sig;
        size--;
        return o;
    
    }
    
    public boolean esvacio(){
    
        return (size==0);
    }
    public int size(){
    
        return size;
    }
    
    public Object Tope(){
    
        if(fin == null)
            return null;
        else{
        
            return fin.elem;
        }
    
    }

}

class infpost{

    private int presedencia(String op){
    
        int pre = 0;
        switch(op){
        
            case "^":
                pre = 3;
                break;
            case "*":
            case "/":
                pre = 2;
                break;
            case "+":
            case "-":
                pre = 1;
                break;
         
        }
        
        return pre;
    
    }
    private boolean esNumero(String op){
    
        return (op.compareTo("0")>= 0 && op.compareTo("9")<=0);
    
    }
    
     private boolean esVariable(String op){
    
        return (op.toUpperCase().compareTo("A")>= 0 && op.toUpperCase().compareTo("Z")<=0); // compara si es mayor que y menor que z, si es mayor que a devuelve un 1, si es menor que la z devuelve un -1, si es igual a la letra devuelve un 0
    
    } 
     
     private boolean esOperador(String op){
     
         return (op.equals("^") || op.equals("*") ||
                 op.equals("/") || op.equals("+") || 
                 op.equals("+"));
       
     }
     
     public String convertir(String exp){
     
         String expresion = "",car;
         exp = exp.replace(" ","");
         Pila pila = new Pila();
         for(int i = 0;i < exp.length();i++){
             
             car = exp.substring(i,i+1);
         
             if(esNumero(car) || esVariable(car))
                 expresion += car;
             else if(car.equals("("))
                 pila.aplicar(car);
             else if(car.equals(")")){
                 
                 while(!pila.esvacio() && !pila.Tope().equals("(")) // ! = lo convierte al boleano opuesto, si es falso lo cambia averdadero y viseversa
                     expresion += pila.desapilar();
                 if(pila.Tope().equals("("))
                     pila.desapilar();
             }
             else if(esOperador(car)){
             
                 while(!pila.esvacio() && presedencia(pila.Tope().toString()) >= presedencia(car))
                     expresion += pila.desapilar();
                 pila.aplicar(car);
                         
                     }
                 
         }
         
         while(!pila.esvacio())
             expresion += pila.desapilar();
         return expresion;
         
     }
   
}
public class Inf_Post_Pila {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        infpost infpost = new infpost();
        String exp;
        System.out.print("Digite expresion: ");
        exp = leer.nextLine();
        System.out.println("Postfijo: "+infpost.convertir(exp));
    }
    
}
