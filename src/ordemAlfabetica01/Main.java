package ordemAlfabetica01;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Vetor vet = new Vetor();

        System.out.println("Coloque 10 nomes aqui:");

        for (int i = 0; i < vet.getArray().length; i++) {
            vet.getArray()[i] = scan.nextLine();
        }

        System.out.println();
        System.out.println("Nomes em ordem alfabética: ");

        vet.ordernarArray(vet.getArray());

        scan.close();
    }
}