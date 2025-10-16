import java.util.Scanner;

public class ex9 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int pulsacions;
int total = 0;

for (int i = 1; i <= 5; i++) {
System.out.print("Introdueix pulsacions minut " + i + ": ");
pulsacions = sc.nextInt();
total += pulsacions;
}

double mitjana = total / 5.0;
System.out.println("Mitjana = " + mitjana + " bpm");
}
}