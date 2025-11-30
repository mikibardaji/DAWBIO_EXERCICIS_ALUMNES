package Objectes;

public class Punt {
    //atribut 'punt'
    private int x,y;
    //constructor per inicialitzar l'atribut
    public Punt (int x, int y) {
        this.x = x;
        this.y = y;
    }
    //mètode per mostrar el punt de coordenades
    public void mostrarPunt() {
        System.out.println("x: "+x +"    | y: "+y );
        return;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x= x;
    }
    public void setY(int x){
        this.y= x;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    public double distancia(Punt p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
