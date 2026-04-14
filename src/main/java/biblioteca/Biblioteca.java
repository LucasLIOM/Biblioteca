package Biblioteca.src.main.java.biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Biblioteca {

    private ArrayList<Livro> listLivro = new ArrayList<>();
    private int id = 0;

    // Cadastra o livro
    public void cadastrarLivro(String titulo, String descricao, String autor, String dataPublicacao) {

        int novoId = criarId();
        String mensagem = "╭────────── • ◆ • ──────────╮\n"
                + "Livro cadastrado com sucesso!\n"
                + "╰────────── • ◆ • ──────────╯\n"
                + "◆ " + novoId + "\n"
                + "◆ " + titulo + "\n"
                + "◆ " + descricao + "\n"
                + "◆ " + autor + "\n"
                + "◆ " + dataPublicacao;

        if (!isCadastro(novoId)) {
            JOptionPane.showMessageDialog(null, mensagem);
            listLivro.add(new Livro(novoId, titulo, descricao, dataPublicacao, autor));
        }
    }

    public void removerLivro(int id) {

        if (!isCadastro(id)) {
            throw new IllegalArgumentException("Não existe nenhum livro com esse ID.");
        }

        for (int i = 0; i < listLivro.size(); i++) {
            if (listLivro.get(i).getId() == id) {
                listLivro.remove(i);
                break;
            }
        }
    }

    // Lista todos os livros cadastrados
    public void listarLivro() {

        if (listLivro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum livro foi cadastrado.");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (Livro l : listLivro) {
            sb.append("ID: " + l.getId() + "\n")
              .append("Titulo: " + l.getTitulo() + "\n")
              .append("Descricao: " + l.getDescricao() + "\n")
              .append("Data de Publicação: " + l.getDataPublicacao() + "\n")
              .append("Autor: " + l.getAutor() + "\n\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Verifica se existe livro pelo ID
    public boolean isCadastro(int id) {
        for (Livro l : listLivro) {
            if (l.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Gera um id
    public int criarId() {
        return ++id;
    }
}