package Objectes;
import java.util.Random;

public abstract class Pokemon implements AccionesCombate{
protected final LlistaNom nom;
protected double lp;
protected boolean viu;

protected Pokemon(){
this.nom=LlistaNom.PIKACHU;
this.viu=true;
}
protected Pokemon (LlistaNom nom) {
this.nom=nom;
this.viu=true;
}

//getts

    public LlistaNom getNom() {
        return nom;
    }

    public double getLp(){
        return lp;
    }

    public boolean isViu(){
        return viu;
    }


//metodes



    public int atac()
    {
        Random rd=new Random();
        int cop= rd.nextInt(0,11);
        System.out.println("");
        System.out.println("Atac de " + getNom() + " amb una força de: " + cop);
    return  cop;
    }
    public void rebreImpacte(Pokemon atacant){

    int cop = atacant.atac();

    double dany = aplicarModificador(atacant, cop);

    dany = aplicarAtributs(dany);

    if (lp<dany){viu=false;}

    lp -= dany;

    if (lp <= 0) {
        lp = 0;
        viu = false;
    }

    mostrarEstatPokemon();
}

protected double aplicarModificador(Pokemon atacant, int dany) {

    if (this instanceof Electric && atacant instanceof Aigua) return (double)(dany * 0.75);
    if (this instanceof Veri && atacant instanceof Electric) return (double)(dany * 0.75);
    if (this instanceof Aigua && atacant instanceof Veri) return (double)(dany * 0.75);

    return dany;
}

protected double aplicarAtributs (double dany){

return dany;
}


public void mostrarEstatPokemon (){
System.out.println(" ");
System.out.print(getNom() + " " +getLp() +" LP " );
if (isViu()==true){System.out.print(" viu");}
else{System.out.print(" mort");}

for  (int i=0; i<=getLp(); i++){
    
        System.out.print("=" );
    }
}
}