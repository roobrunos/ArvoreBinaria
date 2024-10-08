/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package avaliacaon1;

/**
 *
 * @author Rodrigo Bruno <rbruno.10@hotmail.com>
 * @date 08/10/2024
 * @brief Class ArvoreBinaria
 */
class ArvoreBinaria {
    No raiz;

    // Método para contar o número de nós
    public int contarNos(No no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.esquerdo) + contarNos(no.direito);
    }

    // Método para contar nós folha
    public int contarNosFolha(No no) {
        if (no == null) {
            return 0;
        }
        if (no.esquerdo == null && no.direito == null) {
            return 1;
        }
        return contarNosFolha(no.esquerdo) + contarNosFolha(no.direito);
    }

    // Método para contar nós não folha
    public int contarNosNaoFolha(No no) {
        if (no == null || (no.esquerdo == null && no.direito == null)) {
            return 0;
        }
        return 1 + contarNosNaoFolha(no.esquerdo) + contarNosNaoFolha(no.direito);
    }

    // Método para calcular o grau da árvore
    public int calcularGrau(No no) {
        if (no == null) {
            return 0;
        }

        int filhos = 0;
        if (no.esquerdo != null) {
            filhos++;
        }
        if (no.direito != null) {
            filhos++;
        }

        int grauEsquerdo = calcularGrau(no.esquerdo);
        int grauDireito = calcularGrau(no.direito);

        return Math.max(filhos, Math.max(grauEsquerdo, grauDireito));
    }

    // Método para inserir valores e criar nós na árvore
    public void inserirValor(int valor) {
        if (raiz == null) {
            raiz = new No(valor);
        } else {
            inserirNo(raiz, valor);
        }
    }

    // Método auxiliar para inserir nós na árvore
    private void inserirNo(No raiz, int valor) {
        if (valor < raiz.valor) {
            if (raiz.esquerdo != null) {
                inserirNo(raiz.esquerdo, valor);
            } else {
                raiz.esquerdo = new No(valor);
            }
        } else {
            if (raiz.direito != null) {
                inserirNo(raiz.direito, valor);
            } else {
                raiz.direito = new No(valor);
            }
        }
    }
}