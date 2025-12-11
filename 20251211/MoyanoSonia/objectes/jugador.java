package objectes;

public class jugador {

private String nom;
private int puntuacio;
private int distanciaAcumulada=0;
private int energia=50;
private boolean powerUp;

public jugador(String nom){

    this.nom=nom;
    this.puntuacio=puntuacio;
    this.distanciaAcumulada=distanciaAcumulada;
    this.energia=energia;
    this.powerUp=powerUp;
}

//configurem els get
public String getNom(){ return nom;}
public int getPuntuacio(){ return puntuacio;}
public int getDistanciaAcumulada(){ return distanciaAcumulada;}
public int getEnergia(){ return energia;}
public boolean getPowerUp(){return powerUp;}

//configurem els set

public void setNom(String nom){
    this.nom= nom;
    }
public void setPuntuacio(int puntuacio){
    this.puntuacio= puntuacio;
    } 

public void setDiscanciaAcumulada(int distanciaAcumulada){
    this.distanciaAcumulada=distanciaAcumulada;
    } 

public void setEnergia(int energia){
    this.energia=energia;
    } 
public void setPowerUp(boolean powerUp){
    this.powerUp=powerUp;
    } 
//definim els mètodes

public int correr(){
    if (powerUp==true){
        distanciaAcumulada+=6;
    }
    else{distanciaAcumulada+=3;}
    
    System.out.println("Has avançat "+distanciaAcumulada+" metres");
    for  (int i=0; i<distanciaAcumulada; i++){
    
        System.out.print("-");}
        System.out.println(" ");
    return distanciaAcumulada;
}
public void recollirMoneda (moneda m){

this.puntuacio+=m.getValor();
this.powerUp=m.hasPowerUp();
System.out.println("moneda agafada de "+m.getValor()+"!!! ara tens "+ this.puntuacio );
if (this.powerUp==true){
    System.out.println("Tens el poder actiu" );
}
else {System.out.println("No tens el poder actiu" );}
}

public void xocarObstacle (obstacle o){

this.energia-=o.getDificultat();
this.powerUp=false;
System.out.println("OHHHH!!! t'has trobat:");
if(o.getTipus()=="tren"){
    System.out.println("         ooOOOO");
    System.out.println("        oo      _____");
    System.out.println("       _I__n_n__||_|| ________");
    System.out.println("     >(_________|_7_|-|______|");
    System.out.println("      /o ()() ()() o   oo  oo");

}
else{
    System.out.println("================================");
    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    System.out.println("================================");
}
System.out.println(o.getTipus()+" t'ha fet "+o.getDificultat()+" de mal!!! ara tens "+ this.energia );
System.out.println("S'ha desactivat el poder" );
}

}
