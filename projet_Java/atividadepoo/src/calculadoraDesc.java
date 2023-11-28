/* Exercício 5 – Classe DescontoIR: Desenvolva um programa em Java que permita calcular de maneira eficiente os
descontos do Imposto de Renda e fornecer o salário líquido a partir de um valor de salário bruto
informado. A saída deve ser apresentada de maneira clara no console ou em uma janela.

* Aluno: Ana Clara – Matricula: 20220006250
* Aluno: Gleice heloise – Matricula: 20220070860

*/
import java.util.Scanner; 

public class calculadoraDesc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();
        double descontoImposto = calcularDescontoImposto(salarioBruto);
        double salarioLiquido = salarioBruto - descontoImposto;
        
        System.out.println("- Desconto do Imposto de Renda: R$ " + descontoImposto);
        System.out.println("- Salário líquido: R$ " + salarioLiquido);
        
        scanner.close();
    }
    
    public static double calcularDescontoImposto(double salarioBruto) {
        if (salarioBruto <= 1903.98) {
            return 0;
        } else if (salarioBruto <= 2826.65) {
            return salarioBruto * 0.075 - 354.80;
        } else if (salarioBruto <= 3751.05) {
            return salarioBruto * 0.15 - 354.80;
        } else if (salarioBruto <= 4664.68) {
            return salarioBruto * 0.225 - 636.13;
        } else {
            return salarioBruto * 0.275 - 869.36;
        }
    }
}