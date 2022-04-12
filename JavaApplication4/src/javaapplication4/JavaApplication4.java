

package javaapplication4;

//void no retorna public void
//si retorna va a ser el tipo de dato que retorna "public int"

class people{
    
    private int idpeople ;
    private String nombre;
    private int edad;
    private String genero;
   
    //constructores
    public people(int idpeople, String nombre, int edad){
    
        setIdpeople(idpeople);
        setNombre(nombre);
        setEdad(edad);
    }
    
    public people(){
    
    }
     public people(int idpeople, String nombre, int edad, String genero){
    
        setIdpeople(idpeople);
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
      
    }
     public void setIdpeople(int x){
         
         this.idpeople = x;
     
     }
     public void setNombre(String x){
     
         this.nombre = x;
     }
     public void setEdad(int x){
        if(x<55){
         this.edad = x;
         
        }else{
            System.out.println("La edad tiene que ser menor que 55");
        }
     }
     public void setGenero(String x){
     
         if(x.equals("F") || x.equals("M") ){ //No hay nejejidad de llaves// or x=="M/F"
             this.genero = x;
             
         }else{
                
             System.out.println("No se ha definido el Genero");
         }
     }
       public int getIdpeople(){
           return this.idpeople;
       }
        public String getNombre(){
           return this.nombre;
       }
        public int getEdad(){
           return this.edad;
       }
        public String getGenero(){
           return this.genero;
       }
     
}


public class JavaApplication4 {

    public static void main(String[] args) {

        people p1 = new people(2233,"arturo",16);
        p1.setGenero("M");                                         
        people p2 = new people(2067,"pablo",17,"M");
        
        System.out.println(p1.getIdpeople()+" " + p1.getNombre()+" "+p1.getEdad());
        System.out.println(p2.getIdpeople()+" "+p2.getNombre()+" "+p2.getEdad()+" "+p2.getGenero());
    }
    
}
