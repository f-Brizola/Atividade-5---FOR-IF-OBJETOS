import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int y = 0; 
        int z = 0; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        y = scanner.nextInt();

        z = y;

        for (int x = y; x >= 1; x--) {

            z = z - 1;

            System.out.println(x +" patinhos foram passear Além das montanhas Para brincar A mamãe gritou: Quá, quá, quá, quá");

            if ( z >= 1) {
                System.out.println("Mas só " + z + " patinhos voltaram de lá");
            } else if (z == 0) {
                System.out.println("Mas nunhum patinho voltou de lá");
            }
        }

        System.out.println(" A mamãe patinha foi procurar Além das montanhas Na beira do mar A mamãe gritou: Quá, quá, quá, quá E os " + y + " patinhos voltaram de lá.");

    }
}
