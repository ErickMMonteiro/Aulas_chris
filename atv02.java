import java.util.ArrayList;
import java.util.Scanner;

public class atv02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> T = new ArrayList<>();

        System.out.println("Digite os valores");

        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            A.add(numero);
            T.add(numero * 3);
        }

        for (int num : A)
        {
            System.out.print(num + " ");
        }
        for (int num :T)
        {
            System.out.print(num + " ");
        }
    }
}
