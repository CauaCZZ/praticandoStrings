package br.com.praticaJava.TrimNome;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o nome:");
        String nome = leitura.nextLine();

        String nomeLimpo = nome.trim(); // método para remover espaços em branco
        System.out.println("Nome sem espaços: " + nomeLimpo);
        leitura.close();
    }
}
