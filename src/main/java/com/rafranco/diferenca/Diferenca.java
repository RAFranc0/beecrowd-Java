package com.rafranco.diferenca;

/*
* Enunciado:
* Leia quatro valores inteiros A, B, C e D.
* A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
* DIFERENCA = (A * B - C * D).
* */

import com.rafranco.utils.ScannerUtils;

public class Diferenca {
    public static void main(String[] args) {
        int a, b, c, d, resultadoDaDiferenca;

        System.out.println("Digite os 4 números:");
        a = ScannerUtils.lerInt();
        b = ScannerUtils.lerInt();
        c = ScannerUtils.lerInt();
        d = ScannerUtils.lerInt();

        resultadoDaDiferenca = (a * b) - (c * d);

        System.out.printf("DIFERENCA = %d", resultadoDaDiferenca);
    }
}
