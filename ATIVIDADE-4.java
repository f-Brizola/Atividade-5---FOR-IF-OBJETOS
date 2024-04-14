import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num = 0; 
        int num1 = 0; 
        int num2 = 0; 
        int num3 = 0; 

        int [] vetor = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int x = 0; x < vetor.length; x++) {

            num = num + 1;

            System.out.println("Digite um valor: ");
            vetor[x] = scanner.nextInt();
        }

        for (int x = 0; x < vetor.length; x++) {

            if (vetor[x] >= 0 && vetor[x] <= 100) {
                num1 = num1 + 1;
            } else if (vetor[x] >= 101 && vetor[x] <= 200) {
                num2 = num2 + 1;
            }else if (vetor[x] > 200) {
                num3 = num3 + 1;
            }
        }

        System.out.println(num1 + " - Entre 0 e 100");
        System.out.println(num2 + " - Entre 101 e 200");
        System.out.println(num3 + " - Maior que 200");

    }
}
