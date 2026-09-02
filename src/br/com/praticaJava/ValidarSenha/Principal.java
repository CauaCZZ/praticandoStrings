package br.com.praticaJava.ValidarSenha;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = leitura.nextLine();

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$");
        // (?=.*[A-Z]) -> exige uma letra maiúscula
        // (?=.*[a-z]) -> exige uma letra minúscula
        // (?=.*\d) -> exige um número
        // (?=.*[^A-Za-z0-9]) -> exige um caractere especial
        // .{8,} -> exige pelo menos 8 caracteres
        Matcher matcher = pattern.matcher(senha);

        if (matcher.matches()) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida");
        }

        leitura.close();
    }
}
