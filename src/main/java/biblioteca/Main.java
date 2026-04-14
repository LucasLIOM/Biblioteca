package Biblioteca.src.main.java.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();
        

        biblioteca.listarLivro();
        biblioteca.cadastrarLivro("Harry Potter", "Mundo de fantasias e magias", "J.K. Rolling", "26.06.1997");
        biblioteca.listarLivro();
        biblioteca.cadastrarLivro("Cronicas de Gelo e Fogo", "Mundo de fantasias e magias", "George R.R. Martin", "06.08.1996");
        biblioteca.listarLivro();
        biblioteca.removerLivro(1);
        biblioteca.listarLivro();
        biblioteca.cadastrarLivro("As Crônicas de Nárnia", "Mundo de fantasias", "C.S. Lewis", "16.10.1950");
        biblioteca.listarLivro();
    }
}
