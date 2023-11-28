import java.util.Scanner;

public class matrizop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];

        System.out.println("Informe os elementos da matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Informe os elementos da matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite um número para ser um escalar: ");
        a= scanner.nextInt();
        
        System.out.println("A matriz 1 é: ");
        imprimirMatriz(matriz1);
        System.out.println("A matriz 2 é: ");
        imprimirMatriz(matriz2);

        System.out.println("A soma da Matriz 1 é: " + calcularSomaMatriz(matriz1));
        System.out.println("A soma da Matriz 2 é: " + calcularSomaMatriz(matriz2));

         if(calcularSomaMatriz(matriz1)>calcularSomaMatriz(matriz2)){
            System.out.println("A soma da Matriz 1 é maior que a Matriz 2: ");}
        else if (calcularSomaMatriz(matriz2)>calcularSomaMatriz(matriz1)){
            System.out.println("A soma da Matriz 2 é maior que a Matriz 1: ");}
        else{
            System.out.println("As somas são iguais!");}
        
        int soma = calcularSomaMatriz(matriz1) + calcularSomaMatriz(matriz2);
        System.out.println("A soma da matriz 1 com a 2 é: " + soma);
        System.out.println("A multiplicação da matriz 1 por escalar é: "); 
        multiplicacaoescalar(matriz1, a);
        System.out.println("A multiplicação da matriz 2 por escalar é: "); 
        multiplicacaoescalar(matriz2, a);

        //double det1 = calcularmultiDiagonalprincipal(matriz1)-calcularmultiDiagonalsecundaria(matriz1);
        //double det2 = calcularmultiDiagonalprincipal(matriz2)- calcularmultiDiagonalsecundaria(matriz2);

        System.out.println("O Determinante da matriz 1 é: " + calcularDeterminante(matriz1)); 
        System.out.println("O Determinante da matriz 2 é: " + calcularDeterminante(matriz2)); 

        System.out.println("Digite 0 para sair do código");
        if (true){
           System.exit(0) ;
        }

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

    public static void multiplicacaoescalar(int[][] matriz, int a){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int multi=matriz[i][j]*a;
                System.out.print(multi);
            }
            System.out.println();
        }
    }
    

    public static int calcularDeterminante(int[][] matriz){
        int determinante = 0; 
        int cofatores[][] = new int[2][2];
        int sinal = 1;
    }

        /*public static double calcularmultiDiagonalprincipal(int[][] matriz) {
        int mult1=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) 
            mult1= matriz[i][j] * matriz[i][j] ;}
        
        return mult1;
    }

        public static double calcularmultiDiagonalsecundaria(int[][] matriz) {
        int mult2=0;

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) 
            mult2= matriz[i][j] * matriz[i][j] ;}

        return mult2;
    }*/

}