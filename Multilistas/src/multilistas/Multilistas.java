
package multilistas;

import javax.swing.JOptionPane;

public class Multilistas {

    private NodoFather CAB;
    private NodoFather FINAL;
    private NodoSon CABS;
    private NodoSon FINALS;
  
    
    public Multilistas(){
    
    }
    public void AgregarNodoFather(String info){
    
        NodoFather nodofather = new NodoFather(info);
    
        try {
        
            if(CAB == null){
                
                CAB = nodofather;
                FINAL = nodofather;
                CABS = nodofather.getAbajo();
                FINALS = nodofather.getAbajo();
            }else{
                FINAL.setSig(nodofather);
                FINAL = nodofather;
            }
        }
        catch(Exception e){
            
            System.out.println(e.toString());

        }
    }
    public NodoFather BuscarNodoFather(String info){
        
    NodoFather nodofather = CAB;
    
    try{
        
        while(nodofather != null){
            
            if(nodofather.getInfo().equalsIgnoreCase(info)){
                return nodofather;
            }
            nodofather = nodofather.getSig();
     
            }
    }
        catch(Exception e){
            System.out.println(e.toString());
        }
            return null;
      
    }
    
     public NodoSon BuscarNodoSon(String infoPadre, String InfoHijo)
    {
        try{
            NodoFather nodofather = BuscarNodoFather(infoPadre);
            if (nodofather!= null)
            {
                NodoSon nodoson = nodofather.getAbajo();
                try
                {
                while(nodoson != null)
                {
                if (nodoson.getInfo().equalsIgnoreCase(InfoHijo))
                {
                    return nodoson;   
                }
                nodoson= nodoson.getsSig();
                }
                    
                }catch (Exception e) 
                {
            System.out.println(e.toString());
            }
            return null;
            }
       
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
      
    }

    
 public void AgregarNodoSon(String infoFather, String infoSon){
 
        try{
            
                NodoFather np = BuscarNodoFather(infoFather);
               
                if(np != null){
                    
                    NodoSon nodoson = np.getAbajo();
                    NodoSon nodosonnew = new NodoSon(infoSon);
                     CABS = nodosonnew;
                     CABS = nodosonnew.getAbajo();
                    
                    if(np.getAbajo()==null){
                        
                        np.setAbajo(nodosonnew);
                        FINALS.setAbajo(nodoson);                         
                        CABS.setAbajo(nodoson);
                        
                    }else{
                        while(nodoson.getAbajo()!= null){
                            
                            nodoson = nodoson.getAbajo();
                            FINALS.setAbajo(nodoson);
                        }
                        nodoson.setAbajo(nodosonnew);
                    }
                }else{
                
              JOptionPane.showMessageDialog(null,"no existe el nodo padre");
        
        }
            
        }
        catch(Exception e){
            
            System.out.println(e.toString());

        }
        
 
 
 }
 
 public void AgregarNodoSonPaciente(String infoFather,String infoSon,String infoSonPaciente ){
     
     
       try{
             
            
              NodoFather np = BuscarNodoFather(infoFather);
              
               
                if(np != null){
                    
                    NodoSon nodosonpaciente = np.getAbajo();
                    
                    NodoSon nodosonpacientenew = new NodoSon(infoSonPaciente);
                    
                    if(np.getAbajo()==null){
                        
                        np.setAbajo(nodosonpacientenew);
                    }else{
                        while(nodosonpaciente.getAbajo()!= null){
                            
                            nodosonpaciente = nodosonpaciente.getAbajo();
                        }
                        nodosonpaciente.setAbajo(nodosonpacientenew);
                        
                    }
                }else{
                
              JOptionPane.showMessageDialog(null,"no existe el nodo padre");
        
        }
            
        }
        catch(Exception e){
            
            System.out.println(e.toString());

        }
     
 
 }
  public void MostrarMultilista(){
      
      try{
          
          NodoFather np = CAB;
       
          
          while(np!=null)
          {
              System.out.println(np.getInfo());
              NodoSon nodoson = np.getAbajo();
              
                      
              if(nodoson!=null){
                  
                while(nodoson!=null){
                    
                    System.out.println(" - " + nodoson.getInfo());
                    nodoson = nodoson.getAbajo();
                     
                    }
            
                    
                }
                    
                
            
            }
            np = np.getSig();
            
          }
      
      
      catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e.toString());

        }
  
  }
  
    public void Mostrarpacientes(String info){
            
        NodoFather ej = BuscarNodoFather(info);
        System.out.println(ej.getInfo());
        NodoSon nodoson = ej.getAbajo();
        if(nodoson  != null){
            
            while(nodoson  != null){
                
                System.out.println(" - "+nodoson .getInfo());
                nodoson  = nodoson.getAbajo();
                System.out.println(" - "+nodoson .getInfo());
                nodoson  = nodoson.getAbajo();
            }
        
        }
        
        ej = ej.getSig();
    
    }
   
}
