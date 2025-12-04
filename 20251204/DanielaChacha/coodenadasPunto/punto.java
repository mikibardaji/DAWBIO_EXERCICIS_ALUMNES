package coodenadasPunto;

import java.util.Random;

public class punto
{
    private int x;
    private int y;
    
    public punto(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }

    public int getY() 
    {
        return y;
    }
    
    public void setX(int x)
    {
        if (x >= 0)
        {
            this.x = x;
        }
        else
        {
            System.out.println("X negativa no valida");
        }
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public void imprime()
    {
        System.out.println("Coordenadas: (" + this.x + ", " + this.y + ")");
    }
    
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void desplaza(int dx, int dy) 
    {
        this.x += dx;
        this.y += dy;
    }
    
    public double distancia(punto p)
    {
        int dif_x  = this.x - p.getX();
        int dif_y  = this.y - p.getY();
        int suma2  = (dif_x*dif_x) + (dif_y*dif_y);
        double  suma = Math.pow(dif_x, 2)+ Math.pow(dif_y, 2);
        return Math.sqrt(suma);
        
    }

    /*crea un objeto punto, con sus coordenadas x e y aleatorias entre 0 y 100*/
    public static punto crearPuntoAleatorio()
    { //static es un metodo que se podra llamar "solo" sin variable asociada
        Random rd = new Random();
        int nx = rd.nextInt(0, 101);
        int ny = rd.nextInt(0, 101);
        punto p = new punto(nx, ny);
        return p;
    }
}