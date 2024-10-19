package com.rafranco.produtosimples;

import com.rafranco.utils.ScannerUtils;

/*Enunciado:
* Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores
* e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.
* */

public class ProdutoSimples {
    public static void main(String[] args) {
        int a, b, produto;

        System.out.print("Primeiro número: ");
        a = ScannerUtils.lerInt();

        System.out.print("Segundo número: ");
        b = ScannerUtils.lerInt();

        produto = a * b;

        System.out.printf("PROD = %d", produto);
    }
}
