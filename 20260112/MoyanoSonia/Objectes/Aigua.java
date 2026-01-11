package Objectes;

public class Aigua extends Pokemon{
private int corassa;

public Aigua(){
super();
this.lp=35;
this.corassa=3;
}
public Aigua (LlistaNom nom){
super(nom);
this.lp=35;
this.corassa=3;

}


@Override
protected double aplicarAtributs (double dany){
if (corassa > 0) {
        corassa--;
        return 0;
    }
return dany;
}

}
