package br.com.praticaJava.ValidarCpf;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        String validadorCpf = leitura.nextLine();

        Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(validadorCpf);

        if (matcher.matches()) {
            System.out.printf("O CPF %s está no formato válido.", validadorCpf);
        } else {
            System.out.printf("O CPF %s está no formato inválido.", validadorCpf);
        }
    }
}
