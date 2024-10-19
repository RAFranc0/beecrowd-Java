package com.rafranco.somasimples;

import com.rafranco.utils.ScannerUtils;

/*
* Enunciado:
* Leia dois valores inteiros, no caso para variáveis A e B.
* A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
*  */

public class SomaSimples
{
    public static void main(String[] args) {
        int a, b, soma;
        System.out.print("Primeiro número: ");
        a = ScannerUtils.lerInt();

        System.out.print("Segundo número: ");
        b = ScannerUtils.lerInt();

        soma = a + b;

        System.out.printf("SOMA = %d", soma);
    }
}
