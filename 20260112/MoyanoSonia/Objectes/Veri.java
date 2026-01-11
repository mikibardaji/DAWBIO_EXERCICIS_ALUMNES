package Objectes;

public final class Veri extends Pokemon {
private boolean defensa;


public Veri(){
super();
this.lp=50;
defensa=false;
}

public Veri (LlistaNom nom){
super(nom);
this.lp=50;
defensa=false;

}

@Override
protected double aplicarAtributs (double dany){
if (lp < 15) {
        defensa=true;
    }
if (defensa){
    System.out.println("Defensa de " + getNom() + " activada dany reduit a la meitat");
    return dany/2;
}
return dany;
}

}
