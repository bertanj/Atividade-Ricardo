package Atividades;

import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        int codigo, qtd;
        String nome, confirm;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:"); //Deixei fora do escopo 'do' para perguntar o nome somente uma vez
        nome = scanner.next();

        do {


            System.out.println("Digite o código do produto que queira adquirir:");
            System.out.println("Especificação       |     Código      |     Preço");
            System.out.println("Cachorro quente  |     100            |       15,00");
            System.out.println("Bauru simples      |     101            |       10,00");
            System.out.println("Bauru com ovo     |     102            |       12,00");
            System.out.println("Hambúrger           |      103            |       15,00");
            System.out.println("Cheeseburguer    |      104            |       16,00");
            codigo = scanner.nextInt();
            System.out.println("Digite a quantidade que deseja");
            qtd = scanner.nextInt();


            switch (codigo) {
                case 100:
                    System.out.println("Olá," + nome + "!" + " Como você pediu " + qtd + " cachorro quente o valor total fica = " + 15 * qtd);
                    break;
                case 101:
                    System.out.println("Olá," + nome + "!" + " Como você pediu " + qtd + " bauru simples o valor total fica = " + 10 * qtd);
                    break;
                case 102:
                    System.out.println("Olá," + nome + "!" + " Como você pediu " + qtd + " bauru com ovo o valor total fica = " + 12 * qtd);
                    break;
                case 103:
                    System.out.println("Olá," + nome + "!" + " Como você pediu " + qtd + " hamburguer o valor total fica = " + 15 * qtd);
                    break;
                case 104:
                    System.out.println("Olá," + nome + "!" + " Como você pediu " + qtd + " cheeseburguer o valor total fica = " + 16 * qtd);
                    break;
            }
            System.out.println("Deseja pedir algo mais? (sim/nao)");
            confirm = scanner.next();
        }while(confirm.equals("sim"));

    }
}
