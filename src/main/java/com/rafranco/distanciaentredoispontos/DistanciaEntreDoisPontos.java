package com.rafranco.distanciaentredoispontos;

/*
* Enunciado:
* Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2)
* e calcule a distância entre eles, mostrando 4 casas decimais.
* */

import com.rafranco.utils.ScannerUtils;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        double xA, xB, yA, yB, distanciaEntreDoisPontos;

        System.out.println("Digite os valores de xA e yA: ");
        xA = ScannerUtils.lerDouble();
        yA = ScannerUtils.lerDouble();

        System.out.println("Agora digite os valores de xB e yB: ");
        xB = ScannerUtils.lerDouble();
        yB = ScannerUtils.lerDouble();

        distanciaEntreDoisPontos = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));

        System.out.printf("%.4f", distanciaEntreDoisPontos);
    }
}
