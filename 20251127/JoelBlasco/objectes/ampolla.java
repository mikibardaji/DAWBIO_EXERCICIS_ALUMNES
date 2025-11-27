/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectes;

/**
 *
 * @author jbl3198
 */
public class ampolla {
    private double diametro;
    private boolean tapon;
    private double capacidad;
    private double liquido;
    private String material;
    
    //CONSTRUCTOR

    public ampolla(double diametro, boolean tapon, double capacidad, double liquido, String material) {
        this.diametro = diametro;
        this.tapon = tapon;
        this.capacidad = capacidad;
        this.liquido = liquido;
        this.material = material;
    }
    
    public ampolla(){
        diametro = 3.25;
        tapon = true;
        capacidad = 500;
        liquido = 300;
        material = "Plastico";
    }
    
    
    //GETTERS
    public double getCapacidad(){
        return capacidad;
    }
    
    public double getDiametro(){
        return diametro;
    }

    public boolean isTapon() {
        return tapon;
    }

    public double getLiquido() {
        return liquido;
    }

    public String getMaterial() {
        return material;
    }
    
    //SETTERS
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setTapon(boolean tapon) {
        this.tapon = tapon;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    /**
     * Quitar el tapon
     */
    public void obrir(){
        tapon = false;
    }
    
    /**
     * Poner el tapon
     */
    public void tancar(){
        tapon = true;
    }
    
    /**
     * Llenar la botella
     */
    public void plenar(){
        liquido = capacidad;
    }
    
    public double vertre(){
        double vertido;
        if(liquido <= 0){
            vertido = 0;
        }
        else if(tapon == true){
            vertido = 0;
        }
        else if(liquido < diametro){
            vertido = liquido;
            liquido = 0;
        }
        else{
            liquido -= diametro;
        }
        return diametro;
    }
    
    
    
    
}

