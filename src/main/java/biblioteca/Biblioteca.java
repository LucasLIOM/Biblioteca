package Biblioteca.src.main.java.biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Biblioteca {

    private ArrayList<Livro> listLivro = new ArrayList<>();
    private ArrayList<Usuario> listUsuario = new ArrayList<>();
    private Mensagens mensagem = new Mensagens();
    private int idLivro = 0;
    private int idUsuario = 0;

    // LIVROS ===============================================================

    // Cadastra o livro
    public void cadastrarLivro(String titulo, String descricao, String autor, String dataPublicacao) {
        int novoIdLivro = criarIdLivro();
        if (!isCadastroLivro(novoIdLivro)) {
            mensagem.livroCadastrado(novoIdLivro, titulo, descricao, dataPublicacao, autor);
            listLivro.add(new Livro(novoIdLivro, titulo, descricao, dataPublicacao, autor));
        }
    }

    // Busca o indice i e remove caso id seja igual ao que usuario digitar
    public void removerLivro(int id) {
        if (!isCadastroLivro(id)) {
            mensagem.livroNaoEncontrado();
        } else {

            for (int i = 0; i < listLivro.size(); i++) {
                if (listLivro.get(i).getIdLivro() == id) {
                    listLivro.remove(i);
                    break;
                }
            }
        }
    }

    // Lista todos os livros cadastrados
    public void listarLivro() {

        if (listLivro.isEmpty()) {
            mensagem.livroNaoCadastrado();
        } else {
            StringBuilder sb = new StringBuilder();

            for (Livro l : listLivro) {
                sb.append("ID: " + l.getIdLivro() + "\n")
                        .append("Titulo: " + l.getTitulo() + "\n")
                        .append("Descricao: " + l.getDescricao() + "\n")
                        .append("Data de Publicação: " + l.getDataPublicacao() + "\n")
                        .append("Autor: " + l.getAutor() + "\n\n");
            }

            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    // Verifica se existe livro pelo ID
    public boolean isCadastroLivro(int id) {
        for (Livro l : listLivro) {
            if (l.getIdLivro() == id) {
                return true;
            }
        }
        return false;
    }

    // USUARIOS ===============================================================
    // Utiliza-se os mesmos principios de cadastro e remoção

    public void cadastrarUsuario(String login, String senha, String telefone) {
        int novoIdUsuario = criarIdUsuario();
        if (!isCadastroLivro(novoIdUsuario)) {
            mensagem.usuarioCadastrado(novoIdUsuario, login, senha, telefone);
            listUsuario.add(new Usuario(novoIdUsuario, login, senha, telefone));
        }
    }

    public void removerUsuario(int id) {
        if (!isCadastroUsuario(id)) {
            mensagem.usuarioNaoEncontrado();
        } else {
            for (int i = 0; i < listUsuario.size(); i++) {
                if (listUsuario.get(i).getIdUsuario() == id) {
                    listUsuario.remove(i);
                    break;
                }
            }
        }
    }

    public void listarUsuario() {

        if (listUsuario.isEmpty()) {
            mensagem.usuarioNaoCadastrado();
        } else {
            StringBuilder sb = new StringBuilder();

            for (Usuario u : listUsuario) {
                sb.append("ID: " + u.getIdUsuario() + "\n")
                        .append("Login: " + u.getLogin() + "\n")
                        .append("Senha: " + u.getSenha() + "\n")
                        .append("Telefone: " + u.getTelefone() + "\n");
            }

            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }
    
    public boolean isCadastroUsuario(int id) {
        for (Usuario u : listUsuario) {
            if (u.getIdUsuario() == id) {
                return true;
            }
        }
        return false;
    }

    // Gera um id pro livro
    public int criarIdLivro() {
        return ++idLivro;
    }

    // Gera um id pro usuario
    public int criarIdUsuario() {
        return ++idUsuario;
    }
}