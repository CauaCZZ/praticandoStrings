package br.com.praticaJava.SubstituirPalavra;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = leitura.nextLine();

        System.out.print("Digite a palavra a ser susbtituída: ");
        String palavra = leitura.nextLine();

        if (!texto.contains(palavra)) { // método que verifica dentro do textp alguma palavra chave
            System.out.println("Palavra não encontrada no texto!");
            leitura.close();
            return;
        }

        System.out.print("Digite a nova palavra: ");
        String novaPalavra = leitura.nextLine();

        String textoModificado = texto.replace(palavra, novaPalavra); //método que troca os termos (palavra antiga, palavra nova)
        System.out.println("Texto modificado: " + textoModificado);

        leitura.close();
    }
}
