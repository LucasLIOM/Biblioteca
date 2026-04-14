package Biblioteca.biblioteca.service;

import Biblioteca.biblioteca.dao.LivroDAO;
import Biblioteca.biblioteca.model.Livro;

import java.util.List;

public class BibliotecaService {

    private LivroDAO livroDAO = new LivroDAO();

    public void cadastrarLivro(String t, String d, String a, String data) {
        Livro livro = new Livro(0, t, d, a, data);
        livroDAO.cadastrar(livro);
    }

    public void removerLivro(int id) {
        livroDAO.deletar(id);
    }

    public List<Livro> listarLivros() {
        return livroDAO.listar();
    }
}