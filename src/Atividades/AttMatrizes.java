package Atividades;

import java.util.Scanner;

public class AttMatrizes {

    public static void main(String[] args) {
        int linha, coluna, busca, contadorp = 0, contadori = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a dimensão de sua matriz (linha):");
        linha = scanner.nextInt();
        System.out.println("Digite a dimensão de sua matriz (coluna):");
        coluna = scanner.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Preencha os valores da matriz. Qual será o valor da linha " + (i + 1) + " coluna " + (j + 1) + "?");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < linha; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna; j++) {//representa coluna da matriz
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("Digite um número que queira buscar dentro da matriz:");
        busca = scanner.nextInt();

        for (int i = 0; i < linha; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna; j++) {//representa coluna da matriz
                if(busca == matriz[i] [j]){
                    System.out.println("O número procurado está na linha "+(i+1)+" coluna "+ (j+1));
                    System.out.println(matriz[i][j]);
                }
            }
        }

        for (int i = 0; i < linha; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna; j++) {//representa coluna da matriz
                if(matriz [i] [j] % 2 == 0){
                    contadorp++;
                }else{
                    contadori++;
                }
            }
        }
        System.out.println("A matriz contém "+ contadorp+" números pares e "+contadori+ " números ímpares");
    }
}
