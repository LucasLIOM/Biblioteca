package Biblioteca.biblioteca;

import Biblioteca.biblioteca.service.BibliotecaService;

public class Main {
    public static void main(String[] args) {

        BibliotecaService service = new BibliotecaService();

        service.cadastrarLivro("Harru Potter", "Mundo de fantasias e magias", "J.K. Rolling", "1996");

        System.out.println(service.listarLivros());
    }
}