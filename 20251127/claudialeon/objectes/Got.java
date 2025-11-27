package objectes;


public class Got {
    public int capacitat;
    private int diametro;
    private int liquido;
    private String material;


    public Got(){
        capacitat=10;
        diametro=5;
        material="Vidre";
        //liquido=0
    }
    public Got(int capacitat){
        this.capacitat=10;
        diametro=5;
        material="Plastic";
       
    }
    public void afegirliq(int liqañadit) {
    if (liqañadit <= 0) {
        System.out.println("La quantitat ha de ser positiva (superior a 0)!");
        return;
    }

    int espaiDisponible = capacitat - liquido;

    if (espaiDisponible <= 0) {
        System.out.println("El got ja esta ple...");
        return;
    }

    if (liqañadit <= espaiDisponible) {
        liquido += liqañadit;
    } else {
        liquido = capacitat;
        System.out.println("S'ha afegit: " + espaiDisponible + " ml de liquid");
    }
}
    public void plenar(){
        liquido= capacitat;
    }
    public int verter(){
        int vertido;
        if(liquido<=0){
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
    public int getLiquido(){
        return liquido;
    }
    public String getMaterial(){
        return material;
    }
   
    public void setCapacitat(int capacitat){
        if (capacitat>0){
            this.capacitat=capacitat;
        }
        else{
            System.out.println("Capacitat que m'has pasat ha de ser positiva" + capacitat);
        }
    }
    public void setLiquido (int liquido){
        if( liquido>0 &&  liquido<=capacitat){
            this.liquido=liquido;
        }
        else{
            System.out.println("No puedo poner esta cantidad de liquido " +  liquido);
        }
    }
   
   


}

