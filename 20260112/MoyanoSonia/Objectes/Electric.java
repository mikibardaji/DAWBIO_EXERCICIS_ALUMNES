package Objectes;

public final class Electric extends Pokemon{
private int superAtac;

public Electric(){
super();
this.lp=35;
this.superAtac=2;
}
public Electric (LlistaNom nom){
super(nom);
this.lp=35;
this.superAtac=2;

}

@Override
public int atac(){

int dany=super.atac();
dany+=superAtac;

System.out.println("Atac incrementat de " + getNom() + "amb una nova força de:" + dany);

return dany;
}



}