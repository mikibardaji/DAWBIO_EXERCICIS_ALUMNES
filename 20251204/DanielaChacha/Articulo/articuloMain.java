package Articulo;

public class articuloMain 
{
    public static void main(String[] args) 
    {
        Articulo pijama = new Articulo("Pijama", 10, 5);

        System.out.println("Nombre: " + pijama.getNombre());
        System.out.println("Precio: " + pijama.getPrecio() + " euros");
        System.out.println("IVA: " + (pijama.getIva() * 100) + "%");
        System.out.println("Unidades restantes: " + pijama.getRestante());

        pijama.setPrecio(12);
        pijama.setRestante(8);

        System.out.println("Después de actualizar----");
        System.out.println("Precio: " + pijama.getPrecio() + " euros");
        System.out.println("Unidades restantes: " + pijama.getRestante());

    }
}