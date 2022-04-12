package multilistas;

public class NodoHijo 
{
    private int infocant;
    private int info;
    private NodoHijo abajo;
    private NodoHijo segundo;
    
    public NodoHijo()
    {
        abajo = null;
        segundo= null;
    }
    public NodoHijo(int info, int infocant)
    {
        this.infocant= infocant;
        this.info = info;
        this.abajo = null;
        this.segundo= null;
    }
    public void setInfo(int info)
    {
        this.info = info;
    }
    public int getInfo()
    {
        return info;
    }
    public NodoHijo getAbajo()
    {
        return abajo;
    }
    public void setAbajo(NodoHijo abajo)
    {
        this.abajo = abajo;
    }
    
    public NodoHijo getSegundo()
    {
        return segundo;
    }
    public void setSegundo(NodoHijo segundo)
    {
        this.segundo = segundo;
    }
    public void setInfocant(int infocant)
    {
        this.infocant = infocant;
    }
    public int getInfocant()
    {
        return infocant;
    }
}
