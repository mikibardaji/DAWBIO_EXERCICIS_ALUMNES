package Objetos;

public class Got {
    
    private int capacidad, liquido, diametro;
    private String material;


    public int getCapacidad() {
        return capacidad;
    }

    public int getLiquido() {
        return liquido;
    }

    public int getDiametro() {
        return diametro;
    }

    public String getMaterial() {
        return material;
    }

    public void setLiquido (int nou_liquido){
        if(nou_liquido>=0 && liquido<= capacidad){
            liquido = nou_liquido;
        }
        else{
            System.out.println("No puedo poner esta cantidad de liquido");
        }
    }

    public void plenar(int entrada) {
    if (entrada <= 0) {
        System.out.println("Debe ser positivo");
        return;
    }

    int posible = liquido + entrada;

    if (posible <= capacidad) {
        liquido = posible;
        System.out.println("Afegits " + entrada + " de líquid.");
    } 
    else {
        int espai = capacidad - liquido;

        System.out.println("El got ja està ple.");
        }
    }

    
}
