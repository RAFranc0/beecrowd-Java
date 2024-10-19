package com.rafranco.consumo;

import com.rafranco.utils.ScannerUtils;

/*
* Enunciado:
* Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km)
* e o total de combustível gasto (em litros).
* */

public class Consumo {
    public static void main(String[] args) {
        int distanciaPercorridaEmKm;
        double combustivelGastoEmLitros, mediaDeConsumo;

        System.out.print("Qual a distância percorrida em KM: ");
        distanciaPercorridaEmKm = ScannerUtils.lerInt();

        System.out.print("Quantos litros de combustível foram gastos: ");
        combustivelGastoEmLitros = ScannerUtils.lerDouble();

        mediaDeConsumo = distanciaPercorridaEmKm / combustivelGastoEmLitros;

        System.out.printf("%.3f km/l", mediaDeConsumo);
    }
}
