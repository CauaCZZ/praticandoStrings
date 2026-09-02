package br.com.praticaJava.MaiusculasMinusculas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = leitura.nextLine();

        String textoEmMaiusculo = texto.toUpperCase(); // método para deixar o texto em Maiúculo
        String textoEmMinusculo = texto.toLowerCase(); // método para deixar o texto em Minusculo

        System.out.println("Texto em maiúsculas: " + textoEmMaiusculo);
        System.out.println("Texto em minúsculas: " + textoEmMinusculo);

        leitura.close();
    }
}
