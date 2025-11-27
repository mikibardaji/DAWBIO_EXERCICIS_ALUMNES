package Objectes;

public class Got {
    //Definir atributos botella
    private int capacidad;
    private String Material;
    private Double Diametro; 
    private int liquido;
    private int diametro;

 public int getCapacidad() {
        return capacidad;
    }
    public String getMaterial() {
        return Material;
    }
    public double getDiametro() {
        return diametro;
    }
    public int getLiquido() {
        return liquido;
    }
    public void setCapacidad(int nova_capacidad) {
        if(nova_capacidad>0){
            capacidad = nova_capacidad;
        }
        else{
            System.out.println("No puedo poner esta cantidad de liquido");
        }
    }
    public void setLiquido (int nou_liquido){
        if(nou_liquido>=0 && liquido<= capacidad){
            this.liquido = nou_liquido;
        }
        else{
            System.out.println("No puedo poner esta cantidad de liquido");
        }
    }
}
