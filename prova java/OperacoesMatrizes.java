// Aluno: Ana Clara – Matricula: 20220006250
// Aluno: Gleice Heloise – Matricula: 20220070860

import java.util.Scanner;

public class OperacoesMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a ordem das matrizes (N): ");
        int N = scanner.nextInt();
        int[][] matrizA = new int[N][N];
        int[][] matrizB = new int[N][N];
        System.out.println("Digite os elementos da matriz A:");
        lerMatriz(scanner, matrizA);
        System.out.println("Digite os elementos da matriz B:");
        lerMatriz(scanner, matrizB);
        int opcao;
        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1- Soma das matrizes");
            System.out.println("2- Multiplicação por um escalar (ambas as matrizes)");
            System.out.println("3- Determinante (ambas as matrizes)");
            System.out.println("4- Soma dos elementos de cada matriz indicando qual a de maior soma");
            System.out.println("5- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    int[][] soma = somaMatrizes(matrizA, matrizB);
                    System.out.println("Soma das matrizes:");
                    imprimirMatriz(soma);
                    break;
                case 2:
                    System.out.print("Digite o escalar: ");
                    int escalar = scanner.nextInt();
                    int[][] matrizAescalada = multiplicarPorEscalar(matrizA, escalar);
                    int[][] matrizBescalada = multiplicarPorEscalar(matrizB, escalar);
                    System.out.println("Matriz A multiplicada por " + escalar + ":");
                    imprimirMatriz(matrizAescalada);
                    System.out.println("Matriz B multiplicada por " + escalar + ":");
                    imprimirMatriz(matrizBescalada);
                    break;
                case 3:
                    int determinanteA = calcularDeterminante(matrizA);
                    int determinanteB = calcularDeterminante(matrizB);
                    System.out.println("Determinante da matriz A: " + determinanteA);
                    System.out.println("Determinante da matriz B: " + determinanteB);
                    break;
                case 4:
                    int somaA = calcularSomaMatriz(matrizA);
                    int somaB = calcularSomaMatriz(matrizB);
                    System.out.println("Soma dos elementos da matriz A: " + somaA);
                    System.out.println("Soma dos elementos da matriz B: " + somaB);
                    if (somaA > somaB) {
                        System.out.println("A matriz A tem a maior soma.");
                    } else if (somaB > somaA) {
                        System.out.println("A matriz B tem a maior soma.");
                    } else {
                        System.out.println("As matrizes têm a mesma soma.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
        scanner.close();
    }

    public static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] somaMatrizes(int[][] matrizA, int[][] matrizB) {
        int N = matrizA.length;
        int[][] resultado = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    public static int[][] multiplicarPorEscalar(int[][] matriz, int escalar) {
        int N = matriz.length;
        int[][] resultado = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }
        return resultado;
    }

    public static int calcularDeterminante(int[][] matriz) {
        // Implemente aqui o cálculo do determinante de uma matriz quadrada.
        // Este é um exemplo simplificado, e não trata todos os casos.
        int N = matriz.length;
        if (N == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        } else {
            System.out.println("Cálculo de determinante não implementado para matrizes maiores que 2x2.");
            return 0;
        }
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
