package br.com.praticaJava.ExtrairHashtags;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = leitura.nextLine();

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        ArrayList<String> hashtags = new ArrayList<>(); // criando uma lista para armazenas os hashtags

        while (matcher.find()) { //analisa se tem alguma ocorrência de padrão
            hashtags.add(matcher.group()); // adiciona a lista a hashtag encontrada
        }

        if (hashtags.isEmpty()) { // verifica se a lista está vazia
            System.out.println("Nenhuma hashtag encontrada no texto.");
        } else {
            System.out.println("Hashtags encontradas: " + String.join(", ", hashtags)); // justa os elementos da lista em uma String
        }

        leitura.close();
    }
}
