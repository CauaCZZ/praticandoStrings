package br.com.praticaJava.ValidarCodigoReferencia;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o código de referência: ");
        String codigo = leitura.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$"); // padrão proposto
        Matcher matcher = pattern.matcher(codigo); //percorre e analisa

        if (matcher.matches()) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência está inválido.");
        }

        leitura.close();
    }
}
