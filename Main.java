/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliacaon1;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Bruno <rbruno.10@hotmail.com>
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinaria arvore = new ArvoreBinaria();
        boolean continuar = true;

        // Loop para inserir valores
        while (continuar) {
            System.out.println("Insira um valor na árvore:");
            int valor = scanner.nextInt();
            arvore.inserirValor(valor);

            System.out.println("Deseja inserir outro valor? (1 = Sim, 2 = Não)");
            int escolha = scanner.nextInt();

            if (escolha == 2) {
                continuar = false;
            } else if (escolha != 1) {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        // Exibindo os resultados após a inserção dos valores
        System.out.println("Número de nós: " + arvore.contarNos(arvore.raiz));
        System.out.println("Número de nós folha: " + arvore.contarNosFolha(arvore.raiz));
        System.out.println("Número de nós não folha: " + arvore.contarNosNaoFolha(arvore.raiz));
        System.out.println("Grau da árvore: " + arvore.calcularGrau(arvore.raiz));

        scanner.close();
    }
}

