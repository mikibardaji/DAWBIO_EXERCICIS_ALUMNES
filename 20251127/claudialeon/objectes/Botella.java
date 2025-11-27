package objectes;


public class Botella {
    public int capacitat;//cambiem a public per al main
    private int diametro;
    private boolean tapon;
    private int liquido;
    private String material;
//contructor vuit que fa botellas con estas caracteristiques
    public Botella(){
        capacitat=25;
        diametro=3;
        tapon=true;
        material="Plastic";
        liquido=0;
    }
    public Botella(int n_capacitat, int diametro){
        capacitat=n_capacitat;
        this.diametro=diametro;
        tapon=true;
        material="Vidre";
        liquido=0;
    }
    public void obrir(){
        tapon=false;
    }
    public void tancar(){
        tapon=true;
    }
    public void plenar(){
        liquido= capacitat;
    }
    public int verter(){
        int vertido;
        if(liquido<=0){
            vertido= 0;
        }
        else if (tapon==true){
           vertido= 0;
        }
        else if (liquido<diametro){
            vertido = liquido;
            liquido=0;
        }
        else{
            liquido-=diametro;
            vertido=diametro;
        }
        return vertido;
    }
   
    public int getCapacitat(){
        return capacitat;
    }
    public int getdiametro(){
        return diametro;
    }
    public boolean isTapon(){
        return tapon;
    }
    public int getLiquido(){
        return liquido;
    }
    public String getMaterial(){
        return material;
    }
   
    public void setCapacitat(int nova_capacitat){
        if (nova_capacitat>0){
            capacitat=nova_capacitat;
        }
        else{
            System.out.println("Capacitat que m'has pasat ha de ser positiva" + nova_capacitat);
        }
    }
    public void setLiquido (int nuevo_liquido){
        if(nuevo_liquido>0 && nuevo_liquido<=capacitat){
            liquido=nuevo_liquido;
        }
        else{
            System.out.println("No puedo poner esta cantidad de liquido " + nuevo_liquido);
        }
    }
   


}

