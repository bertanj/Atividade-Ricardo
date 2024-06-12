package Atividades;

import java.util.Scanner;

public class AttMatriz2 {
    public static void main(String[] args) {
        int linha1, coluna1, linha2,coluna2;
        int soma1 = 0, soma2 = 0, results,mult1 = 1,mult2 = 1, resultm;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a dimensão de sua matriz 1 (linha):");
        linha1 = scanner.nextInt();
        System.out.println("Digite a dimensão de sua matriz 1 (coluna):");
        coluna1 = scanner.nextInt();

        //Matriz 1 começa aqui
        int[][] matriz1 = new int[linha1][coluna1];

        for (int i = 0; i < linha1; i++) {
            for (int j = 0; j < coluna1; j++) {
                System.out.println("Preencha os valores da matriz 1. Qual será o valor da linha " + (i + 1) + " coluna " + (j + 1) + "?");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < linha1; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna1; j++) {//representa coluna da matriz
                System.out.print(matriz1[i][j]);
            }
            System.out.println();
        }
        //Termina aqui

        System.out.println("Digite a dimensão de sua matriz 2 (linha):");
        linha2 = scanner.nextInt();
        System.out.println("Digite a dimensão de sua matriz 2 (coluna):");
        coluna2 = scanner.nextInt();

        //Matriz 2 começa aqui
        int[][] matriz2 = new int[linha2][coluna2];

        for (int i = 0; i < linha2; i++) {
            for (int j = 0; j < coluna2; j++) {
                System.out.println("Preencha os valores da matriz 2. Qual será o valor da linha " + (i + 1) + " coluna " + (j + 1) + "?");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < linha2; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna2; j++) {//representa coluna da matriz
                System.out.print(matriz2[i][j]);
            }
            System.out.println();
        }
        //Termina aqui

        //Soma das matrizes

        //Soma matriz 1
        for (int i = 0; i < linha1; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna1; j++) {//representa coluna da matriz
                soma1+= matriz1[i][j];
            }
        }
        System.out.println("A soma dos valores da primeira matriz é igual a: "+soma1);
        //Fim soma matriz 1

        //Soma matriz 2
        for (int i = 0; i < linha2; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna2; j++) {//representa coluna da matriz
                soma2+= matriz2[i][j];
            }
        }
        System.out.println("A soma dos valores da segunda matriz é igual a: "+soma2);
        //Fim soma matriz 2

        //Soma das duas matrizes
        results = soma1 + soma2;
        System.out.println("A soma das duas matrizes tem o valor de: "+results);

        //Multiplicação matriz 1
        for (int i = 0; i < linha1; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna1; j++) {//representa coluna da matriz
                mult1*= matriz1[i][j];
            }
        }
        System.out.println("A multiplicação dos valores da primeira matriz é igual a: "+mult1);
        //Fim multiplicação matriz 1

        //Multiplicação matriz 2
        for (int i = 0; i < linha2; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna2; j++) {//representa coluna da matriz
                mult2*= matriz2[i][j];
            }
        }
        System.out.println("A multiplicação dos valores da segunda matriz é igual a: "+mult2);
        //Fim multiplicação matriz 2

        //multiplicação das duas matrizes
        resultm = mult1 * mult2;
        System.out.println("A multiplicação das duas matrizes tem o valor de: "+resultm);

        //Exibindo valores par da matriz 1
        System.out.println("Exibindo valores par da matriz 1");
        for (int i = 0; i < linha1; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna1; j++) {//representa coluna da matriz
                if(matriz1 [i] [j] % 2 == 0){
                    System.out.print(matriz1[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //Fim

        //Exibindo valores par da matriz 2
        System.out.println("Exibindo valores par da matriz 2");
        for (int i = 0; i < linha2; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna2; j++) {//representa coluna da matriz
                if(matriz2 [i] [j] % 2 == 0){
                    System.out.print(matriz2[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //fim

        //Exibindo valores impar da matriz 1
        System.out.println("Exibindo valores ímpar da matriz 1");
        for (int i = 0; i < linha1; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna1; j++) {//representa coluna da matriz
                if(matriz1 [i] [j] % 2 == 0){
                    System.out.print(" ");
                }else{
                    System.out.print(matriz1[i][j]);
                }
            }
            System.out.println();
        }
        //fim

        //Exibindo valores impar da matriz 2
        System.out.println("Exibindo valores ímpar da matriz 2");
        for (int i = 0; i < linha2; i++) {//representa a linha da matriz
            for (int j = 0; j < coluna2; j++) {//representa coluna da matriz
                if(matriz2 [i] [j] % 2 == 0){
                    System.out.print(" ");
                }else{
                    System.out.print(matriz2[i][j]);
                }
            }
            System.out.println();
        }
        //fim
    }
}