package notas;
import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class MediaNotas {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler dados do teclado (entrada do usuário)
        Scanner scanner = new Scanner(System.in);

        // Variável para acumular a soma das notas
        double soma = 0;
        // Quantidade fixa de notas que serão lidas
        int quantidadeNotas = 5;

        System.out.println("Digite as " + quantidadeNotas +  " Notas do Aluno:");

        // Estrutura de repetição para ler todas as notas
        for (int i = 1; i <= quantidadeNotas; i++) {
            // Solicita a nota atual
            System.out.println("Nota " + i + ": ");
            double nota = scanner.nextDouble(); // LÊ a nota digitada

            //Validação para não permitir notas inválidas
            while (nota < 0 || nota > 10) {
                  System.out.println("Nota inválida digite novamente (0 a 10");
                        nota = scanner.nextDouble();
             }
            // Adiciona a nota válida à soma
             soma += nota;
        }
        // Calcula a média dividindo a soma pelo número de notas
        double media = soma / quantidadeNotas;
        System.out.println("A media das nota é: " + media);
        
        if (media >= 7) {
            System.out.println("Aluno Aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno de Recuperação");
        } else {
            System.out.println("Aluno Reprovado.");
        }
        scanner.close();
    }
}
