import java.util.Scanner;

public class matrizop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];

        System.out.println("Informe os elementos da matriz 1, 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Informe os elementos da matriz 2, 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("A matriz 1 impressa é: ");
        imprimirMatriz(matriz1);

        System.out.println("A matriz 1 impressa é: ");
        imprimirMatriz(matriz2);

        float somamatriz= calcularSomaMatriz(matriz1) + calcularSomaMatriz(matriz2);
        System.out.println("A soma das matrizes é: " + somamatriz);

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