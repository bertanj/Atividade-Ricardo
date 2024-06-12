package Atividades;

import java.util.Scanner;

public class VetoresOuArrays {
    public static void main(String[] args) {
        int tamanho= 5, soma = 0;
        int [] vet1 = new int [tamanho];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tamanho; i++) {
            vet1 [i] = scanner.nextInt();

        }

        for (int i = 0; i < tamanho; i++) {
            System.out.println(vet1[i]);
            soma += vet1[i];
        }
        System.out.println(soma);


    }
}
