package Atividades;

import java.util.Scanner;

public class DescontoProduto {
    public static void main(String[] args) {
        int escolha;
        double preco=100, pDesconto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha sua forma de pagamento.");
        System.out.println("1- À vista em dinheiro ou cheque, recebe 10% de desconto");
        System.out.println("2- À vista no cartão de crédito, recebe 15% de desconto");
        System.out.println("3- Em duas vezes, preço normal de etiqueta sem juros ");
        System.out.println("4- Em três vezes, preço normal de etiqueta mais juros de 10%");
        escolha = scanner.nextInt();

        while(escolha < 1 || escolha > 4){
            System.out.println("Insira um código válido:");
            escolha = scanner.nextInt();
        }

        switch (escolha) {
            case 1:
                pDesconto = (preco - preco*0.10);
                System.out.println("O produto com desconto tem o valor de: R$"+ pDesconto);
                break;
            case 2:
                pDesconto = (preco - preco*0.15);
                System.out.println("O produto com desconto tem o valor de: R$"+ pDesconto);
                break;
            case 3:
                pDesconto = preco/2;
                System.out.println("A parcela do produto em 2x tem o valor de: R$"+ pDesconto);
                break;
            case 4:
                pDesconto = (preco + preco*0.10)/3;
                System.out.println("A parcela do produto em 3x tem o valor de: R$"+ pDesconto);
                break;
        }
    }
}
