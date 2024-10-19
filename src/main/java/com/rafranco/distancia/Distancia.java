package com.rafranco.distancia;

    /*
    *Enunciado:
    * Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h
    * e o carro Y sai com velocidade constante de 90 Km/h.
    *
    * Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja,
    * consegue se afastar um quilômetro a cada 2 minutos.
    *
    * Leia a distância (em Km) e calcule quanto tempo leva (em minutos)
    * para o carro Y tomar essa distância do outro carro.
    */

import com.rafranco.utils.ScannerUtils;

public class Distancia {
    public static void main(String[] args) {
        int distanciaEntreOsCarros, tempoParaTomarADistancia;

        System.out.println("Digite a distancia entre os carros: ");
        distanciaEntreOsCarros = ScannerUtils.lerInt();

        tempoParaTomarADistancia = distanciaEntreOsCarros * 2;

        System.out.printf("O carro Y leva %d minutos para tomar essa distancia do carro X", tempoParaTomarADistancia);
    }
}
