package br.com.praticaJava.FormatarValorMonetario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double valor = leitura.nextDouble();

        System.out.printf("Valor formatado: R$ %.2f", valor); // formatando valor
    }
}
