import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ida = 0;
        int idm = 0;
        int idd = 0;
        int idTotal = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade primeiro quantos anos depois quantos mes e por ultimo quantos dias de vida: ");
      
        System.out.printf("Digite quantos anos: ");
        ida = scanner.nextInt();
      
        System.out.printf("Digite quantos meses: ");
        idm = scanner.nextInt();
      
        System.out.printf("Digite quantos dias: ");
        idd = scanner.nextInt();


        ida = ida * 365;
        idm = idm * 30;

        idTotal = ida + idm + idd;

        System.out.println("Sua idade em dias é: " + idTotal);
    }
}
