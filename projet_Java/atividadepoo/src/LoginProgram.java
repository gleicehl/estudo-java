/* Exercício 6 – Classe ValidacaoSenha. Desenvolva um programa em Java que assegure a segurança do acesso por
meio da verificação de nome de usuário e senha. O programa deve ser implementado de forma a
garantir que a senha não seja igual ao nome de usuário. Caso ocorra essa coincidência, o programa
deve exibir uma mensagem de erro e solicitar novamente as informações de nome de usuário e senha.
Além disso, a senha deve atender aos requisitos de ter pelo menos uma letra maiúscula, uma letra
minúscula e um número. A senha deve ter no mínimo 8 caracteres. Se a senha não cumprir esses
critérios, uma mensagem de erro também é exibida.

* Aluno: Ana Clara – Matricula: 20220006250
* Aluno: Gleice heloise – Matricula: 20220070860

*/

import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username, password;

        while (true) {
            System.out.println("Informe o nome de usuário: ");
            username = scanner.nextLine();

            System.out.println("Informe a senha: ");
            password = scanner.nextLine();

            if (!isPasswordValid(username, password)) {
                System.out.println("Erro: A senha não atende aos requisitos.");
            } else if (password.equals(username)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário.");
            } else {
                System.out.println("Login bem-sucedido!");
                break;
            }
        }

        scanner.close();
    }

    public static boolean isPasswordValid(String username, String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasNumber;
    }
}
