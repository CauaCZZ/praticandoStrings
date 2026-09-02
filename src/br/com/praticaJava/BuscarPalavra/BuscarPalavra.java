package br.com.praticaJava.BuscarPalavra;

import java.util.Scanner;

public class BuscarPalavra {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = leitura.nextLine();

        System.out.print("Digite a palavra: ");
        String palavra = leitura.nextLine();

        if (texto.contains(palavra)) {
            System.out.printf("A palavra \"%s\" está presente no texto.", palavra);
        } else {
            System.out.printf("A palavra \"%s\" não está presente no texto.", palavra);
        }

        leitura.close();
    }

}
