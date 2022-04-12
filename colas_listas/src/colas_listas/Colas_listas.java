
package colas_listas;

class Cola{

    class Nodo{
    
        Object elem;
        Nodo Sig;
        public Nodo(Object n){
        
            elem = n;
            Sig = null;
            
        }
    
    }
    Nodo frente;
    Nodo fin;
    int size;
    
    public Cola(){
        
      fin = null;
      size = 0;
 
    }
    public void encolar(Object n){
    
        Nodo new_nodo = new Nodo(n);
        if(frente==null){
        
            frente = new_nodo;
            fin = new_nodo;
        }else{
        
            fin.Sig = new_nodo;
            fin = new_nodo;
        }
        size++;
          
    }
    public Object desencolar(){
    
        if(frente == null)
            return null;
        Object n = frente.elem;
        frente = frente.Sig;
        size--;
        return n;
        
    }
    
    public boolean esvacio(){
    
        return (size == 0);
    
    }
    
    public int size(){
    
        return size;
        
    }
    
    public Object frente(){
    
        if(frente == null)
            return null;
        else
            return frente.elem;
    
    }
    public Object ultimo(){
    
        if(fin == null)
            return null;
        else
            return fin.elem;
    
    }

}
public class Colas_listas {

   
    public static void main(String[] args) {
        
        Cola cola = new Cola();
        System.out.println("Vacio: "+cola.esvacio());
        cola.encolar(5);
        System.out.println("Vacio: "+cola.esvacio());
        cola.encolar(6);
        cola.encolar(9);
        cola.encolar(1);
        System.out.println("Tamaño: "+cola.size());
        System.out.println("frente: "+cola.frente());
        System.out.println("Desencolar: "+cola.desencolar());
        System.out.println("Tamaño: "+cola.size());
         System.out.println("ultimo: "+cola.ultimo());
      
    }
    
}
