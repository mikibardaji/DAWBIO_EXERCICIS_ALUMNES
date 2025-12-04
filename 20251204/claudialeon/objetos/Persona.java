package objetos;

public class Persona {
    private String dni;
    private String nom;
    private String cognoms;
    private int edat;

    public Persona(String dni, String nom, String cognoms, int edat) {
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
}
    public String getDni() {
        return dni;
    }
    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public int getEdat() {
        return edat;
    }

    public void setDni(String nouDni) {
        dni = nouDni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    

    public void setEdat(int novaEdat) {
        edat = novaEdat;
    }

    public void mostrarPersona() {
        System.out.println(" / DNI " + dni + " / Nom: " + nom + " / Cognom: " + cognoms + " / edad: " + edat);
    }

     public boolean esJubilat() {
        if(edat>=65){
            return true;
        }
        else
            return false;
       
    }

    public boolean esMajorEdat() {
        if (this.edat>=18){
            return true;
        }
        else{
            return false;
        }
       
    }

    public int diferenciaEdat(Persona altre) {
        return Math.abs(edat - altre.edat);
    }
    public static boolean validarDNI(String dni) {
        if (dni == null) return false;
        dni = dni.trim();
        if (dni.length() != 9) return false;
        String nums = dni.substring(0, 8);
        char letra = dni.charAt(8);
    
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(nums.charAt(i))) return false;
        }
     
        if (!Character.isLetter(letra)) return false;
        return true;
    }
}

