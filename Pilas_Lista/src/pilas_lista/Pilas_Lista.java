
package pilas_lista;

class Nodo{

    Object elem;
    Nodo Sig;
    public Nodo(Object o){
    
        elem = o;
        Sig = null;
    }


}
class Pila{

    Nodo fin;
    int size;
    public Pila(){ // Inicializa valores en null
        fin = null;
        size = 0;
    }
    public void push(Object o){ //Encargado de apilar
    
        Nodo new_nodo = new Nodo(o);
        if(fin==null)
            fin = new_nodo;
        else{
        
            new_nodo.Sig = fin;
            fin = new_nodo;
        }
        size++;
    }
    
    public Object pop(){ //Encargado de Desapilar
        
        if(fin==null)
            return null;
 
        Object o = fin.elem;
        fin = fin.Sig;
        size--;
        return o;
        
    }
    public boolean esVacio(){ //Para Saber si la pila es vacia
    
        return (size == 0);
    }
    public int size(){
    
        return size;
    }
    public Object tope(){ //Ultmo nodo apilado
    
        if(fin == null)
            return null;
        else
            return fin.elem;
        
    }
}
public class Pilas_Lista {

    public static void main(String[] args) {
       
        Pila pila = new Pila();
        System.out.println("vacia : "+pila.esVacio());
        pila.push(5);
        System.out.println(pila.size());
        System.out.println(pila.esVacio());
        pila.push(22);
        System.out.println(pila.size());
        System.out.println(pila.esVacio());
        pila.push(1);
        System.out.println("El tamaño de la pila es: "+pila.size());
        System.out.println("vacia : "+pila.esVacio());
        System.out.println("Tope: "+pila.tope());
        System.out.println("Desapilo: "+pila.pop());
        System.out.println("El tamaño : "+pila.size());
        System.out.println("vacia : "+pila.esVacio());
        System.out.println("Tope: "+pila.tope());
       

        
        
        
    }
    
}
