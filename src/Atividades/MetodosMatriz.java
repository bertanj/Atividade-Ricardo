package Atividades;

import java.util.Scanner;

public class MetodosMatriz {
    public static int[] criarDimensao(){
        int [] dimensao = new int[2];
        int linha, coluna;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite a dimensão de sua matriz (linha):");
            linha = scanner.nextInt();
            System.out.println("Digite a dimensão de sua matriz (coluna):");
            coluna = scanner.nextInt();
        }while(linha < 1 || coluna < 1);

        dimensao[0] = linha;
        dimensao[1] = coluna;

        return dimensao;
    }

    public static void preencherMatriz(int [] dimensao, int [] [] matriz){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < dimensao[0]; i++) {//linhas
            for (int j = 0; j < dimensao[1]; j++) {//colunas
                System.out.println("Preencha os valores da matriz . Qual será o valor da linha " + (i + 1) + " coluna " + (j + 1) + "?");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void exibirMatriz(int [] dimensao, int [][] matriz){
        for (int i = 0; i < dimensao[0]; i++) {
            for (int j = 0; j < dimensao[1]; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void buscarValor(int [] dimensao, int [][] matriz){
        boolean encontrado = false;
        int cont = 0;
        int busca;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual número deseja buscar na matriz:");
        busca = scanner.nextInt();

        for (int i = 0; i < dimensao[0]; i++) {
            for (int j = 0; j < dimensao[1]; j++) {
                if(busca == matriz [i][j]){
                    encontrado = true;
                    cont++;
                }
            }
        }

        if(!encontrado){
            System.out.println("O valor "+ busca+ " não foi encontrado na matriz.");
        }else{
            System.out.println("O valor "+ busca + " foi encontrado na matriz "+ cont + " vezes.");
        }
    }

    public static void contarParImpar(int [] dimensao, int [][] matriz){
        int contadorp = 0, contadori = 0;

        for (int i = 0; i < dimensao[0]; i++) {
            for (int j = 0; j < dimensao[1]; j++) {
                if(matriz [i] [j] % 2 == 0){
                    contadorp++;
                }else{
                    contadori++;
                }
            }
        }
        System.out.println("A matriz contém "+ contadorp+" números par e "+contadori+ " números ímpar");
    }

    public static void somarMatriz(int [] dimensao, int [][] matriz){
        int soma=0;

        for (int i = 0; i < dimensao[0]; i++) {//representa a linha da matriz
            for (int j = 0; j < dimensao[1]; j++) {//representa coluna da matriz
                soma+= matriz[i][j];
            }
        }
        System.out.println("A soma dos valores da matriz tem o valor de: " + soma);
    }

    public static void multiplicarMatriz(int []dimensao, int [][] matriz){
        int multiplicacao = 1;

        for (int i = 0; i < dimensao[0]; i++) {//representa a linha da matriz
            for (int j = 0; j < dimensao[1]; j++) {//representa coluna da matriz
                multiplicacao*= matriz[i][j];
            }
        }
        System.out.println("A multiplicação dos valores da matriz tem o valor de: " + multiplicacao);
    }

    public static void exibirParMatriz(int [] dimensao, int [][]matriz){
        System.out.println("Exibindo valores par da matriz");
        for (int i = 0; i < dimensao[0]; i++) {
            for (int j = 0; j < dimensao[1]; j++) {
                if(matriz [i] [j] % 2 == 0){
                    System.out.print(matriz[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void exibirImparMatriz(int [] dimensao, int [][]matriz){
        System.out.println("Exibindo valores ímpar da matriz");
        for (int i = 0; i < dimensao[0]; i++) {
            for (int j = 0; j < dimensao[1]; j++) {
                if(matriz [i] [j] % 2 == 0){
                    System.out.print(" ");
                }else{
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] matriz;
        int [] dimensao;


        dimensao = criarDimensao();
        matriz = new int[dimensao[0]][dimensao[1]];
        preencherMatriz(dimensao, matriz);
        exibirMatriz(dimensao,matriz);
        buscarValor(dimensao, matriz);
        contarParImpar(dimensao,matriz);
        somarMatriz(dimensao, matriz);
        multiplicarMatriz(dimensao, matriz);
        exibirParMatriz(dimensao, matriz);
        exibirImparMatriz(dimensao, matriz);
    }
}
