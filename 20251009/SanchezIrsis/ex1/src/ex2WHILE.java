import java.util.Scanner;
public class ex2WHILE {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int dosi = 0;
System.out.println("Quantes dosis necessites? ");
dosi = sc.nextInt();
do
{
    System.out.println("Dosis administrada t'en falten: " + (dosi-1) + "...");
    dosi--;
}
while (dosi!=0);
System.out.println("Ja estas curat! :)");
}
}
