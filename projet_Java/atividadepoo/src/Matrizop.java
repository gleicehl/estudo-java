/* Exercício 4 - Classe OperacaoMatriz: Faça um programa em Java que leia todos os elementos de uma matriz
4x4. O programa principal deverá chamar e apresentar o resultado de cada uma das funções abaixo.
A matriz deverá ser passada como parâmetro de cada função.

* Aluno: Ana Clara – Matricula: 20220006250
* Aluno: Gleice heloise – Matricula: 20220070860

*/

import java.util.Scanner;

public class Matrizop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Informe os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("A matriz: ");
        imprimirMatriz(matriz);

        System.out.println("Média abaixo da diagonal: " + calcularMediaAbaixoDiagonal(matriz));
        System.out.println("Soma acima da diagonal: " + calcularSomaAcimaDiagonal(matriz));
        System.out.println("Média diagonal principal: " + calcularMediaDiagonalPrincipal(matriz));
        System.out.println("Menor elemento: " + encontrarMenorElemento(matriz));
        System.out.println("Soma de todos os elementos: " + calcularSomaMatriz(matriz));

        scanner.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static double calcularMediaAbaixoDiagonal(int[][] matriz) {
        double soma = 0;
        int elementos = 0;

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                soma += matriz[i][j];
                elementos++;
            }
        }

        return soma / elementos;
    }

    public static int calcularSomaAcimaDiagonal(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }

    public static double calcularMediaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }

        return (double) soma / matriz.length;
    }

    public static int encontrarMenorElemento(int[][] matriz) {
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return menor;
    }

    public static int calcularSomaMatriz(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }
}
