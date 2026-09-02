package br.com.praticaJava.RemoverExtensaoArquivo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String arquivo = leitura.nextLine();

        int posicaoPonto = arquivo.lastIndexOf("."); // retorna a posição da última ocorrência do caractere
        if(posicaoPonto != -1) {
            String nomeArquivo = arquivo.substring(0, posicaoPonto);// extrai os caracteres que estão dentro dos intervalods dos índices informados
            System.out.println("Nome do arquivo sem extensão: " + nomeArquivo);
        } else {
            System.out.println("O arquivo que mandou não possui extensão.");
        }
        leitura.close();
    }
}
