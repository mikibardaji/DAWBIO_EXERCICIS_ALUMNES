package objetos;

public class exbotella
{
    private double Diametro;
    private boolean tapon;
    private int capacidad;
    private int liquido;
    private String material;

    public boolean obrirse (){
        tapon=false;
        return true;
    }

    public void tancar ()
    {
        tapon=true;
    }
   public void llenar ()
   {
    liquido=capacidad;
   }
   public double  verter()
   {
    return Diametro;
   }
   

 
}
