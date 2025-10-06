import java.util.Scanner;

public class Ex1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int animal;

        System.out.println("Que animal tienes en casa? ");
        System.out.println("0- Gato");
        System.out.println("1- Perro");
        System.out.println("2- Conejo");
        System.out.println("3- Pez");
        System.out.println("4- Hámster");
        animal = sc.nextInt();

        if (animal==0)
        {
            System.out.println("Un dato curioso sobre los gatos es que su nariz es única para cada individuo, similar a la huella dactilar humana, permitiendo su identificación");
        }
        else if (animal==1)
        {
            System.out.println("Un dato curioso es que los perros pueden detectar enfermedades como el cáncer y cambios en los niveles de azúcar en sangre, además de percibir emociones humanas a través de cambios en la voz y el lenguaje corporal");
        }
        else if (animal==2)
        {
            System.out.println("Un dato curioso del conejo es que, a diferencia de los roedores, son lagomorfos y se comen sus heces nocturnas para reabsorber nutrientes y mantener su salud digestiva");
        }
        else if (animal==3)
        {
            System.out.println("Un dato curioso es que, a pesar de la creencia popular, los peces tienen memoria");
        }
        else if (animal==4)
        {
            System.out.println("Un dato curioso es que Los hámsteres son roedores nocturnos con dientes que no dejan de crecer");
        }
        else
        {
            System.out.println("Mascota no válida, inténtelo de nuevo!");
        }

    } 
}
