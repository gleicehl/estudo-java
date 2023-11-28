/* Exercício 3 - Classe EquacaoSGrau. Faça um programa em Java que solicite ao usuário (como dados de entrada)
os coeficientes de uma equação do 2º grau e, como saída (janela ou prompt) forneça seu DELTA e
suas raízes (caso as possua).

* Aluno: Ana Clara – Matricula: 20220006250
* Aluno: Gleice heloise – Matricula: 20220070860

*/

import java.util.Scanner;

public class EquacaoSGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float coefA, coefB, coefC, delta;
        double raizdelta, raiz1, raiz2;

        System.out.println("Digite o coeficiente A: ");
        coefA = scanner.nextFloat();
        System.out.println("Digite o coeficiente B: ");
        coefB = scanner.nextFloat();
        System.out.println("Digite o coeficiente C: ");
        coefC = scanner.nextFloat();
        
        delta = (coefB * coefB) - (4 * coefA * coefC);

        if(coefA==0){
            System.out.println("O valor do Coeficiente A é 0, portando é uma equacao do 1º grau");
            System.out.println("Vamos calcular a raiz dessa equação do 1º grau....");
            raiz1=coefC/coefB;
            System.out.println("O valor da raiz é: " + raiz1);}
        else if(delta<0){
            System.out.println("O valor do Delta é: " + delta);
            System.out.println("Como o Delta é < 0, não possui raiz real");}
        else if(delta==0){
            System.out.println("O valor do Delta é = 0, possui apenas uma raiz real");
            System.out.println("Vamos calular sua raiz.....");
            raiz1= -(coefB)/(2*coefA); 
            System.out.println("A raiz é = "+ raiz1);}
        else if(delta>0){
            System.out.println("O valor do Delta é: " + delta);
            System.out.println("Possui duas raizes reais, Vamos calular suas raizes.....");
            raizdelta = Math.sqrt(delta);
            raiz1= -(coefB)+raizdelta/(2*coefA);
            raiz2= -(coefB)-raizdelta/(2*coefA); 
            System.out.println("A raiz 1 é: "+ raiz1);
            System.out.println("A raiz 2 é: "+ raiz2);}

        scanner.close();
    }
}