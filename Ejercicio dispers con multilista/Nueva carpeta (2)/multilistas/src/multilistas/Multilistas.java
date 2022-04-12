    package multilistas;
import java.util.Scanner;
import javax.swing.JOptionPane;


class VariablesDeAyuda
{
    int Segundo= 0;
    int Abajo=0;
    
}

public class Multilistas 
{

    private NodoPadre CAB;
    private NodoPadre FINAL;
    

    public Multilistas() {
    }

    public void agregarNodoPadre(int info) {
        NodoPadre nodoPadre = new NodoPadre(info);
        System.out.println("Entró nodo padre");
        
        
        try {
            if (CAB == null) 
            {
            
            //System.out.println("Entró nodo 1 if");   
                
             
                CAB = nodoPadre;
                FINAL = nodoPadre;
            } 
            else 
            { 
           
            //System.out.println("Entró nodo 2 if");   
                
                FINAL.setSig(nodoPadre);
                FINAL = nodoPadre;
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public NodoPadre buscarNodoPadre(int info) 
    {
        NodoPadre nodoPadre = CAB;
        try {
            while (nodoPadre != null) {
                if (nodoPadre.getInfo()==info) 
                {
                    return nodoPadre;
                }
                nodoPadre = nodoPadre.getSig();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public void agregarNodoHijo(int infoPadre, int infoHijo) 
    {

        try {
            NodoPadre np = buscarNodoPadre(infoPadre);
          
            if (np != null) {
                
                //NodoHijo nodoHijo2 =np.getSegundo();
                //NodoHijo nodoHijoNuevo2 = new NodoHijo(infoHijo2);
                
                if (np.getAbajo() == null) 
                {
                    NodoHijo nodoHijoNuevo = new NodoHijo(infoHijo,1);
                    np.setAbajo(nodoHijoNuevo);
                    //np.setSegundo(nodoHijoNuevo2);
                    
                } else //como hay hijos, lo debemos agregar al final
                {
                    NodoHijo nodoHijo = np.getAbajo();
                    //boolean NodoExiste = false;
                    
                    
                    while (nodoHijo.getAbajo() != null)
                    {
//                        if (nodoHijo.getInfo() == infoHijo)
//                        {
//                            nodoHijo.setInfocant(nodoHijo.getInfocant() + 1);
//                            NodoExiste = true;
//                            
//                         }
                        
                        nodoHijo = nodoHijo.getAbajo();
                    }
                    
//                    if (!NodoExiste)
//                    {
                        NodoHijo nodoHijoNuevo = new NodoHijo(infoHijo,1);
                        nodoHijo.setAbajo(nodoHijoNuevo);
                    //}
                        
                    //nodoHijo2.setSegundo(nodoHijo2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el nodo Padre.");
            }
        } catch (Exception e) {
            String a = e.getMessage();
        }
    }

    public void mostrarMultiLista() {

        try {
            NodoPadre np = CAB;
            while (np != null) {
                System.out.println("Vertices adyacentes a #     "+(np.getInfo()));

                NodoHijo nodoHijo = np.getAbajo();
               // NodoHijo nodoHijo2 =np.getSegundo();

                if (nodoHijo != null)//Lo utilizamos para el caso de que no tenga nodos hijos
                {
                    while (nodoHijo != null) {
                        System.out.println(" Vertice: " + nodoHijo.getInfo());
                        //System.out.println(" - " + nodoHijo2.getInfo()+ "  Aristas");
                        nodoHijo = nodoHijo.getAbajo();
                        //nodoHijo2=nodoHijo2.getSegundo();
                    }
                }
                np = np.getSig();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public void mostrarPacientes(int info) {
        NodoPadre ej = buscarNodoPadre(info);
         System.out.println(" Vertice " + ej.getInfo());
         

                NodoHijo nodoHijo = ej.getAbajo();
                NodoHijo nodoHijo2=ej.getSegundo();

                if (nodoHijo != null)//Lo utilizamos para el caso de que no tenga nodos hijos
                {
                    while (nodoHijo != null) {
                        System.out.println("---Vertice de adyacencia---" + nodoHijo.getInfo());
                        System.out.println("---Aristas    adyacentes---" + nodoHijo2.getInfo());
                        nodoHijo = nodoHijo.getAbajo();
                        nodoHijo2= nodoHijo2.getSegundo();
                    }
                }
//                ej = ej.getSig();
            }
   
    private int mat[][], cVer;
    public void mat_Ady(int cVertices)
    {
        this.cVer = cVertices;
        this.mat = new int[cVer][cVer];
    }
    public void llenarMat(int f, int c)
    {
     
        if (f != -1  && c!=-1)
        mat[f-1][c-1]+=1;
        
//        do
//        {
//            
//            if(f != -1)
//            {
//                do
//                {
//                    if(c != -1)
//                        mat[f-1][c-1] += 1;
//                    
//                }
//                while(c != -1);
//            }
//        }
//        while(f != -1);
//        
    }
    
    public void mostrar()
    {
        for(int f = 0; f < cVer; f++)
        {
            for(int c=0; c< cVer; c++)
                System.out.print(mat[f][c] + "\t");
            System.out.println();
        }
    }
    public void verticesAdy(int v)
    {
        System.out.println("Vértices adyacentes a " + v + ":");
        v--;
        for(int c = 0; c < cVer; c++)
            if(mat[v][c] != 0)
                System.out.println("Vértice:" + (c+1) + " - Aristas: " +
                         mat[v][c]);
    }
}




