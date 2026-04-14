package Biblioteca.src.main.java.biblioteca;

import javax.swing.JOptionPane;

public class Mensagens {
    Biblioteca biblioteca;

     // MENUS ===============================================================
     
    public String menuPrincipal() {
        String menuPrincipal = "╭────────── • ◆ • ──────────╮\n"
                + "BOAS VINDAS À BIBLIOTECA ONLINE\n"
                + "╰────────── • ◆ • ──────────╯\n"
                + "❰1❱ - Menu dos Usuários\n"
                + "❰2❱ - Menu dos Livros\n"
                + "❰3❱ - Listar usuários\n"
                + "❰0❱ - Sair\n";
        return menuPrincipal;
    }

    public String menuLivro() {
        String menuLivro = "╭────────── • ◆ • ──────────╮\n"
                + "         MENU DE LIVROS\n"
                + "╰────────── • ◆ • ──────────╯\n"
                + "❰1❱ - Cadastrar livro\n"
                + "❰2❱ - Deletar livro\n"
                + "❰3❱ - Listar livros\n"
                + "❰0❱ - Menu inicial\n";
        return menuLivro;
    }

    public String menuUsuario() {
        String menuUsuario = "╭────────── • ◆ • ──────────╮\n"
                + "        MENU DE USUÁRIOS\n"
                + "╰────────── • ◆ • ──────────╯\n"
                + "❰1❱ - Cadastrar usuário\n"
                + "❰2❱ - Emprestar livro ao usuário\n"
                + "❰3❱ - Deletar usuário\n"
                + "❰0❱ - Menu inicial\n";
        return menuUsuario;
    }

    // LIVROS ===============================================================

    public String livroCadastrado(int novoIdLivro, String titulo, String descricao, String dataPublicacao,
            String autor) {
        String mensagem = "【✔】 Livro cadastrado com sucesso!\n"
                + "\n"
                + "◆ " + novoIdLivro + "\n"
                + "◆ " + titulo + "\n"
                + "◆ " + descricao + "\n"
                + "◆ " + dataPublicacao + "\n"
                + "◆ " + autor;
        JOptionPane.showMessageDialog(null, mensagem);
        return mensagem;
    }

    public String livroNaoEncontrado() {
        String mensagem = "【✘】Não existe nenhum livro com esse ID.";
        JOptionPane.showMessageDialog(null, mensagem);
        return mensagem;
    }

    public String livroNaoCadastrado() {
        String mensagem = "【✘】Nenhum livro foi cadastrado.";
        JOptionPane.showMessageDialog(null, mensagem);
        return mensagem;
    }


    // USUARIOS ===============================================================

    public String usuarioCadastrado(int novoIdUsuario, String login, String senha, String telefone) {
        String hideSenha = "*".repeat(senha.length());
        String mensagem = "╭────────── • ◆ • ──────────╮\n"
                + "Usuario cadastrado com sucesso!\n"
                + "╰────────── • ◆ • ──────────╯\n"
                + "◆ " + novoIdUsuario + "\n"
                + "◆ " + login + "\n"
                + "◆ " + hideSenha + "\n"
                + "◆ " + telefone + "\n";
        JOptionPane.showMessageDialog(null, mensagem);
        return mensagem;
    }

    public String usuarioNaoEncontrado() {
        String mensagem = "【✘】Não foi possivel encontrar o usuario com esse ID.";
        JOptionPane.showMessageDialog(null, mensagem);
        return mensagem;
    }

    public String usuarioNaoCadastrado() {
        String mensagem = "【✘】Nenhum usuário foi cadastrado.";
        JOptionPane.showMessageDialog(null, mensagem);
        return mensagem;
    }

    public String whichLogin() {
        return "Crie seu login:";
    }

    public String whichSenha() {
        return "Crie sua senha:";
    }

    public String whichTelefone() {
        return "Telefone:";
    }
}
