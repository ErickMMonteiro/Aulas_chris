import java.util.ArrayList;
import java.util.Scanner;

public class atv01 {
    public static void main(String[] args) {
        ArrayList<Integer> Array = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int num;
        int maior = 0;
        int menor = 999999999;
        int media;
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor desejado a se adicionar no array: ");
            num = scan.nextInt();
            soma = soma + num;
            Array.add(i, num);


            if (Array.get(i) > maior){
                maior = Array.get(i);
            }

            if (Array.get(i) < menor) {
                menor = Array.get(i);
            }
        }

        media = soma / 5;

        System.out.println(maior);
        System.out.println(menor);
        System.out.println(media);

    }

}