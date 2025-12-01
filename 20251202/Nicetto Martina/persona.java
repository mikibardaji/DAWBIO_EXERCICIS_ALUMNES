package objetos;

public class persona {
    private int dni;
    private String nombre;
    private String apellidos;
    private int edad;
//constructor
    public persona(int dni, String nombre, String apellidos, int edad) {
        this.dni=dni;
        this.apellidos=apellidos;
        this.edad=edad;
        this.nombre=nombre;
    }

    public void setdni(int dni)
    {
        this.dni=dni;
    }
    public void setapellidos(String apellidos)
    {
        this.apellidos=apellidos;
    }
    public void setedad(int edad)
    {
        this.edad=edad;
    }
    public void setnombre(String nombre)
    {
        if(nombre==null)
        {
        this.nombre=nombre;
        }
        
    }    

    public int getdni()
    {
        return dni;
    }
        public String getapellidos()
    {
        return apellidos;
    }
    public int getedad()
    {
        return edad;
    }
    public String getnombre()
    {
        return nombre;
    }   
     
    public boolean esMayor() {
        return edad >= 18;
    }

    public void resultado() {
        System.out.println("Nombre y apellidos" + nombre + " " + apellidos);
        System.out.println("Il dni es" + dni);
        System.out.println("Edad: " + edad);
    }

     public boolean esMajorEdad() {
        if (edad>=18){
        System.out.println("És major d'edat" );
        return true;
        }
        else{
        System.out.println("No és major d'edat" );
        return false;
        }
        
    }
        public boolean esJubilat() {
        if (edad>=65){
        System.out.println("Està jubilat" );
        return true;
        }
        else{
        System.out.println("No està jubilat" );
        return false;
        }

 public int diferenciaEdad(persona p){
        int diferencia = this.edad - p.getedad();
        return  diferencia;
        }
}
