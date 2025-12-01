package coodenadasPunto;

public class punto
{
    private int x;
    private int y;

    public punto(int coordX, int coordY)
    {
        coordX=x;
        coordY=y;
    }

    public void mostrarPunt() 
    {
        System.out.println("Coordenada x: "+ x +"  |||  Coordenada y: "+ y);
        return;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
    public int setX()
    {
        return x;
    }

    public int setY()
    {
        return y;
    }
}