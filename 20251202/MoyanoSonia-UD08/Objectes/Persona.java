package Objectes;

public class Persona {
    //atribut 'persona'
    private String nom, cognoms, dni;
    private int edat;
    //constructor per inicialitzar l'atribut
    public Persona (String nom, String cognoms, String dni, int edat) {
        this.nom= nom;
        this.cognoms= cognoms;
        this.dni = dni;
        this.edat= edat;
    }

    public String getNom(){
        return nom;
    }
    public String getCognoms(){
        return cognoms;
    }
    public String getDni(){
        return dni;
    }
    public int getEdat(){
        return edat;
    }
    public void setNom(String nom){
        this.nom= nom;
    }
    public void setCognoms(String cognoms){
        this.cognoms= cognoms;
    }
    public void setDni(String dni){
        this.dni= dni;
    }
        public void setEdat(int edat){
        this.edat= edat;
    }

    //mètode per mostrar les dades de persona
    
        public void mostrarPersona(){
        System.out.println(nom+" "+cognoms+" amb Dni "+dni );
        }

        public boolean esMajorEdat() {
        if (edat>=18){
        System.out.println("És major d'edat" );
        return true;
        }
        else{
        System.out.println("No és major d'edat" );
        return false;
        }
        
    }
        public boolean esJubilat() {
        if (edat>=65){
        System.out.println("Està jubilat" );
        return true;
        }
        else{
        System.out.println("No està jubilat" );
        return false;
        }
        
    }
        public int diferenciaEdat(Persona p){
        int diferencia = this.edat - p.edat;
        return  Math.abs(diferencia);
        }
}


