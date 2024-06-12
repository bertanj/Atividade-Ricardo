package AtividadesEntrega;

import java.util.Scanner;

public class AttEntrega1 {
    public static void main(String[] args) {
        int tamanho;
        int soma = 0 ;
        int maior, menor;
        int troca1, troca2, aux, aux2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de vetores que o sistema terá:");
        tamanho = scanner.nextInt();

        int [] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {//escaneando o valor de cada vetor
            System.out.println("Digite o valor do vetor "+(i+1)+":");
            vetor[i] = scanner.nextInt();
        }
        maior = vetor[0];
        menor = vetor[0];

        for (int i = 0; i < tamanho; i++) {//Efetuando a soma dos vetores

            soma += vetor[i];
        }
        System.out.println("Os valores somados tem o valor final de: "+soma); //soma
        System.out.println("A média dos valores tem o valor final de: "+(soma/tamanho));//media dos vetores

        for (int i = 0; i < tamanho; i++) {
            if(maior < vetor[i]){
                maior = vetor[i];
            }
        }
        System.out.println("O maior valor inserido nos vetores é: "+ maior);

        for (int i = 0; i < tamanho; i++) {
            if(menor > vetor[i]){
                menor = vetor[i];
            }
        }
        System.out.println("O menor valor inserido nos vetores é: "+ menor);

        System.out.println("Escolha um vetor para trocar o valor");
        troca1 = scanner.nextInt();
        System.out.println("Escolha outro vetor para trocar o valor");
        troca2 = scanner.nextInt();


        while(troca1 < 0 || troca1 > tamanho || troca2 < 0 || troca2 > tamanho){//verificação se os valores estão dentro do indice
            System.out.println("Insira um valor entre 1 e "+tamanho);
            System.out.println("Escolha um vetor para trocar o valor");
            troca1 = scanner.nextInt();
            System.out.println("Escolha outro vetor para trocar o valor");
            troca2 = scanner.nextInt();
            troca1--;
            troca2--;
        }
        troca1--;//deixando o valor dentro do indice 0 e tamanho
        troca2--;
        aux = troca1;
        aux2 = troca2;
        System.out.println("Qual valor deseja inserir no vetor "+(aux+1));
        vetor[troca1] = scanner.nextInt();
        System.out.println("Qual valor deseja inserir no vetor "+(aux2+1));
        vetor[troca2] = scanner.nextInt();
        System.out.println("A primeira troca recebeu o valor "+vetor[troca1]);
        System.out.println("A segunda troca recebeu o valor "+vetor[troca2]);

        soma=0;
        for (int i = 0; i < tamanho; i++) {//Efetuando a soma dos vetores2

            soma += vetor[i];
        }
        System.out.println("Os valores somados tem o valor final de: "+soma); //soma2
        System.out.println("A média dos valores tem o valor final de: "+(soma/tamanho));//media dos vetores2



    }
}
