
package ampollla;

public class got {
    private double diametro;
    private double capacidad;
    private double liquido;
    private String material;
    

    public got(double diametro, double capacidad, double liquido, String material) {
        this.diametro = diametro;
        this.capacidad = capacidad;
        this.liquido = liquido;
        this.material = material;
    }
    
    public got(){
    }
    

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        if(capacidad > 0){
           this.capacidad = capacidad; 
        }
        else{
            System.out.println("ERROR CAPACIDAD");
        }
        
    }

    public double getLiquido() {
        return liquido;
    }

    public void setLiquido(double liquido) {
        if(capacidad <= liquido && liquido > 0){
            this.liquido = liquido;
        }
        else{
            System.out.println("ERROR LIQUIDO");
        }
        
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void plenar(){
        liquido = capacidad;
    }
    
    public double vertre(){
        return diametro;
    }
}