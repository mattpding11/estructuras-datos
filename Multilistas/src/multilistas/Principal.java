
package multilistas;

public class Principal {
    
    public static void main(String[]args){
    
        Multilistas multilistas = new Multilistas();
        multilistas.AgregarNodoFather("Dr House");
        multilistas.AgregarNodoFather("Dr Screen");
        multilistas.AgregarNodoFather("Dr Strange");
        System.out.println("Nombre -- Apellido -- Edad -- ID");
        multilistas.AgregarNodoSon("Dr House", "laura Gonzales, 19, 10000123");
        multilistas.AgregarNodoSon("Dr House", "jose bohorquez, 20, 10000154");
        multilistas.AgregarNodoSon("Dr Screen", "Brayan Smith, , 1003200168");
        multilistas.AgregarNodoSon("Dr Screen", "Britanny Stefany, 12, 10000197");
        multilistas.AgregarNodoSon("Dr Strange", "Pedro Marquez, 15, 10000188");
       multilistas.AgregarNodoSonPaciente("Dr Strange","Pedro Marquez, 15, 10000188","camilo ochoa,8,99828828");
        multilistas.MostrarMultilista();
        //Mostrar pacientes de nodo padre en especifico: multilistas.Mostrarpacientes("Dr House"); //
    
    }
    
}
