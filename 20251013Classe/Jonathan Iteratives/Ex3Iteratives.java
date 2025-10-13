import java.util.Scanner;

public class Ex3Iteratives {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número natural N: ");
		int N = sc.nextInt();

		int i = 2;
		System.out.println("Números parejos entre 1 i " + N + ":");
		while (i <= N) {
			System.out.println(i);
			i += 2;
		}
	}
}

