package com.rafranco.mediadois;

/*
* Enunciado:
* Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
* A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
* Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
* */

import com.rafranco.utils.ScannerUtils;

public class MediaDois {
    public static void main(String[] args) {
        double notaA, notaB, notaC, mediaDoAluno;

        System.out.println("Digite as 3 notas: ");

        notaA = ScannerUtils.lerDouble() * 2;
        notaB = ScannerUtils.lerDouble() * 3;
        notaC = ScannerUtils.lerDouble() * 5;

        mediaDoAluno = (notaA + notaB + notaC) / (2 + 3 + 5);

        System.out.printf("MEDIA = %.1f", mediaDoAluno);


    }
}
