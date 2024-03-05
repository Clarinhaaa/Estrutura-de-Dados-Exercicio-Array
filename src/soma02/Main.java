package soma02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vetor vet = new Vetor();

        System.out.println("Coloque 10 números aqui:");

        for (int i = 0; i < vet.getArray().length; i++) {
            vet.getArray()[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("Resultado da soma de todos os números: " + vet.somarArray(vet.getArray()));

        scan.close();
    }
}